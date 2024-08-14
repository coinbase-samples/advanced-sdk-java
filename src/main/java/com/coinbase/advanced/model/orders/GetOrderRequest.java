package com.coinbase.advanced.model.orders;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetOrderRequest implements CoinbaseAdvancedGetRequest {

    private String orderId;

    public GetOrderRequest() {}

    private GetOrderRequest(Builder builder) {
        this.orderId = builder.orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getPath() {
        return "/brokerage/orders/historical/" + orderId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String orderId;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public GetOrderRequest build() {
            return new GetOrderRequest(this);
        }
    }
}
