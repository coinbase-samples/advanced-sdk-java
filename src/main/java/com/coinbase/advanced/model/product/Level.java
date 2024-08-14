package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level {

    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    public Level() {}

    private Level(Builder builder) {
        this.price = builder.price;
        this.size = builder.size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static class Builder {
        private String price;
        private String size;

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Level build() {
            return new Level(this);
        }
    }
}
