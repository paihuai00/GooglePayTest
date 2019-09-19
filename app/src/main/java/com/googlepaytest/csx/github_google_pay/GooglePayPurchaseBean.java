package com.googlepaytest.csx.github_google_pay;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Date: 2019/8/29
 * create by cuishuxiang
 * description:
 */
public class GooglePayPurchaseBean {

    /**
     * kind : androidpublisher#inappproductsListResponse
     * tokenPagination : {"previousPageToken":""}
     * inappproduct : [{"packageName":"com.csizg.google.pay","sku":"test3_20190828","status":"active","purchaseType":"managedUser","defaultPrice":{"priceMicros":"15000000","currency":"USD"},"prices":{"DZ":{"priceMicros":"1800000000","currency":"DZD"},"AE":{"priceMicros":"57990000","currency":"AED"},"OM":{"priceMicros":"14990000","currency":"USD"},"EG":{"priceMicros":"249990000","currency":"EGP"},"IE":{"priceMicros":"16990000","currency":"EUR"},"EE":{"priceMicros":"15990000","currency":"EUR"},"AT":{"priceMicros":"15990000","currency":"EUR"},"AU":{"priceMicros":"23990000","currency":"AUD"},"PK":{"priceMicros":"2400000000","currency":"PKR"},"PY":{"priceMicros":"90000000000","currency":"PYG"},"BH":{"priceMicros":"15990000","currency":"USD"},"BR":{"priceMicros":"61990000","currency":"BRL"},"BM":{"priceMicros":"14990000","currency":"USD"},"BG":{"priceMicros":"31990000","currency":"BGN"},"BE":{"priceMicros":"15990000","currency":"EUR"},"PL":{"priceMicros":"72990000","currency":"PLN"},"BO":{"priceMicros":"104990000","currency":"BOB"},"DK":{"priceMicros":"125000000","currency":"DKK"},"DE":{"priceMicros":"15990000","currency":"EUR"},"RU":{"priceMicros":"1199000000","currency":"RUB"},"FR":{"priceMicros":"15990000","currency":"EUR"},"PH":{"priceMicros":"785000000","currency":"PHP"},"FI":{"priceMicros":"16990000","currency":"EUR"},"CO":{"priceMicros":"52000000000","currency":"COP"},"CR":{"priceMicros":"8500000000","currency":"CRC"},"GE":{"priceMicros":"44000000","currency":"GEL"},"KZ":{"priceMicros":"5790000000","currency":"KZT"},"KR":{"priceMicros":"20000000000","currency":"KRW"},"NL":{"priceMicros":"15990000","currency":"EUR"},"CA":{"priceMicros":"19990000","currency":"CAD"},"GH":{"priceMicros":"80000000","currency":"GHS"},"KH":{"priceMicros":"14990000","currency":"USD"},"CZ":{"priceMicros":"419990000","currency":"CZK"},"QA":{"priceMicros":"55000000","currency":"QAR"},"KY":{"priceMicros":"14990000","currency":"USD"},"KW":{"priceMicros":"14990000","currency":"USD"},"HR":{"priceMicros":"125000000","currency":"HRK"},"KE":{"priceMicros":"1600000000","currency":"KES"},"LV":{"priceMicros":"15990000","currency":"EUR"},"LB":{"priceMicros":"22750000000","currency":"LBP"},"LT":{"priceMicros":"15990000","currency":"EUR"},"LI":{"priceMicros":"15000000","currency":"CHF"},"LU":{"priceMicros":"15990000","currency":"EUR"},"RO":{"priceMicros":"74990000","currency":"RON"},"MY":{"priceMicros":"62990000","currency":"MYR"},"US":{"priceMicros":"14990000","currency":"USD"},"BD":{"priceMicros":"1300000000","currency":"BDT"},"PE":{"priceMicros":"50990000","currency":"PEN"},"MM":{"priceMicros":"23000000000","currency":"MMK"},"MA":{"priceMicros":"144990000","currency":"MAD"},"MX":{"priceMicros":"299000000","currency":"MXN"},"ZA":{"priceMicros":"264990000","currency":"ZAR"},"NG":{"priceMicros":"5440000000","currency":"NGN"},"NO":{"priceMicros":"169000000","currency":"NOK"},"PT":{"priceMicros":"16990000","currency":"EUR"},"JP":{"priceMicros":"1590000000","currency":"JPY"},"SE":{"priceMicros":"179000000","currency":"SEK"},"CH":{"priceMicros":"15000000","currency":"CHF"},"RS":{"priceMicros":"1899000000","currency":"RSD"},"CY":{"priceMicros":"15990000","currency":"EUR"},"SA":{"priceMicros":"58990000","currency":"SAR"},"LK":{"priceMicros":"2700000000","currency":"LKR"},"SK":{"priceMicros":"15990000","currency":"EUR"},"SI":{"priceMicros":"16990000","currency":"EUR"},"TW":{"priceMicros":"490000000","currency":"TWD"},"TH":{"priceMicros":"450000000","currency":"THB"},"TZ":{"priceMicros":"34000000000","currency":"TZS"},"TC":{"priceMicros":"14990000","currency":"USD"},"TR":{"priceMicros":"104990000","currency":"TRY"},"UA":{"priceMicros":"374990000","currency":"UAH"},"ES":{"priceMicros":"15990000","currency":"EUR"},"GR":{"priceMicros":"16990000","currency":"EUR"},"SG":{"priceMicros":"20980000","currency":"SGD"},"NZ":{"priceMicros":"26990000","currency":"NZD"},"HU":{"priceMicros":"5690000000","currency":"HUF"},"IQ":{"priceMicros":"17600000000","currency":"IQD"},"IL":{"priceMicros":"52900000","currency":"ILS"},"IT":{"priceMicros":"16990000","currency":"EUR"},"IN":{"priceMicros":"1250000000","currency":"INR"},"ID":{"priceMicros":"219000000000","currency":"IDR"},"GB":{"priceMicros":"14490000","currency":"GBP"},"VG":{"priceMicros":"14990000","currency":"USD"},"JO":{"priceMicros":"10650000","currency":"JOD"},"VN":{"priceMicros":"348000000000","currency":"VND"},"CL":{"priceMicros":"10800000000","currency":"CLP"},"MO":{"priceMicros":"119000000","currency":"MOP"},"HK":{"priceMicros":"118000000","currency":"HKD"}},"listings":{"zh-CN":{"title":"test3","description":"测试商品3"}},"defaultLanguage":"zh-CN"},{"packageName":"com.csizg.google.pay","sku":"test1","status":"active","purchaseType":"managedUser","defaultPrice":{"priceMicros":"1000000","currency":"USD"},"prices":{"DZ":{"priceMicros":"125000000","currency":"DZD"},"AE":{"priceMicros":"3890000","currency":"AED"},"OM":{"priceMicros":"990000","currency":"USD"},"EG":{"priceMicros":"16990000","currency":"EGP"},"IE":{"priceMicros":"1090000","currency":"EUR"},"EE":{"priceMicros":"1090000","currency":"EUR"},"AT":{"priceMicros":"1090000","currency":"EUR"},"AU":{"priceMicros":"1590000","currency":"AUD"},"PK":{"priceMicros":"160000000","currency":"PKR"},"PY":{"priceMicros":"10000000000","currency":"PYG"},"BH":{"priceMicros":"990000","currency":"USD"},"BR":{"priceMicros":"4090000","currency":"BRL"},"BM":{"priceMicros":"990000","currency":"USD"},"BG":{"priceMicros":"2090000","currency":"BGN"},"BE":{"priceMicros":"1090000","currency":"EUR"},"PL":{"priceMicros":"4890000","currency":"PLN"},"BO":{"priceMicros":"7490000","currency":"BOB"},"DK":{"priceMicros":"8000000","currency":"DKK"},"DE":{"priceMicros":"1090000","currency":"EUR"},"RU":{"priceMicros":"75000000","currency":"RUB"},"FR":{"priceMicros":"1090000","currency":"EUR"},"PH":{"priceMicros":"52000000","currency":"PHP"},"FI":{"priceMicros":"1090000","currency":"EUR"},"CO":{"priceMicros":"3500000000","currency":"COP"},"CR":{"priceMicros":"570000000","currency":"CRC"},"GE":{"priceMicros":"3000000","currency":"GEL"},"KZ":{"priceMicros":"390000000","currency":"KZT"},"KR":{"priceMicros":"1300000000","currency":"KRW"},"NL":{"priceMicros":"1090000","currency":"EUR"},"CA":{"priceMicros":"1290000","currency":"CAD"},"GH":{"priceMicros":"5000000","currency":"GHS"},"KH":{"priceMicros":"990000","currency":"USD"},"CZ":{"priceMicros":"27990000","currency":"CZK"},"QA":{"priceMicros":"3500000","currency":"QAR"},"KY":{"priceMicros":"990000","currency":"USD"},"KW":{"priceMicros":"990000","currency":"USD"},"HR":{"priceMicros":"8000000","currency":"HRK"},"KE":{"priceMicros":"200000000","currency":"KES"},"LV":{"priceMicros":"1090000","currency":"EUR"},"LB":{"priceMicros":"1500000000","currency":"LBP"},"LT":{"priceMicros":"1090000","currency":"EUR"},"LI":{"priceMicros":"1000000","currency":"CHF"},"LU":{"priceMicros":"1090000","currency":"EUR"},"RO":{"priceMicros":"4990000","currency":"RON"},"MY":{"priceMicros":"3990000","currency":"MYR"},"US":{"priceMicros":"990000","currency":"USD"},"BD":{"priceMicros":"80000000","currency":"BDT"},"PE":{"priceMicros":"3390000","currency":"PEN"},"MM":{"priceMicros":"2000000000","currency":"MMK"},"MA":{"priceMicros":"9590000","currency":"MAD"},"MX":{"priceMicros":"20000000","currency":"MXN"},"ZA":{"priceMicros":"17990000","currency":"ZAR"},"NG":{"priceMicros":"365000000","currency":"NGN"},"NO":{"priceMicros":"11000000","currency":"NOK"},"PT":{"priceMicros":"1090000","currency":"EUR"},"JP":{"priceMicros":"110000000","currency":"JPY"},"SE":{"priceMicros":"12000000","currency":"SEK"},"CH":{"priceMicros":"1000000","currency":"CHF"},"RS":{"priceMicros":"149000000","currency":"RSD"},"CY":{"priceMicros":"1090000","currency":"EUR"},"SA":{"priceMicros":"3890000","currency":"SAR"},"LK":{"priceMicros":"175000000","currency":"LKR"},"SK":{"priceMicros":"1090000","currency":"EUR"},"SI":{"priceMicros":"1090000","currency":"EUR"},"TW":{"priceMicros":"33000000","currency":"TWD"},"TH":{"priceMicros":"31000000","currency":"THB"},"TZ":{"priceMicros":"2300000000","currency":"TZS"},"TC":{"priceMicros":"990000","currency":"USD"},"TR":{"priceMicros":"6890000","currency":"TRY"},"UA":{"priceMicros":"24990000","currency":"UAH"},"ES":{"priceMicros":"1090000","currency":"EUR"},"GR":{"priceMicros":"1090000","currency":"EUR"},"SG":{"priceMicros":"1480000","currency":"SGD"},"NZ":{"priceMicros":"1790000","currency":"NZD"},"HU":{"priceMicros":"379000000","currency":"HUF"},"IQ":{"priceMicros":"1200000000","currency":"IQD"},"IL":{"priceMicros":"3500000","currency":"ILS"},"IT":{"priceMicros":"1090000","currency":"EUR"},"IN":{"priceMicros":"85000000","currency":"INR"},"ID":{"priceMicros":"14000000000","currency":"IDR"},"GB":{"priceMicros":"990000","currency":"GBP"},"VG":{"priceMicros":"990000","currency":"USD"},"JO":{"priceMicros":"700000","currency":"JOD"},"VN":{"priceMicros":"23000000000","currency":"VND"},"CL":{"priceMicros":"720000000","currency":"CLP"},"MO":{"priceMicros":"7990000","currency":"MOP"},"HK":{"priceMicros":"8000000","currency":"HKD"}},"listings":{"zh-CN":{"title":"test1","description":"test1"}},"defaultLanguage":"zh-CN"},{"packageName":"com.csizg.google.pay","sku":"test2","status":"active","purchaseType":"managedUser","defaultPrice":{"priceMicros":"10000000","currency":"USD"},"prices":{"DZ":{"priceMicros":"1200000000","currency":"DZD"},"AE":{"priceMicros":"38990000","currency":"AED"},"OM":{"priceMicros":"9990000","currency":"USD"},"EG":{"priceMicros":"169990000","currency":"EGP"},"IE":{"priceMicros":"10990000","currency":"EUR"},"EE":{"priceMicros":"10990000","currency":"EUR"},"AT":{"priceMicros":"10990000","currency":"EUR"},"AU":{"priceMicros":"15990000","currency":"AUD"},"PK":{"priceMicros":"1600000000","currency":"PKR"},"PY":{"priceMicros":"60000000000","currency":"PYG"},"BH":{"priceMicros":"10990000","currency":"USD"},"BR":{"priceMicros":"40990000","currency":"BRL"},"BM":{"priceMicros":"9990000","currency":"USD"},"BG":{"priceMicros":"20990000","currency":"BGN"},"BE":{"priceMicros":"10990000","currency":"EUR"},"PL":{"priceMicros":"48990000","currency":"PLN"},"BO":{"priceMicros":"68990000","currency":"BOB"},"DK":{"priceMicros":"85000000","currency":"DKK"},"DE":{"priceMicros":"10990000","currency":"EUR"},"RU":{"priceMicros":"799000000","currency":"RUB"},"FR":{"priceMicros":"10990000","currency":"EUR"},"PH":{"priceMicros":"525000000","currency":"PHP"},"FI":{"priceMicros":"10990000","currency":"EUR"},"CO":{"priceMicros":"34500000000","currency":"COP"},"CR":{"priceMicros":"5700000000","currency":"CRC"},"GE":{"priceMicros":"29000000","currency":"GEL"},"KZ":{"priceMicros":"3890000000","currency":"KZT"},"KR":{"priceMicros":"13000000000","currency":"KRW"},"NL":{"priceMicros":"10990000","currency":"EUR"},"CA":{"priceMicros":"12990000","currency":"CAD"},"GH":{"priceMicros":"55000000","currency":"GHS"},"KH":{"priceMicros":"9990000","currency":"USD"},"CZ":{"priceMicros":"279990000","currency":"CZK"},"QA":{"priceMicros":"37000000","currency":"QAR"},"KY":{"priceMicros":"9990000","currency":"USD"},"KW":{"priceMicros":"9990000","currency":"USD"},"HR":{"priceMicros":"85000000","currency":"HRK"},"KE":{"priceMicros":"1000000000","currency":"KES"},"LV":{"priceMicros":"10990000","currency":"EUR"},"LB":{"priceMicros":"15250000000","currency":"LBP"},"LT":{"priceMicros":"10990000","currency":"EUR"},"LI":{"priceMicros":"9800000","currency":"CHF"},"LU":{"priceMicros":"10990000","currency":"EUR"},"RO":{"priceMicros":"49990000","currency":"RON"},"MY":{"priceMicros":"41990000","currency":"MYR"},"US":{"priceMicros":"9990000","currency":"USD"},"BD":{"priceMicros":"850000000","currency":"BDT"},"PE":{"priceMicros":"33990000","currency":"PEN"},"MM":{"priceMicros":"15000000000","currency":"MMK"},"MA":{"priceMicros":"95990000","currency":"MAD"},"MX":{"priceMicros":"199000000","currency":"MXN"},"ZA":{"priceMicros":"174990000","currency":"ZAR"},"NG":{"priceMicros":"3630000000","currency":"NGN"},"NO":{"priceMicros":"115000000","currency":"NOK"},"PT":{"priceMicros":"10990000","currency":"EUR"},"JP":{"priceMicros":"1060000000","currency":"JPY"},"SE":{"priceMicros":"119000000","currency":"SEK"},"CH":{"priceMicros":"9800000","currency":"CHF"},"RS":{"priceMicros":"1299000000","currency":"RSD"},"CY":{"priceMicros":"10990000","currency":"EUR"},"SA":{"priceMicros":"38990000","currency":"SAR"},"LK":{"priceMicros":"1800000000","currency":"LKR"},"SK":{"priceMicros":"10990000","currency":"EUR"},"SI":{"priceMicros":"10990000","currency":"EUR"},"TW":{"priceMicros":"330000000","currency":"TWD"},"TH":{"priceMicros":"300000000","currency":"THB"},"TZ":{"priceMicros":"23000000000","currency":"TZS"},"TC":{"priceMicros":"9990000","currency":"USD"},"TR":{"priceMicros":"68990000","currency":"TRY"},"UA":{"priceMicros":"249990000","currency":"UAH"},"ES":{"priceMicros":"10990000","currency":"EUR"},"GR":{"priceMicros":"10990000","currency":"EUR"},"SG":{"priceMicros":"13980000","currency":"SGD"},"NZ":{"priceMicros":"17990000","currency":"NZD"},"HU":{"priceMicros":"3790000000","currency":"HUF"},"IQ":{"priceMicros":"11750000000","currency":"IQD"},"IL":{"priceMicros":"35000000","currency":"ILS"},"IT":{"priceMicros":"10990000","currency":"EUR"},"IN":{"priceMicros":"850000000","currency":"INR"},"ID":{"priceMicros":"139000000000","currency":"IDR"},"GB":{"priceMicros":"9990000","currency":"GBP"},"VG":{"priceMicros":"9990000","currency":"USD"},"JO":{"priceMicros":"7100000","currency":"JOD"},"VN":{"priceMicros":"232000000000","currency":"VND"},"CL":{"priceMicros":"7200000000","currency":"CLP"},"MO":{"priceMicros":"80880000","currency":"MOP"},"HK":{"priceMicros":"78000000","currency":"HKD"}},"listings":{"zh-CN":{"title":"test2_20190828","description":"test2_20190828"}},"defaultLanguage":"zh-CN"}]
     */

