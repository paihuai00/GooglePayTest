package com.googlepaytest.csx.github_google_pay;

/**
 * Date: 2019/8/29
 * create by cuishuxiang
 * description:
 */
public class GooglePayCheckBean {

    /**
     * kind : androidpublisher#productPurchase
     * purchaseTimeMillis : 1567044758226
     * purchaseState : 0
     * consumptionState : 0
     * developerPayload : inapp:test1:365254b0-96f4-4c42-8dcc-450d5d6c967e
     * orderId : GPA.3373-2691-0666-58819
     * purchaseType : 0
     * acknowledgementState : 1
     */

    private String kind;
    private String purchaseTimeMillis;
    private int purchaseState;
    private int consumptionState;
    private String developerPayload;
    private String orderId;
    private int purchaseType;
    private int acknowledgementState;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPurchaseTimeMillis() {
        return purchaseTimeMillis;
    }

    public void setPurchaseTimeMillis(String purchaseTimeMillis) {
        this.purchaseTimeMillis = purchaseTimeMillis;
    }

    public int getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(int purchaseState) {
        this.purchaseState = purchaseState;
    }

    public int getConsumptionState() {
        return consumptionState;
    }

    public void setConsumptionState(int consumptionState) {
        this.consumptionState = consumptionState;
    }

    public String getDeveloperPayload() {
        return developerPayload;
    }

    public void setDeveloperPayload(String developerPayload) {
        this.developerPayload = developerPayload;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(int purchaseType) {
        this.purchaseType = purchaseType;
    }

    public int getAcknowledgementState() {
        return acknowledgementState;
    }

    public void setAcknowledgementState(int acknowledgementState) {
        this.acknowledgementState = acknowledgementState;
    }
}
