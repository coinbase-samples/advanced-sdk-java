package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopLimitGtd {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("end_time")
    private String endTime;

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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStopDirection() {
        return stopDirection;
    }

    public void setStopDirection(String stopDirection) {
        this.stopDirection = stopDirection;
    }

    // Builder Class
    public static class Builder {
        private String baseSize;
        private String limitPrice;
        private String stopPrice;
        private String endTime;
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

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder stopDirection(String stopDirection) {
            this.stopDirection = stopDirection;
            return this;
        }

        public StopLimitGtd build() {
            StopLimitGtd stopLimitGtd = new StopLimitGtd();
            stopLimitGtd.baseSize = this.baseSize;
            stopLimitGtd.limitPrice = this.limitPrice;
            stopLimitGtd.stopPrice = this.stopPrice;
            stopLimitGtd.endTime = this.endTime;
            stopLimitGtd.stopDirection = this.stopDirection;
            return stopLimitGtd;
        }
    }
}
