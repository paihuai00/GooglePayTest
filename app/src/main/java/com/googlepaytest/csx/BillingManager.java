package com.googlepaytest.csx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.anjlab.android.iab.v3.BillingCommunicationException;
import com.anjlab.android.iab.v3.BillingHistoryRecord;
import com.anjlab.android.iab.v3.BillingProcessor;
import com.anjlab.android.iab.v3.Constants;
import com.anjlab.android.iab.v3.SkuDetails;
import com.anjlab.android.iab.v3.TransactionDetails;

import java.util.ArrayList;
import java.util.List;

//import com.android.billingclient.api.BillingClient;

/**
 * Date: 2019/8/13
 * create by cuishuxiang
 * description: 管理类
 *
 * tp: 1,需要调用初始化方法{@link BillingManager#init(Activity, String, BillingProcessor.IBillingHandler)}
 *     2,具体的操作，需要使用到{@link BillingProcessor},这里也提供了{@link BillingManager#getBillingProcessor()}来获取实例
 *
 * 注意：下面的信息可能会用到
 *  1, 处理已取消的订阅
 *      调用bp.getSubscriptionTransactionDetails（...）并检查purchaseInfo.purchaseData.autoRenewing标志。
 *      订阅取消后，它将设置为False。
 *      另请注意，您需要定期调用bp.loadOwnedPurchasesFromGoogle（）方法才能更新订阅信息
 *  2, 促销代码支持
 *     您可以使用促销代码和此库。 促销代码可以在购买对话框或Google Play应用中输入。
 *     网址https://play.google.com/redeem?code=YOUR_PROMO_CODE将启动已添加促销代码的Google Play应用。
 *     如果您想让用户选择在您的应用中输入促销代码，这可能会派上用场。
 *
 *  3,错误码查阅参考：{@link Constants}
 *
 * 参考：https://github.com/anjlab/android-inapp-billing-v3/blob/master/README.md
 */
public class BillingManager {
    private static final String TAG = "BillingManager";

    private static BillingProcessor bp;

    private static Activity mActivity;
    private static String mLicenseKey;

    /**
     * 初始化方法，需要先调用这个方法
     *
     * @param activity
     * @param licenseKey
     */
    public static void init(Activity activity, String licenseKey, BillingProcessor.IBillingHandler iBillingHandler) {
        mActivity = activity;
        mLicenseKey = licenseKey;

        bp = BillingProcessor.newBillingProcessor(activity, licenseKey, iBillingHandler);
        //商户id获得：GooglePayConsole后台--->设置---->付款设置（注意，商家id需要放置到安全的地方）
//        bp = BillingProcessor.newBillingProcessor(activity, licenseKey, "商户id", iBillingHandler);
        bp.initialize();
    }

    public static BillingProcessor getBillingProcessor() {
        return bp;
    }

    /**
     * 在使用之前，最好检查应用内的结算服务可用性。 在某些旧设备或中国设备中，可能会出现Play Market不可用或已弃用且不支持应用内结算的情况。
     *
     * @return true 可用； false：不可用
     */
    public static boolean isPayServiceAvailable() {
        if (mActivity == null)
            throw new IllegalArgumentException("isPayServiceAvailable() error. Call the init method first , Please check it!");
        return BillingProcessor.isIabServiceAvailable(mActivity);
    }

    /**
     * 请注意，调用BillingProcessor.isIabServiceAvailable（）（仅检查是否安装了Play Market应用程序）是不够的，
     * 因为可能存在返回true但仍然无法付款的情况。
     * <p>
     * 因此，最好在初始化BillingProcessor之后调用isOneTimePurchaseSupported（）：
     *
     * @return 最好true的时候，调用支付流程
     */
    public static boolean isPurchaseSupported() {
        if (bp == null)
            throw new IllegalArgumentException("isPurchaseSupported() error . Call the init method first , Please check it!");

        return bp.isOneTimePurchaseSupported();
    }

    /**
     * 检测是否支持订阅
     *
     * @return
     */
    public static boolean isSubscribeUpdateSupported() {
        if (bp == null)
            throw new IllegalArgumentException("isSubscriptionUpdateSupported() error . Call the init method first , Please check it!");
        return bp.isSubscriptionUpdateSupported();
    }

