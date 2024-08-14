package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SorLimitIoc {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    public String getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    // Builder Class
    public static class Builder {
        private String baseSize;
        private String limitPrice;

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public SorLimitIoc build() {
            SorLimitIoc sorLimitIoc = new SorLimitIoc();
            sorLimitIoc.baseSize = this.baseSize;
            sorLimitIoc.limitPrice = this.limitPrice;
            return sorLimitIoc;
        }
    }
}