    private String kind;
    private TokenPaginationBean tokenPagination;
    private List<InappproductBean> inappproduct;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public TokenPaginationBean getTokenPagination() {
        return tokenPagination;
    }

    public void setTokenPagination(TokenPaginationBean tokenPagination) {
        this.tokenPagination = tokenPagination;
    }

    public List<InappproductBean> getInappproduct() {
        return inappproduct;
    }

    public void setInappproduct(List<InappproductBean> inappproduct) {
        this.inappproduct = inappproduct;
    }

    public static class TokenPaginationBean {
        /**
         * previousPageToken :
         */

        private String previousPageToken;

        public String getPreviousPageToken() {
            return previousPageToken;
        }

        public void setPreviousPageToken(String previousPageToken) {
            this.previousPageToken = previousPageToken;
        }
    }

    public static class InappproductBean {
        /**
         * packageName : com.csizg.google.pay
         * sku : test3_20190828
         * status : active
         * purchaseType : managedUser
         * defaultPrice : {"priceMicros":"15000000","currency":"USD"}
         * prices : {"DZ":{"priceMicros":"1800000000","currency":"DZD"},"AE":{"priceMicros":"57990000","currency":"AED"},"OM":{"priceMicros":"14990000","currency":"USD"},"EG":{"priceMicros":"249990000","currency":"EGP"},"IE":{"priceMicros":"16990000","currency":"EUR"},"EE":{"priceMicros":"15990000","currency":"EUR"},"AT":{"priceMicros":"15990000","currency":"EUR"},"AU":{"priceMicros":"23990000","currency":"AUD"},"PK":{"priceMicros":"2400000000","currency":"PKR"},"PY":{"priceMicros":"90000000000","currency":"PYG"},"BH":{"priceMicros":"15990000","currency":"USD"},"BR":{"priceMicros":"61990000","currency":"BRL"},"BM":{"priceMicros":"14990000","currency":"USD"},"BG":{"priceMicros":"31990000","currency":"BGN"},"BE":{"priceMicros":"15990000","currency":"EUR"},"PL":{"priceMicros":"72990000","currency":"PLN"},"BO":{"priceMicros":"104990000","currency":"BOB"},"DK":{"priceMicros":"125000000","currency":"DKK"},"DE":{"priceMicros":"15990000","currency":"EUR"},"RU":{"priceMicros":"1199000000","currency":"RUB"},"FR":{"priceMicros":"15990000","currency":"EUR"},"PH":{"priceMicros":"785000000","currency":"PHP"},"FI":{"priceMicros":"16990000","currency":"EUR"},"CO":{"priceMicros":"52000000000","currency":"COP"},"CR":{"priceMicros":"8500000000","currency":"CRC"},"GE":{"priceMicros":"44000000","currency":"GEL"},"KZ":{"priceMicros":"5790000000","currency":"KZT"},"KR":{"priceMicros":"20000000000","currency":"KRW"},"NL":{"priceMicros":"15990000","currency":"EUR"},"CA":{"priceMicros":"19990000","currency":"CAD"},"GH":{"priceMicros":"80000000","currency":"GHS"},"KH":{"priceMicros":"14990000","currency":"USD"},"CZ":{"priceMicros":"419990000","currency":"CZK"},"QA":{"priceMicros":"55000000","currency":"QAR"},"KY":{"priceMicros":"14990000","currency":"USD"},"KW":{"priceMicros":"14990000","currency":"USD"},"HR":{"priceMicros":"125000000","currency":"HRK"},"KE":{"priceMicros":"1600000000","currency":"KES"},"LV":{"priceMicros":"15990000","currency":"EUR"},"LB":{"priceMicros":"22750000000","currency":"LBP"},"LT":{"priceMicros":"15990000","currency":"EUR"},"LI":{"priceMicros":"15000000","currency":"CHF"},"LU":{"priceMicros":"15990000","currency":"EUR"},"RO":{"priceMicros":"74990000","currency":"RON"},"MY":{"priceMicros":"62990000","currency":"MYR"},"US":{"priceMicros":"14990000","currency":"USD"},"BD":{"priceMicros":"1300000000","currency":"BDT"},"PE":{"priceMicros":"50990000","currency":"PEN"},"MM":{"priceMicros":"23000000000","currency":"MMK"},"MA":{"priceMicros":"144990000","currency":"MAD"},"MX":{"priceMicros":"299000000","currency":"MXN"},"ZA":{"priceMicros":"264990000","currency":"ZAR"},"NG":{"priceMicros":"5440000000","currency":"NGN"},"NO":{"priceMicros":"169000000","currency":"NOK"},"PT":{"priceMicros":"16990000","currency":"EUR"},"JP":{"priceMicros":"1590000000","currency":"JPY"},"SE":{"priceMicros":"179000000","currency":"SEK"},"CH":{"priceMicros":"15000000","currency":"CHF"},"RS":{"priceMicros":"1899000000","currency":"RSD"},"CY":{"priceMicros":"15990000","currency":"EUR"},"SA":{"priceMicros":"58990000","currency":"SAR"},"LK":{"priceMicros":"2700000000","currency":"LKR"},"SK":{"priceMicros":"15990000","currency":"EUR"},"SI":{"priceMicros":"16990000","currency":"EUR"},"TW":{"priceMicros":"490000000","currency":"TWD"},"TH":{"priceMicros":"450000000","currency":"THB"},"TZ":{"priceMicros":"34000000000","currency":"TZS"},"TC":{"priceMicros":"14990000","currency":"USD"},"TR":{"priceMicros":"104990000","currency":"TRY"},"UA":{"priceMicros":"374990000","currency":"UAH"},"ES":{"priceMicros":"15990000","currency":"EUR"},"GR":{"priceMicros":"16990000","currency":"EUR"},"SG":{"priceMicros":"20980000","currency":"SGD"},"NZ":{"priceMicros":"26990000","currency":"NZD"},"HU":{"priceMicros":"5690000000","currency":"HUF"},"IQ":{"priceMicros":"17600000000","currency":"IQD"},"IL":{"priceMicros":"52900000","currency":"ILS"},"IT":{"priceMicros":"16990000","currency":"EUR"},"IN":{"priceMicros":"1250000000","currency":"INR"},"ID":{"priceMicros":"219000000000","currency":"IDR"},"GB":{"priceMicros":"14490000","currency":"GBP"},"VG":{"priceMicros":"14990000","currency":"USD"},"JO":{"priceMicros":"10650000","currency":"JOD"},"VN":{"priceMicros":"348000000000","currency":"VND"},"CL":{"priceMicros":"10800000000","currency":"CLP"},"MO":{"priceMicros":"119000000","currency":"MOP"},"HK":{"priceMicros":"118000000","currency":"HKD"}}
         * listings : {"zh-CN":{"title":"test3","description":"测试商品3"}}
         * defaultLanguage : zh-CN
         */

