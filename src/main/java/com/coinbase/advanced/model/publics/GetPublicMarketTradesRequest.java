package com.coinbase.advanced.model.publics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPublicMarketTradesRequest {
    @JsonProperty("product_id")
    @JsonIgnore
    private String productId;

    private Integer limit;

    private String start;

    private String end;

    public GetPublicMarketTradesRequest(String productId) {
        this.productId = productId;
    }

    private GetPublicMarketTradesRequest(Builder builder) {
        this.productId = builder.productId;
        this.limit = builder.limit;
        this.start = builder.start;
        this.end = builder.end;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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

    public static class Builder {
        private String productId;
        private Integer limit;
        private String start;
        private String end;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
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

        public GetPublicMarketTradesRequest build() {
            return new GetPublicMarketTradesRequest(this);
        }
    }
}
