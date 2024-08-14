package com.coinbase.advanced.model.product;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductCandlesRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("start")
    private String start;

    @JsonProperty("end")
    private String end;

    @JsonProperty("granularity")
    private String granularity;

    public GetProductCandlesRequest() {}

    private GetProductCandlesRequest(Builder builder) {
        this.productId = builder.productId;
        this.start = builder.start;
        this.end = builder.end;
        this.granularity = builder.granularity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    @Override
    public String getPath() {
        return "/brokerage/products/" + productId + "/candles";
    }

    @Override
    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();
        queryString.append("product_id=").append(productId);
        queryString.append("&granularity=").append(granularity);
        queryString.append("&start=").append(start);
        queryString.append("&end=").append(end);
        return queryString.toString();
    }

    public static class Builder {
        private String productId;
        private String start;
        private String end;
        private String granularity;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        public GetProductCandlesRequest build() {
            return new GetProductCandlesRequest(this);
        }
    }
}