        private String packageName;
        private String sku;
        private String status;
        private String purchaseType;
        private DefaultPriceBean defaultPrice;
        private PricesBean prices;
        private ListingsBean listings;
        private String defaultLanguage;

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPurchaseType() {
            return purchaseType;
        }

        public void setPurchaseType(String purchaseType) {
            this.purchaseType = purchaseType;
        }

        public DefaultPriceBean getDefaultPrice() {
            return defaultPrice;
        }

        public void setDefaultPrice(DefaultPriceBean defaultPrice) {
            this.defaultPrice = defaultPrice;
        }

        public PricesBean getPrices() {
            return prices;
        }

        public void setPrices(PricesBean prices) {
            this.prices = prices;
        }

        public ListingsBean getListings() {
            return listings;
        }

        public void setListings(ListingsBean listings) {
            this.listings = listings;
        }

        public String getDefaultLanguage() {
            return defaultLanguage;
        }

        public void setDefaultLanguage(String defaultLanguage) {
            this.defaultLanguage = defaultLanguage;
        }

        public static class DefaultPriceBean {
            /**
             * priceMicros : 15000000
             * currency : USD
             */

            private String priceMicros;
            private String currency;

            public String getPriceMicros() {
                return priceMicros;
            }

            public void setPriceMicros(String priceMicros) {
                this.priceMicros = priceMicros;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }
        }

