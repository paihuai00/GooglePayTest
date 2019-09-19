package com.googlepaytest.csx.github_google_pay;

import android.graphics.Color;
import android.support.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.googlepaytest.csx.R;

import java.util.ArrayList;

/**
 * Date: 2019/8/29
 * create by cuishuxiang
 * description:
 */
public class PurchaseAdapter extends BaseQuickAdapter<GooglePayPurchaseBean.InappproductBean, BaseViewHolder> {

    private int choosePosition = -1;

    public PurchaseAdapter() {
        super(R.layout.item_purchase, new ArrayList<GooglePayPurchaseBean.InappproductBean>());
        choosePosition = -1;
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, GooglePayPurchaseBean.InappproductBean item) {
        helper.setText(R.id.tv_id, "商品id：" + item.getSku());
        helper.setText(R.id.tv_type, "商品类型：" + item.getPurchaseType());

        if (choosePosition != -1 && getData().indexOf(item) == choosePosition) {
            helper.getView(R.id.ll_root).setBackgroundColor(Color.BLACK);
        } else {
            helper.getView(R.id.ll_root).setBackgroundColor(Color.GRAY);
        }
    }


    public void setChoosePosition(int choosePosition) {
        this.choosePosition = choosePosition;
    }

}
