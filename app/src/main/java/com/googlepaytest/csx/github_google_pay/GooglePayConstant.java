package com.googlepaytest.csx.github_google_pay;

/**
 * Date: 2019/8/13
 * create by cuishuxiang
 * description:
 */
public class GooglePayConstant {
    //Google Pay key
    public static final String PayLicenseKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1ilVUxnLykxscnTJh+DFsaD2g1nW644d6801UxdW7Opfj01Uefq9oeoj/N2cmMNCC9XB9L0S6351kui3j0AsXTvrmFGUeg6C7YfBazSeDqqiUu4G16wF42DdzK4CRba+gz6J8Kb5I4eDvXnjc+8xDnblCkkFVSAFS8dW5uTe4+sQIFafwTQv6gq/POkv8/+wW1Sdxbhl5Q7yMYjh041yKvT+1DczgIqNjFRqvHlPkQMDKWQ2/lm8MEekAE/MFdGUfrVpSUB+A5DpcTZPfm6G8wgZ2S+FMo/DClMReuh+OXAXGVIYNmqqA6+6gHzYvTg9HAPBzOPK/sQHRu0bLpPUwwIDAQAB";


    //GET https://www.googleapis.com/androidpublisher/v3/applications/packageName/purchases/products/productId/tokens/token
    public static final String queryPurchaseState = "https://www.googleapis.com/androidpublisher/v3/applications/com.googlepay.client/purchases/products/productId/tokens/token";


    /**
     *   Google 预留的静态测试id
     *   1,android.test.purchased
     *      当您使用此商品 ID 发送 Google Play 结算服务请求时，Google Play 会假定您成功购买了商品，并据此进行响应。
     *      响应包括一个 JSON 字符串，其中包含虚拟购买信息（例如虚拟订单 ID）。
     *   2,android.test.canceled
     *      当您使用此商品 ID 发送 Google Play 结算服务请求时，Google Play 会假定购买已被取消，并据此做出响应。
     *      如果订购流程出现问题（例如信用卡无效，或您在用户付款之前取消了订单），就会发生这种情况。
     *   3,android.test.item_unavailable
     *      当您使用此商品 ID 发送 Google Play 结算服务请求时，
     *      Google Play 会假定所购商品在您应用的商品列表中不存在，并据此做出响应。
     */
    public static final String GooglePurchaseId = "android.test.purchased";
    public static final String GoogleCancelId = "android.test.canceled";
    public static final String GoogleUnAvailableId = "android.test.item_unavailable";

}