        public static class PricesBean {
            /**
             * DZ : {"priceMicros":"1800000000","currency":"DZD"}
             * AE : {"priceMicros":"57990000","currency":"AED"}
             * OM : {"priceMicros":"14990000","currency":"USD"}
             * EG : {"priceMicros":"249990000","currency":"EGP"}
             * IE : {"priceMicros":"16990000","currency":"EUR"}
             * EE : {"priceMicros":"15990000","currency":"EUR"}
             * AT : {"priceMicros":"15990000","currency":"EUR"}
             * AU : {"priceMicros":"23990000","currency":"AUD"}
             * PK : {"priceMicros":"2400000000","currency":"PKR"}
             * PY : {"priceMicros":"90000000000","currency":"PYG"}
             * BH : {"priceMicros":"15990000","currency":"USD"}
             * BR : {"priceMicros":"61990000","currency":"BRL"}
             * BM : {"priceMicros":"14990000","currency":"USD"}
             * BG : {"priceMicros":"31990000","currency":"BGN"}
             * BE : {"priceMicros":"15990000","currency":"EUR"}
             * PL : {"priceMicros":"72990000","currency":"PLN"}
             * BO : {"priceMicros":"104990000","currency":"BOB"}
             * DK : {"priceMicros":"125000000","currency":"DKK"}
             * DE : {"priceMicros":"15990000","currency":"EUR"}
             * RU : {"priceMicros":"1199000000","currency":"RUB"}
             * FR : {"priceMicros":"15990000","currency":"EUR"}
             * PH : {"priceMicros":"785000000","currency":"PHP"}
             * FI : {"priceMicros":"16990000","currency":"EUR"}
             * CO : {"priceMicros":"52000000000","currency":"COP"}
             * CR : {"priceMicros":"8500000000","currency":"CRC"}
             * GE : {"priceMicros":"44000000","currency":"GEL"}
             * KZ : {"priceMicros":"5790000000","currency":"KZT"}
             * KR : {"priceMicros":"20000000000","currency":"KRW"}
             * NL : {"priceMicros":"15990000","currency":"EUR"}
             * CA : {"priceMicros":"19990000","currency":"CAD"}
             * GH : {"priceMicros":"80000000","currency":"GHS"}
             * KH : {"priceMicros":"14990000","currency":"USD"}
             * CZ : {"priceMicros":"419990000","currency":"CZK"}
             * QA : {"priceMicros":"55000000","currency":"QAR"}
             * KY : {"priceMicros":"14990000","currency":"USD"}
             * KW : {"priceMicros":"14990000","currency":"USD"}
             * HR : {"priceMicros":"125000000","currency":"HRK"}
             * KE : {"priceMicros":"1600000000","currency":"KES"}
             * LV : {"priceMicros":"15990000","currency":"EUR"}
             * LB : {"priceMicros":"22750000000","currency":"LBP"}
             * LT : {"priceMicros":"15990000","currency":"EUR"}
             * LI : {"priceMicros":"15000000","currency":"CHF"}
             * LU : {"priceMicros":"15990000","currency":"EUR"}
             * RO : {"priceMicros":"74990000","currency":"RON"}
             * MY : {"priceMicros":"62990000","currency":"MYR"}
             * US : {"priceMicros":"14990000","currency":"USD"}
             * BD : {"priceMicros":"1300000000","currency":"BDT"}
             * PE : {"priceMicros":"50990000","currency":"PEN"}
             * MM : {"priceMicros":"23000000000","currency":"MMK"}
             * MA : {"priceMicros":"144990000","currency":"MAD"}
             * MX : {"priceMicros":"299000000","currency":"MXN"}
             * ZA : {"priceMicros":"264990000","currency":"ZAR"}
             * NG : {"priceMicros":"5440000000","currency":"NGN"}
             * NO : {"priceMicros":"169000000","currency":"NOK"}
             * PT : {"priceMicros":"16990000","currency":"EUR"}
             * JP : {"priceMicros":"1590000000","currency":"JPY"}
             * SE : {"priceMicros":"179000000","currency":"SEK"}
             * CH : {"priceMicros":"15000000","currency":"CHF"}
             * RS : {"priceMicros":"1899000000","currency":"RSD"}
             * CY : {"priceMicros":"15990000","currency":"EUR"}
             * SA : {"priceMicros":"58990000","currency":"SAR"}
             * LK : {"priceMicros":"2700000000","currency":"LKR"}
             * SK : {"priceMicros":"15990000","currency":"EUR"}
             * SI : {"priceMicros":"16990000","currency":"EUR"}
             * TW : {"priceMicros":"490000000","currency":"TWD"}
             * TH : {"priceMicros":"450000000","currency":"THB"}
             * TZ : {"priceMicros":"34000000000","currency":"TZS"}
             * TC : {"priceMicros":"14990000","currency":"USD"}
             * TR : {"priceMicros":"104990000","currency":"TRY"}
             * UA : {"priceMicros":"374990000","currency":"UAH"}
             * ES : {"priceMicros":"15990000","currency":"EUR"}
             * GR : {"priceMicros":"16990000","currency":"EUR"}
             * SG : {"priceMicros":"20980000","currency":"SGD"}
             * NZ : {"priceMicros":"26990000","currency":"NZD"}
             * HU : {"priceMicros":"5690000000","currency":"HUF"}
             * IQ : {"priceMicros":"17600000000","currency":"IQD"}
             * IL : {"priceMicros":"52900000","currency":"ILS"}
             * IT : {"priceMicros":"16990000","currency":"EUR"}
             * IN : {"priceMicros":"1250000000","currency":"INR"}
             * ID : {"priceMicros":"219000000000","currency":"IDR"}
             * GB : {"priceMicros":"14490000","currency":"GBP"}
             * VG : {"priceMicros":"14990000","currency":"USD"}
             * JO : {"priceMicros":"10650000","currency":"JOD"}
             * VN : {"priceMicros":"348000000000","currency":"VND"}
             * CL : {"priceMicros":"10800000000","currency":"CLP"}
             * MO : {"priceMicros":"119000000","currency":"MOP"}
             * HK : {"priceMicros":"118000000","currency":"HKD"}
             */

