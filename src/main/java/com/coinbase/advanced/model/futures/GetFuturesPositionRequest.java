package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetFuturesPositionRequest implements CoinbaseAdvancedGetRequest {

    private final String productId;

    public GetFuturesPositionRequest(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String getPath() {
        return "/brokerage/cfm/positions/" + productId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String productId;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public GetFuturesPositionRequest build() {
            return new GetFuturesPositionRequest(productId);
        }
    }
}
