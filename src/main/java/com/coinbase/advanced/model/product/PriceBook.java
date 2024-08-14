package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PriceBook {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("bids")
    private List<Level> bids;

    @JsonProperty("asks")
    private List<Level> asks;

    @JsonProperty("time")
    private String time;

    public PriceBook() {}

    private PriceBook(Builder builder) {
        this.productId = builder.productId;
        this.bids = builder.bids;
        this.asks = builder.asks;
        this.time = builder.time;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<Level> getBids() {
        return bids;
    }

    public void setBids(List<Level> bids) {
        this.bids = bids;
    }

    public List<Level> getAsks() {
        return asks;
    }

    public void setAsks(List<Level> asks) {
        this.asks = asks;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class Builder {
        private String productId;
        private List<Level> bids;
        private List<Level> asks;
        private String time;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder bids(List<Level> bids) {
            this.bids = bids;
            return this;
        }

        public Builder asks(List<Level> asks) {
            this.asks = asks;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public PriceBook build() {
            return new PriceBook(this);
        }
    }
}