            private DZBean DZ;
            private AEBean AE;
            private OMBean OM;
            private EGBean EG;
            private IEBean IE;
            private EEBean EE;
            private ATBean AT;
            private AUBean AU;
            private PKBean PK;
            private PYBean PY;
            private BHBean BH;
            private BRBean BR;
            private BMBean BM;
            private BGBean BG;
            private BEBean BE;
            private PLBean PL;
            private BOBean BO;
            private DKBean DK;
            private DEBean DE;
            private RUBean RU;
            private FRBean FR;
            private PHBean PH;
            private FIBean FI;
            private COBean CO;
            private CRBean CR;
            private GEBean GE;
            private KZBean KZ;
            private KRBean KR;
            private NLBean NL;
            private CABean CA;
            private GHBean GH;
            private KHBean KH;
            private CZBean CZ;
            private QABean QA;
            private KYBean KY;
            private KWBean KW;
            private HRBean HR;
            private KEBean KE;
            private LVBean LV;
            private LBBean LB;
            private LTBean LT;
            private LIBean LI;
            private LUBean LU;
            private ROBean RO;
            private MYBean MY;
            private USBean US;
            private BDBean BD;
            private PEBean PE;
            private MMBean MM;
            private MABean MA;
            private MXBean MX;
            private ZABean ZA;
            private NGBean NG;
            private NOBean NO;
            private PTBean PT;
            private JPBean JP;
            private SEBean SE;
            private CHBean CH;
            private RSBean RS;
            private CYBean CY;
            private SABean SA;
            private LKBean LK;
            private SKBean SK;
            private SIBean SI;
            private TWBean TW;
            private THBean TH;
            private TZBean TZ;
            private TCBean TC;
            private TRBean TR;
            private UABean UA;
            private ESBean ES;
            private GRBean GR;
            private SGBean SG;
            private NZBean NZ;
            private HUBean HU;
            private IQBean IQ;
            private ILBean IL;
            private ITBean IT;
            private INBean IN;
            private IDBean ID;
            private GBBean GB;
            private VGBean VG;
            private JOBean JO;
            private VNBean VN;
            private CLBean CL;
            private MOBean MO;
            private HKBean HK;