    /**
     * 购买方法
     *
     * @param purchaseId id
     */
    public static boolean purchase(String purchaseId) {
        if (mActivity == null || bp == null)
            throw new IllegalArgumentException("Call the init method first , Please check it!");

        //检测服务是否可用
        if (!isPayServiceAvailable()) {
            Log.e(TAG, "purchase: 服务不可用，请检查!");
            return false;
        }

        //检测是否支持购买
        if (!isPurchaseSupported()) {
            Log.e(TAG, "purchase: 不支持购买，请检查!");
            return false;
        }

        return bp.purchase(mActivity, purchaseId);
    }

    /**
     * 暂时不知道 "developerPayload" 什么意思
     * <p>
     * 重要信息：当您提供有效负载时，库内部会为您的负载预先添加一个字符串。
     * 对于订阅，它前缀为“subs：\ <productId \>：”，
     * 对于产品，它预先添加“inapp：\ <productId \>：\ <UUID \>：”。
     * <p>
     * 了解您是否对成功购买后从Google Play返回的有效内容进行了任何验证，这一点非常重要。
     *
     * @param productId
     * @param developerPayload
     * @param extraParams      放置参数如下所示
     * @return
     */
    public static boolean purchase(String productId, String developerPayload, Bundle extraParams) {
        /**
         * Bundle extraParams = new Bundle()
         * extraParams.putString("accountId", "MY_ACCOUNT_ID");
         */
        if (mActivity == null || bp == null)
            throw new IllegalArgumentException("purchase() error . Call the init method first , Please check it!");
        //检测服务是否可用
        if (!isPayServiceAvailable()) {
            Log.e(TAG, "purchase: 服务不可用，请检查!");
            return false;
        }

        //检测是否支持购买
        if (!isPurchaseSupported()) {
            Log.e(TAG, "purchase: 不支持购买，请检查!");
            return false;
        }


        return bp.subscribe(mActivity, productId, developerPayload, extraParams);
    }

    /**
     * 订阅方法
     *
     * @param purchaseId
     */
    public static boolean subscribe(String purchaseId) {
        if (mActivity == null || bp == null)
            throw new IllegalArgumentException("subscribe() error . Call the init method first , Please check it!");

        //检测服务是否可用
        if (!isPayServiceAvailable()) {
            Log.e(TAG, "subscribe: 服务不可用，请检查!");
            return false;
        }

        //检测是否支持购买
        if(!isPurchaseSupported()){
            Log.e(TAG, "subscribe: 不支持购买，请检查!");
            return false;
        }

        return bp.subscribe(mActivity, purchaseId);
        //注意：还有一个 三个参数的负载，暂时不知道什么意思
//        bp.subscribe(mActivity, purchaseId, "");
    }


    /**
     * 订阅方法 (developerPayload 负载，暂时不知道什么意思)
     * <p>
     * 重要信息：当您提供有效负载时，库内部会为您的负载预先添加一个字符串。
     * 对于订阅，它前缀为“subs：\ <productId \>：”，
     * 对于产品，它预先添加“inapp：\ <productId \>：\ <UUID \>：”。
     *
     * @param purchaseId
     * @param developerPayload
     * @param extraParams
     * @return
     */
    public static boolean subscribe(String purchaseId, String developerPayload, Bundle extraParams) {
        /**
         * Bundle extraParams = new Bundle()
         * extraParams.putString("accountId", "MY_ACCOUNT_ID");
         */
        if (mActivity == null || bp == null)
            throw new IllegalArgumentException("subscribe() error . Call the init method first , Please check it!");

        //检测服务是否可用
        if (!isPayServiceAvailable()) {
            Log.e(TAG, "subscribe: 服务不可用，请检查!");
            return false;
        }

        //检测是否支持购买
        if(!isPurchaseSupported()){
            Log.e(TAG, "subscribe: 不支持购买，请检查!");
            return false;
        }

        return bp.subscribe(mActivity, purchaseId, developerPayload, extraParams);
    }

    /**
     * 消费购买的商品
     *
     * 注：您可以调用该方法，随时消费购买并允许多次购买相同的产品
     * @param purchaseId
     * @return
     */
    public static boolean consumePurchase(String purchaseId) {
        if ( bp == null)
            throw new IllegalArgumentException("consumePurchase() error . Call the init method first , Please check it!");

        return bp.consumePurchase(purchaseId);
    }

    /**
     * 商品详情
     * @param productId
     * @return
     */
    public static SkuDetails getSkuDetail(String productId) {
        if ( bp == null)
            throw new IllegalArgumentException("getSkuDetail() error . Call the init method first , Please check it!");


       return bp.getPurchaseListingDetails(productId);
    }

