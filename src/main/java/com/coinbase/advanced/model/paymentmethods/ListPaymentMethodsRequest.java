package com.coinbase.advanced.model.paymentmethods;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class ListPaymentMethodsRequest implements CoinbaseAdvancedGetRequest {

    @Override
    public String getPath() {
        return "/brokerage/payment_methods";
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {

        public ListPaymentMethodsRequest build() {
            return new ListPaymentMethodsRequest();
        }
    }
}