            public DZBean getDZ() {
                return DZ;
            }

            public void setDZ(DZBean DZ) {
                this.DZ = DZ;
            }

            public AEBean getAE() {
                return AE;
            }

            public void setAE(AEBean AE) {
                this.AE = AE;
            }

            public OMBean getOM() {
                return OM;
            }

            public void setOM(OMBean OM) {
                this.OM = OM;
            }

            public EGBean getEG() {
                return EG;
            }

            public void setEG(EGBean EG) {
                this.EG = EG;
            }

            public IEBean getIE() {
                return IE;
            }

            public void setIE(IEBean IE) {
                this.IE = IE;
            }

            public EEBean getEE() {
                return EE;
            }

            public void setEE(EEBean EE) {
                this.EE = EE;
            }

            public ATBean getAT() {
                return AT;
            }

            public void setAT(ATBean AT) {
                this.AT = AT;
            }

            public AUBean getAU() {
                return AU;
            }

            public void setAU(AUBean AU) {
                this.AU = AU;
            }

            public PKBean getPK() {
                return PK;
            }

            public void setPK(PKBean PK) {
                this.PK = PK;
            }

            public PYBean getPY() {
                return PY;
            }

            public void setPY(PYBean PY) {
                this.PY = PY;
            }

            public BHBean getBH() {
                return BH;
            }

            public void setBH(BHBean BH) {
                this.BH = BH;
            }

            public BRBean getBR() {
                return BR;
            }

            public void setBR(BRBean BR) {
                this.BR = BR;
            }

            public BMBean getBM() {
                return BM;
            }

            public void setBM(BMBean BM) {
                this.BM = BM;
            }

            public BGBean getBG() {
                return BG;
            }

            public void setBG(BGBean BG) {
                this.BG = BG;
            }

            public BEBean getBE() {
                return BE;
            }

            public void setBE(BEBean BE) {
                this.BE = BE;
            }

            public PLBean getPL() {
                return PL;
            }

            public void setPL(PLBean PL) {
                this.PL = PL;
            }

            public BOBean getBO() {
                return BO;
            }

            public void setBO(BOBean BO) {
                this.BO = BO;
            }

            public DKBean getDK() {
                return DK;
            }

            public void setDK(DKBean DK) {
                this.DK = DK;
            }

            public DEBean getDE() {
                return DE;
            }

            public void setDE(DEBean DE) {
                this.DE = DE;
            }

            public RUBean getRU() {
                return RU;
            }

            public void setRU(RUBean RU) {
                this.RU = RU;
            }

            public FRBean getFR() {
                return FR;
            }

            public void setFR(FRBean FR) {
                this.FR = FR;
            }

            public PHBean getPH() {
                return PH;
            }

            public void setPH(PHBean PH) {
                this.PH = PH;
            }

            public FIBean getFI() {
                return FI;
            }

            public void setFI(FIBean FI) {
                this.FI = FI;
            }

            public COBean getCO() {
                return CO;
            }

            public void setCO(COBean CO) {
                this.CO = CO;
            }

            public CRBean getCR() {
                return CR;
            }

            public void setCR(CRBean CR) {
                this.CR = CR;
            }

            public GEBean getGE() {
                return GE;
            }

            public void setGE(GEBean GE) {
                this.GE = GE;
            }

            public KZBean getKZ() {
                return KZ;
            }

            public void setKZ(KZBean KZ) {
                this.KZ = KZ;
            }

            public KRBean getKR() {
                return KR;
            }

            public void setKR(KRBean KR) {
                this.KR = KR;
            }

            public NLBean getNL() {
                return NL;
            }

            public void setNL(NLBean NL) {
                this.NL = NL;
            }

            public CABean getCA() {
                return CA;
            }

            public void setCA(CABean CA) {
                this.CA = CA;
            }

            public GHBean getGH() {
                return GH;
            }

            public void setGH(GHBean GH) {
                this.GH = GH;
            }

            public KHBean getKH() {
                return KH;
            }

            public void setKH(KHBean KH) {
                this.KH = KH;
            }

            public CZBean getCZ() {
                return CZ;
            }

            public void setCZ(CZBean CZ) {
                this.CZ = CZ;
            }

            public QABean getQA() {
                return QA;
            }

            public void setQA(QABean QA) {
                this.QA = QA;
            }

            public KYBean getKY() {
                return KY;
            }

            public void setKY(KYBean KY) {
                this.KY = KY;
            }