    public static List<SkuDetails> getSkuDetailList(ArrayList<String> productIdList) {
        if ( bp == null)
            throw new IllegalArgumentException("getSkuDetail() error . Call the init method first , Please check it!");


        return bp.getPurchaseListingDetails(productIdList);
    }

    /**
     * 获得交易详情(商品)
     * @param productId
     * @return
     */
    public static TransactionDetails getPurchaseTransactionDetails(String productId) {
        if ( bp == null)
            throw new IllegalArgumentException("getPurchaseTransactionDetails() error . Call the init method first , Please check it!");

        return bp.getPurchaseTransactionDetails(productId);
    }
    /**
     * 获得交易详情(订阅)
     * @param productId
     * @return
     */
    public static TransactionDetails getSubscribeTransactionDetails(String productId) {
        if ( bp == null)
            throw new IllegalArgumentException("getSubscribeTransactionDetails() error . Call the init method first , Please check it!");

        return bp.getSubscriptionTransactionDetails(productId);
    }

    /**
     * 获得 应用内商品 购买历史记录
     * @param extraParams
     * @return
     */
    public static List<BillingHistoryRecord> getInappHistory(Bundle extraParams) {
        if ( bp == null)
            throw new IllegalArgumentException("getInappHistory() error . Call the init method first , Please check it!");
        try {

            //请注意，此API需要版本6或更高版本的结算API，因此您应该事先检查是否支持它：
            if (!bp.isRequestBillingHistorySupported(Constants.PRODUCT_TYPE_MANAGED)) {
                Log.e(TAG, "getInappHistory: isRequestBillingHistorySupported 版本不支持:");
                return null;
            }

            return bp.getPurchaseHistory(Constants.PRODUCT_TYPE_MANAGED, extraParams);

        } catch (BillingCommunicationException e) {
            e.printStackTrace();
            Log.e(TAG, "getInappHistory: 异常:" + e);
            return null;
        }
    }


    /**
     * 获得 订阅商品 购买历史记录
     * @param extraParams
     * @return
     */
    public static List<BillingHistoryRecord> getSubscribeHistory(Bundle extraParams) {
        if ( bp == null)
            throw new IllegalArgumentException("getSubscribeHistory() error . Call the init method first , Please check it!");

        try {
            //请注意，此API需要版本6或更高版本的结算API，因此您应该事先检查是否支持它：
            if (!bp.isRequestBillingHistorySupported(Constants.PRODUCT_TYPE_SUBSCRIPTION)) {
                Log.e(TAG, "getInappHistory: getSubscribeHistory 版本不支持:");
                return null;
            }

            return bp.getPurchaseHistory(Constants.PRODUCT_TYPE_SUBSCRIPTION, extraParams);

        } catch (BillingCommunicationException e) {
            e.printStackTrace();
            Log.e(TAG, "getSubscribeHistory: 异常:" + e);
            return null;
        }
    }

    /**
     * 恢复购买和订阅
     * @return
     */
    public static boolean restore() {
        if ( bp == null)
            throw new IllegalArgumentException("restore() error . Call the init method first , Please check it!");
        return bp.loadOwnedPurchasesFromGoogle();
    }

    /**
     * 检查交易有效性 (调用该方法，在初始化 BillingProcessor 需要设置商家id)
     * @param transactionDetails
     * @return
     *
     *
     * 安全性 参考：https://developer.android.com/google/play/billing/billing_best_practices.html#validating-purchase-device
     */
    public static boolean isValid(TransactionDetails transactionDetails) {
        if ( bp == null)
            throw new IllegalArgumentException("isValid() error . Call the init method first , Please check it!");

       return bp.isValidTransactionDetails(transactionDetails);
    }


    /**
     * 用于接收回调，在Activity可以这样调用，示例：
     *      @Override
     *     protected void onActivityResult(int requestCode, int resultCode, Intent data) {
     *         if (!bp.handleActivityResult(requestCode, resultCode, data))
     *             super.onActivityResult(requestCode, resultCode, data);
     *     }
     */
    public static boolean handleActivityResult(int requestCode, int resultCode, Intent data){
        return bp.handleActivityResult(requestCode, resultCode, data);
    }

    /**
     * 在Activity onDestroy 调用该方法
     */
    public static void release() {
        if (bp != null) {
            bp.release();
            bp = null;
        }
    }
}
