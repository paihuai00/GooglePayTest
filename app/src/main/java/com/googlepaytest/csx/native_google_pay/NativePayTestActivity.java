package com.googlepaytest.csx.native_google_pay;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.googlepaytest.csx.github_google_pay.BillingManager;
import com.googlepaytest.csx.github_google_pay.GoogleAccsessTokenBean;
import com.googlepaytest.csx.github_google_pay.GooglePayPurchaseBean;
import com.googlepaytest.csx.github_google_pay.PurchaseAdapter;
import com.googlepaytest.csx.R;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;


/**
 * Date: 2019/8/14
 * create by cuishuxiang
 * description:
 * <p>
 * Api参考：https://developers.google.com/android-publisher/api-ref/purchases/products/get?hl=zh-cn
 * <p>
 * 使用 三方库，进行Google Pay 相关操作
 * ·
 */
public class NativePayTestActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "PayTestActivity";

    private Button btn_get_token;
    private Button btn_start_pay;
    private Button btn_query_all;
    private Button btn_query_info;
    private Button btn_consume;
    private Button btn_history;
    private Button btn_purchase_state;
    private Button btn_restore_sub;
    private Button btn_clean;
    private TextView tv_hint;
    private RecyclerView mRv;
    private PurchaseAdapter mAdapter;
    private TextView tv_title;
    private Gson gson = new Gson();

    private boolean isServerAvaliable = false;

    //校验需要用到这2个参数
    private String mProductId;
    private String mPurchaseToken;
    private String mDeveloperPayload;
    private String code = "4/qwGJ6-mtO5uQWBHC3WVAGeNHWqBX2t0gCpGwMuQBKtHkkdfxrxZba6M";//9.9号生成
    private String accessToken;
    private String refreshToken = "1/4JEiUYlT4nA1edcMHvV1qRMS9-O7NLjrbi7FtZ16aPE";//9.9号生成
    private String client_secret = "GErDLKY0ipw8EGJcouzH_jbu";
    private String client_id = "790140086566-9q9lfiir624fl248l7cshcqp3dicitl4.apps.googleusercontent.com";
    private String redirect_uris = "urn:ietf:wg:oauth:2.0:oob";
    private String purchaseId;
    private GooglePayPurchaseBean.InappproductBean curInappProductBean;//当前选择商品bean
    private Purchase curPurchase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_test_pay);

        initView();

        //1, 初始化 支付
        NativeBillingClientManager.init(this, new OnPurchaseCallBack() {
            @Override
            public void responseCode(int code) {
                Log.d(TAG, "responseCode:  code = " + code);
            }

            @Override
            public void onPaySuccess(List<Purchase> purchaseList) {
                Log.d(TAG, "onPaySuccess: " + purchaseList.toString());
                if (purchaseList != null && purchaseList.size() != 0) {
                    curPurchase = purchaseList.get(0);
                    mProductId = purchaseList.get(0).getSku();
                    mPurchaseToken = purchaseList.get(0).getPurchaseToken();
                }
            }

            @Override
            public void onUserCancel() {
                Log.d(TAG, "onUserCancel: ");
            }
        });


        Log.d(TAG, "onCreate: ");

        //判断Pay服务是否可用(连接是异步，所以推迟1s才去判断)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isServerAvaliable = NativeBillingClientManager.getServiceConnected();

                //服务可用，先调用一次,获取token
                if ((isServerAvaliable)) {
                    tv_hint.setText(tv_hint.getText() + "------服务链接成功，开始 获取token-------- ");
                    getToken();
                }
            }
        }, 1000);

    }

    private void initView() {
        btn_get_token = findViewById(R.id.btn_get_token);
        btn_get_token.setOnClickListener(this);
        btn_restore_sub = findViewById(R.id.btn_restore_sub);
        btn_restore_sub.setOnClickListener(this);
        btn_query_all = findViewById(R.id.btn_query_all);
        btn_query_all.setOnClickListener(this);
        btn_query_info = findViewById(R.id.btn_query_info);
        btn_query_info.setOnClickListener(this);
        btn_start_pay = findViewById(R.id.btn_start_pay);
        btn_start_pay.setOnClickListener(this);
        btn_consume = findViewById(R.id.btn_consume);
        btn_consume.setOnClickListener(this);
        btn_history = findViewById(R.id.btn_history);
        btn_history.setOnClickListener(this);
        btn_clean = findViewById(R.id.btn_clean);
        btn_clean.setOnClickListener(this);
        btn_purchase_state = findViewById(R.id.btn_purchase_state);
        tv_title = findViewById(R.id.tv_title);
        btn_purchase_state.setOnClickListener(this);
        tv_hint = findViewById(R.id.tv_hint);

        tv_title.setText("原生Billing，实现Google支付");

        mRv = findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mAdapter = new PurchaseAdapter();
        mRv.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                mAdapter.setChoosePosition(position);
                mAdapter.notifyDataSetChanged();
                purchaseId = mAdapter.getItem(position).getSku();
                curInappProductBean = mAdapter.getItem(position);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_token:
                tv_hint.setText(tv_hint.getText() + "\n\n------获取Token开始-------- ");
                getToken();
                break;
            case R.id.btn_query_all:
                tv_hint.setText(tv_hint.getText() + "\n\n------查询所有商品开始-------- ");
                getAllPurchase();
                break;
            case R.id.btn_query_info:
                if (TextUtils.isEmpty(mProductId)) {
                    Toast.makeText(this, "请先选择一个商品!", Toast.LENGTH_SHORT).show();
                    return;
                }
                tv_hint.setText(tv_hint.getText() + "\n\n点击查询商品详情： ");

                NativeBillingClientManager.queryInappDeatil(purchaseId, new SkuDetailsResponseListener() {
                    @Override
                    public void onSkuDetailsResponse(BillingResult billingResult, List<com.android.billingclient.api.SkuDetails> skuDetailsList) {
                        if (skuDetailsList!=null&&skuDetailsList.size()!=0)
                            tv_hint.setText(tv_hint.getText() + "\n\n查询商品详情为： " + skuDetailsList.get(0).toString());
                    }
                });
                break;
            case R.id.btn_start_pay:
                tv_hint.setText(tv_hint.getText() + "\n\n点击开始支付..... ");
                startPay();
                break;
            case R.id.btn_purchase_state://校验
                tv_hint.setText(tv_hint.getText() + "\n\n点击支付校验..... ");
                checkPurchase();
                break;
            case R.id.btn_consume:
                if (curPurchase==null) {
                    Toast.makeText(this, "消费不能为空，请先选择一个商品进行购买!", Toast.LENGTH_SHORT).show();
                    return;
                }

                tv_hint.setText(tv_hint.getText() + "\n\n 点击消费： " + purchaseId);

                 NativeBillingClientManager.consumeAsync(curPurchase, new ConsumeResponseListener() {
                    @Override
                    public void onConsumeResponse(BillingResult billingResult, String purchaseToken) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                            showToast("消费成功！");
                        } else {
                            showToast("消费失败！");
                        }
                    }
                });

                break;
            case R.id.btn_history:
                tv_hint.setText(tv_hint.getText() + "\n\n 点击获取购买记录----- ");

                NativeBillingClientManager.queryPurchaseHistoryAsync(BillingClient.SkuType.INAPP, new PurchaseHistoryResponseListener() {
                    @Override
                    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> purchaseHistoryRecordList) {
                        for (int i = 0; i < purchaseHistoryRecordList.size(); i++) {
                            tv_hint.setText(tv_hint.getText() + "\n\n购买记录： " + purchaseHistoryRecordList.get(i).toString());
                        }
                    }
                });
                break;
            case R.id.btn_clean:
                tv_hint.setText("");
                break;
            case R.id.btn_restore_sub:
//                boolean restore = BillingManager.restore();
//                Log.d(TAG, "onClick: ");
                break;
        }

    }

    /**
     * 调起google支付
     */
    private void startPay() {
        if (TextUtils.isEmpty(purchaseId)) {
            Toast.makeText(this, "请从所有的商品中，选择一个商品进行支付！", Toast.LENGTH_SHORT).show();
            return;
        }

        if (curInappProductBean != null) {
            if (curInappProductBean.getPurchaseType().contains("sub")) {
                //调用 "购买订阅"
                NativeBillingClientManager.startSubPurchase(purchaseId);
            } else {
                NativeBillingClientManager.startInAppPurchase(purchaseId);
            }
        }
    }

    /**
     * 查询所有商品（Google后台）
     * <p>
     * GET https://www.googleapis.com/androidpublisher/v3/applications/packageName/inappproducts
     * <p>
     * 参考：https://developers.google.com/android-publisher/api-ref/inappproducts/list?hl=zh-cn
     */
    private void getAllPurchase() {
        /**
         * 调用Google后台，查询所有的商品
         * 需要：access_token 参数
         */
        if (TextUtils.isEmpty(accessToken)) {
            Toast.makeText(this, "请先调用获取Token接口！", Toast.LENGTH_SHORT).show();
            return;
        }

        String queryAllPurchase = "https://www.googleapis.com/androidpublisher/v3/applications/" + getPackageName() + "/inappproducts";
        OkHttpUtils.get()
                .url(queryAllPurchase)
                .addParams("access_token", accessToken)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.d(TAG, "onError: getAllPurchase()" + e);
                        tv_hint.setText(tv_hint.getText() + "\n 获取所有商品 失败= " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.d(TAG, "onResponse: getAllPurchase() = " + response);
                        tv_hint.setText(tv_hint.getText() + "\n 获取所有商品 成功= " + response);
                        GooglePayPurchaseBean googlePayPurchaseBean = gson.fromJson(response, GooglePayPurchaseBean.class);
                        if (googlePayPurchaseBean != null && googlePayPurchaseBean.getInappproduct() != null) {
                            //放到列表展示出来
                            mAdapter.setNewData(googlePayPurchaseBean.getInappproduct());
                        }
                    }
                });


    }

    private void getToken() {
        /**
         * auth 接口 目的：需要获取到 code
         *
         *      该接口，是以网页登录的形式，需要在浏览器操作授权，获得 code
         *
         * 注： code 值，只需要调用一次即可（返回是个Html5需要登录，保存即可，不需要重复调用）。
         */
//        String auth = "https://accounts.google.com/o/oauth2/v2/auth";
//        OkHttpUtils.get().url(auth)
//                .addParams("client_id",cliendId)
//                .addParams("redirect_uri",redirect_uri)
//                .addParams("response_type","code")
//                .addParams("scope","https://www.googleapis.com/auth/androidpublisher")
//                .addParams("login_hint","cuishuxiang0604@gmail.com")
//                .build().execute(new StringCallback() {
//            @Override
//            public void onError(Call call, Exception e, int id) {
//                Log.d(TAG, "onError: ");
//            }
//
//            @Override
//            public void onResponse(String response, int id) {
//                Log.d(TAG, "onResponse: ");
//            }
//        });

        /**
         * 获取access_token : 每个请求，都需要拼接到后面，例如：?access_token=xxxxx
         */
        String tokenUrl = "https://accounts.google.com/o/oauth2/token";
        OkHttpUtils.post().url(tokenUrl)
                .addParams("client_id", client_id) //GoogleApi后台拿到 : 790140086566-hmeimrjutgjooiga0639hbolj6jh2e72.apps.googleusercontent.com
                .addParams("redirect_uri", redirect_uris) //GoogleApi后台拿到 : urn:ietf:wg:oauth:2.0:oob
                .addParams("grant_type", "authorization_code")//固定值
                .addParams("code", code)//上面获取，只需要调用一次
                .addParams("client_secret", client_secret)////GoogleApi后台拿到
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                Log.d(TAG, "onError: ");
                tv_hint.setText(tv_hint.getText() + "\n 获取access_token 失败\n ，开始通过refreshToken重新获取access_token" + e.getMessage());

                getTokenByRefreshToken();
            }

            @Override
            public void onResponse(String response, int id) {
                //返回的结果都在 response 包含
                GoogleAccsessTokenBean googleAccsessTokenBean = new Gson().fromJson(response, GoogleAccsessTokenBean.class);
                Log.d(TAG, "onResponse: googleAccsessTokenBean = " + googleAccsessTokenBean.toString());//返回，GoogleAccsessTokenBean.java 相关内容
                tv_hint.setText(tv_hint.getText() + "\n 获取access_token 成功 = " + response);
                accessToken = googleAccsessTokenBean.getAccess_token();
                refreshToken = googleAccsessTokenBean.getRefresh_token();

                showToast("Access Token 获取成功！");
            }
        });
    }

    /**
     * 当Token 失效，可以通过“refresh_token”刷新token
     */
    private void getTokenByRefreshToken() {
        String tokenUrl = "https://www.googleapis.com/oauth2/v4/token";
        OkHttpUtils.post().url(tokenUrl)
                .addParams("client_id", client_id) //GoogleApi后台拿到
                .addParams("grant_type", "refresh_token")//固定值
                .addParams("client_secret", client_secret)////GoogleApi后台拿到
                .addParams("refresh_token", refreshToken)//接口调用失败，使用该字段，刷新token,auth接口返回，存储即可
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                Log.d(TAG, "onError: ");
                tv_hint.setText(tv_hint.getText() + "\n refresh_token 获取access_token 失败= " + e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                //返回的结果都在 response 包含

                GoogleAccsessTokenBean googleAccsessTokenBean = new Gson().fromJson(response, GoogleAccsessTokenBean.class);
                Log.d(TAG, "onResponse: googleAccessTokenBean = " + googleAccsessTokenBean.toString());//返回，GoogleAccessTokenBean.java 相关内容
                tv_hint.setText(tv_hint.getText() + "\n refresh_token 获取access_token 成功 = " + response);
                accessToken = googleAccsessTokenBean.getAccess_token();
            }
        });

    }

    /**
     * 开始校验
     * GET https://www.googleapis.com/androidpublisher/v3/applications/packageName/purchases/products/productId/tokens/token
     */
    private void checkPurchase() {
        if (TextUtils.isEmpty(mProductId)) {
            Toast.makeText(this, "产品：mProductId为空！请先调用支付获取相应信息 ", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(mPurchaseToken)) {
            Toast.makeText(this, "产品：token！请先调用支付获取相应信息 ", Toast.LENGTH_LONG).show();
            return;
        }

        /**
         * 调用下面的接口去Google查询订单是否成功
         */
        String url = "https://www.googleapis.com/androidpublisher/v3/applications/" + getPackageName() + "/purchases/products/" + mProductId + "/tokens/" + mPurchaseToken;
        Log.e(TAG, "checkPurchase: 请求的url： " + url, new Throwable());
        OkHttpUtils.get().url(url)
                .addParams("access_token", accessToken)
//                .addParams("developerPayload", mDeveloperPayload)
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                Log.d(TAG, "onError: " + e.getMessage());
                tv_hint.setText(tv_hint.getText() + "\n 校验接口失败 = " + e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                Log.d(TAG, "onResponse: " + response);
                tv_hint.setText(tv_hint.getText() + "\n 校验接口成功 = " + response);
            }
        });
    }


    @Override
    public synchronized ComponentName startForegroundServiceAsUser(Intent service, UserHandle user) {
        return null;
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