            public KWBean getKW() {
                return KW;
            }

            public void setKW(KWBean KW) {
                this.KW = KW;
            }

            public HRBean getHR() {
                return HR;
            }

            public void setHR(HRBean HR) {
                this.HR = HR;
            }

            public KEBean getKE() {
                return KE;
            }

            public void setKE(KEBean KE) {
                this.KE = KE;
            }

            public LVBean getLV() {
                return LV;
            }

            public void setLV(LVBean LV) {
                this.LV = LV;
            }

            public LBBean getLB() {
                return LB;
            }

            public void setLB(LBBean LB) {
                this.LB = LB;
            }

            public LTBean getLT() {
                return LT;
            }

            public void setLT(LTBean LT) {
                this.LT = LT;
            }

            public LIBean getLI() {
                return LI;
            }

            public void setLI(LIBean LI) {
                this.LI = LI;
            }

            public LUBean getLU() {
                return LU;
            }

            public void setLU(LUBean LU) {
                this.LU = LU;
            }

            public ROBean getRO() {
                return RO;
            }

            public void setRO(ROBean RO) {
                this.RO = RO;
            }

            public MYBean getMY() {
                return MY;
            }

            public void setMY(MYBean MY) {
                this.MY = MY;
            }

            public USBean getUS() {
                return US;
            }

            public void setUS(USBean US) {
                this.US = US;
            }

            public BDBean getBD() {
                return BD;
            }

            public void setBD(BDBean BD) {
                this.BD = BD;
            }

            public PEBean getPE() {
                return PE;
            }

            public void setPE(PEBean PE) {
                this.PE = PE;
            }

            public MMBean getMM() {
                return MM;
            }

            public void setMM(MMBean MM) {
                this.MM = MM;
            }

            public MABean getMA() {
                return MA;
            }

            public void setMA(MABean MA) {
                this.MA = MA;
            }

            public MXBean getMX() {
                return MX;
            }

            public void setMX(MXBean MX) {
                this.MX = MX;
            }

            public ZABean getZA() {
                return ZA;
            }

            public void setZA(ZABean ZA) {
                this.ZA = ZA;
            }

            public NGBean getNG() {
                return NG;
            }

            public void setNG(NGBean NG) {
                this.NG = NG;
            }

            public NOBean getNO() {
                return NO;
            }

            public void setNO(NOBean NO) {
                this.NO = NO;
            }

            public PTBean getPT() {
                return PT;
            }

            public void setPT(PTBean PT) {
                this.PT = PT;
            }

            public JPBean getJP() {
                return JP;
            }

            public void setJP(JPBean JP) {
                this.JP = JP;
            }

            public SEBean getSE() {
                return SE;
            }

            public void setSE(SEBean SE) {
                this.SE = SE;
            }

            public CHBean getCH() {
                return CH;
            }

            public void setCH(CHBean CH) {
                this.CH = CH;
            }

            public RSBean getRS() {
                return RS;
            }

            public void setRS(RSBean RS) {
                this.RS = RS;
            }

            public CYBean getCY() {
                return CY;
            }

            public void setCY(CYBean CY) {
                this.CY = CY;
            }

            public SABean getSA() {
                return SA;
            }

            public void setSA(SABean SA) {
                this.SA = SA;
            }

            public LKBean getLK() {
                return LK;
            }

            public void setLK(LKBean LK) {
                this.LK = LK;
            }

            public SKBean getSK() {
                return SK;
            }

            public void setSK(SKBean SK) {
                this.SK = SK;
            }

            public SIBean getSI() {
                return SI;
            }

            public void setSI(SIBean SI) {
                this.SI = SI;
            }

            public TWBean getTW() {
                return TW;
            }

            public void setTW(TWBean TW) {
                this.TW = TW;
            }

            public THBean getTH() {
                return TH;
            }

            public void setTH(THBean TH) {
                this.TH = TH;
            }

            public TZBean getTZ() {
                return TZ;
            }

            public void setTZ(TZBean TZ) {
                this.TZ = TZ;
            }

            public TCBean getTC() {
                return TC;
            }

            public void setTC(TCBean TC) {
                this.TC = TC;
            }

            public TRBean getTR() {
                return TR;
            }

            public void setTR(TRBean TR) {
                this.TR = TR;
            }

            public UABean getUA() {
                return UA;
            }

            public void setUA(UABean UA) {
                this.UA = UA;
            }

            public ESBean getES() {
                return ES;
            }

            public void setES(ESBean ES) {
                this.ES = ES;
            }

            public GRBean getGR() {
                return GR;
            }

            public void setGR(GRBean GR) {
                this.GR = GR;
            }

            public SGBean getSG() {
                return SG;
            }

            public void setSG(SGBean SG) {
                this.SG = SG;
            }

            public NZBean getNZ() {
                return NZ;
            }

            public void setNZ(NZBean NZ) {
                this.NZ = NZ;
            }

            public HUBean getHU() {
                return HU;
            }

            public void setHU(HUBean HU) {
                this.HU = HU;
            }

            public IQBean getIQ() {
                return IQ;
            }

            public void setIQ(IQBean IQ) {
                this.IQ = IQ;
            }

            public ILBean getIL() {
                return IL;
            }

            public void setIL(ILBean IL) {
                this.IL = IL;
            }

            public ITBean getIT() {
                return IT;
            }

            public void setIT(ITBean IT) {
                this.IT = IT;
            }

            public INBean getIN() {
                return IN;
            }

            public void setIN(INBean IN) {
                this.IN = IN;
            }

            public IDBean getID() {
                return ID;
            }

            public void setID(IDBean ID) {
                this.ID = ID;
            }

            public GBBean getGB() {
                return GB;
            }

            public void setGB(GBBean GB) {
                this.GB = GB;
            }

            public VGBean getVG() {
                return VG;
            }

            public void setVG(VGBean VG) {
                this.VG = VG;
            }

            public JOBean getJO() {
                return JO;
            }

            public void setJO(JOBean JO) {
                this.JO = JO;
            }

            public VNBean getVN() {
                return VN;
            }

            public void setVN(VNBean VN) {
                this.VN = VN;
            }

            public CLBean getCL() {
                return CL;
            }

            public void setCL(CLBean CL) {
                this.CL = CL;
            }

            public MOBean getMO() {
                return MO;
            }

            public void setMO(MOBean MO) {
                this.MO = MO;
            }

            public HKBean getHK() {
                return HK;
            }

            public void setHK(HKBean HK) {
                this.HK = HK;
            }

