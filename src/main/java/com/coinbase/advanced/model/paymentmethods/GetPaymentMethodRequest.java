package com.coinbase.advanced.model.paymentmethods;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPaymentMethodRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("payment_method_id")
    private String paymentMethodId;

    public GetPaymentMethodRequest() {}

    private GetPaymentMethodRequest(Builder builder) {
        this.paymentMethodId = builder.paymentMethodId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @Override
    public String getPath() {
        return String.format("/brokerage/payment_methods/%s", paymentMethodId);
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String paymentMethodId;

        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public GetPaymentMethodRequest build() {
            return new GetPaymentMethodRequest(this);
        }
    }
}
