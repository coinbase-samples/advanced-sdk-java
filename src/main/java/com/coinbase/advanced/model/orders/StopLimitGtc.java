package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopLimitGtc {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("stop_direction")
    private String stopDirection;

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

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public String getStopDirection() {
        return stopDirection;
    }

    public void setStopDirection(String stopDirection) {
        this.stopDirection = stopDirection;
    }

    public static class Builder {
        private String baseSize;
        private String limitPrice;
        private String stopPrice;
        private String stopDirection;

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder stopDirection(String stopDirection) {
            this.stopDirection = stopDirection;
            return this;
        }

        public StopLimitGtc build() {
            StopLimitGtc stopLimitGtc = new StopLimitGtc();
            stopLimitGtc.baseSize = this.baseSize;
            stopLimitGtc.limitPrice = this.limitPrice;
            stopLimitGtc.stopPrice = this.stopPrice;
            stopLimitGtc.stopDirection = this.stopDirection;
            return stopLimitGtc;
        }
    }
}