            public static class DZBean {
                /**
                 * priceMicros : 1800000000
                 * currency : DZD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class AEBean {
                /**
                 * priceMicros : 57990000
                 * currency : AED
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class OMBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class EGBean {
                /**
                 * priceMicros : 249990000
                 * currency : EGP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class IEBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class EEBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ATBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class AUBean {
                /**
                 * priceMicros : 23990000
                 * currency : AUD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PKBean {
                /**
                 * priceMicros : 2400000000
                 * currency : PKR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PYBean {
                /**
                 * priceMicros : 90000000000
                 * currency : PYG
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BHBean {
                /**
                 * priceMicros : 15990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BRBean {
                /**
                 * priceMicros : 61990000
                 * currency : BRL
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BMBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BGBean {
                /**
                 * priceMicros : 31990000
                 * currency : BGN
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BEBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PLBean {
                /**
                 * priceMicros : 72990000
                 * currency : PLN
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BOBean {
                /**
                 * priceMicros : 104990000
                 * currency : BOB
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class DKBean {
                /**
                 * priceMicros : 125000000
                 * currency : DKK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class DEBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class RUBean {
                /**
                 * priceMicros : 1199000000
                 * currency : RUB
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class FRBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PHBean {
                /**
                 * priceMicros : 785000000
                 * currency : PHP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class FIBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class COBean {
                /**
                 * priceMicros : 52000000000
                 * currency : COP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CRBean {
                /**
                 * priceMicros : 8500000000
                 * currency : CRC
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class GEBean {
                /**
                 * priceMicros : 44000000
                 * currency : GEL
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KZBean {
                /**
                 * priceMicros : 5790000000
                 * currency : KZT
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KRBean {
                /**
                 * priceMicros : 20000000000
                 * currency : KRW
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class NLBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CABean {
                /**
                 * priceMicros : 19990000
                 * currency : CAD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class GHBean {
                /**
                 * priceMicros : 80000000
                 * currency : GHS
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KHBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CZBean {
                /**
                 * priceMicros : 419990000
                 * currency : CZK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class QABean {
                /**
                 * priceMicros : 55000000
                 * currency : QAR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KYBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KWBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class HRBean {
                /**
                 * priceMicros : 125000000
                 * currency : HRK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class KEBean {
                /**
                 * priceMicros : 1600000000
                 * currency : KES
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LVBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LBBean {
                /**
                 * priceMicros : 22750000000
                 * currency : LBP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LTBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LIBean {
                /**
                 * priceMicros : 15000000
                 * currency : CHF
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LUBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ROBean {
                /**
                 * priceMicros : 74990000
                 * currency : RON
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class MYBean {
                /**
                 * priceMicros : 62990000
                 * currency : MYR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class USBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class BDBean {
                /**
                 * priceMicros : 1300000000
                 * currency : BDT
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PEBean {
                /**
                 * priceMicros : 50990000
                 * currency : PEN
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class MMBean {
                /**
                 * priceMicros : 23000000000
                 * currency : MMK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class MABean {
                /**
                 * priceMicros : 144990000
                 * currency : MAD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class MXBean {
                /**
                 * priceMicros : 299000000
                 * currency : MXN
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ZABean {
                /**
                 * priceMicros : 264990000
                 * currency : ZAR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class NGBean {
                /**
                 * priceMicros : 5440000000
                 * currency : NGN
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class NOBean {
                /**
                 * priceMicros : 169000000
                 * currency : NOK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class PTBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class JPBean {
                /**
                 * priceMicros : 1590000000
                 * currency : JPY
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class SEBean {
                /**
                 * priceMicros : 179000000
                 * currency : SEK
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CHBean {
                /**
                 * priceMicros : 15000000
                 * currency : CHF
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class RSBean {
                /**
                 * priceMicros : 1899000000
                 * currency : RSD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CYBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class SABean {
                /**
                 * priceMicros : 58990000
                 * currency : SAR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class LKBean {
                /**
                 * priceMicros : 2700000000
                 * currency : LKR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class SKBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class SIBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class TWBean {
                /**
                 * priceMicros : 490000000
                 * currency : TWD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class THBean {
                /**
                 * priceMicros : 450000000
                 * currency : THB
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class TZBean {
                /**
                 * priceMicros : 34000000000
                 * currency : TZS
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class TCBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class TRBean {
                /**
                 * priceMicros : 104990000
                 * currency : TRY
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class UABean {
                /**
                 * priceMicros : 374990000
                 * currency : UAH
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ESBean {
                /**
                 * priceMicros : 15990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class GRBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class SGBean {
                /**
                 * priceMicros : 20980000
                 * currency : SGD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class NZBean {
                /**
                 * priceMicros : 26990000
                 * currency : NZD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class HUBean {
                /**
                 * priceMicros : 5690000000
                 * currency : HUF
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class IQBean {
                /**
                 * priceMicros : 17600000000
                 * currency : IQD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ILBean {
                /**
                 * priceMicros : 52900000
                 * currency : ILS
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class ITBean {
                /**
                 * priceMicros : 16990000
                 * currency : EUR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class INBean {
                /**
                 * priceMicros : 1250000000
                 * currency : INR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class IDBean {
                /**
                 * priceMicros : 219000000000
                 * currency : IDR
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class GBBean {
                /**
                 * priceMicros : 14490000
                 * currency : GBP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class VGBean {
                /**
                 * priceMicros : 14990000
                 * currency : USD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class JOBean {
                /**
                 * priceMicros : 10650000
                 * currency : JOD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class VNBean {
                /**
                 * priceMicros : 348000000000
                 * currency : VND
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class CLBean {
                /**
                 * priceMicros : 10800000000
                 * currency : CLP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class MOBean {
                /**
                 * priceMicros : 119000000
                 * currency : MOP
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }

            public static class HKBean {
                /**
                 * priceMicros : 118000000
                 * currency : HKD
                 */

                private String priceMicros;
                private String currency;

                public String getPriceMicros() {
                    return priceMicros;
                }

                public void setPriceMicros(String priceMicros) {
                    this.priceMicros = priceMicros;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }
            }
        }

        public static class ListingsBean {
            /**
             * zh-CN : {"title":"test3","description":"测试商品3"}
             */

            @SerializedName("zh-CN")
            private ZhCNBean zhCN;

            public ZhCNBean getZhCN() {
                return zhCN;
            }

            public void setZhCN(ZhCNBean zhCN) {
                this.zhCN = zhCN;
            }

            public static class ZhCNBean {
                /**
                 * title : test3
                 * description : 测试商品3
                 */

                private String title;
                private String description;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }
            }
        }
    }
}
