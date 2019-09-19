package com.googlepaytest.csx.native_google_pay;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;

import java.util.List;

/**
 * Date: 2019/8/16
 * create by cuishuxiang
 * description: Google Pay 支付回调
 */
public interface OnPurchaseCallBack {
    //Google Pay 返回码
    void responseCode(@BillingClient.BillingResponseCode int code);

    // 成功直接返回该集合
    void onPaySuccess(List<Purchase> purchaseList);

    //用户取消，直接回调该方法
    void onUserCancel();

}
