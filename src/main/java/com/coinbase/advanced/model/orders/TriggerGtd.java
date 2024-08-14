package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerGtd {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("stop_trigger_price")
    private String stopTriggerPrice;

    @JsonProperty("end_time")
    private String endTime;

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

    public String getStopTriggerPrice() {
        return stopTriggerPrice;
    }

    public void setStopTriggerPrice(String stopTriggerPrice) {
        this.stopTriggerPrice = stopTriggerPrice;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    // Builder Class
    public static class Builder {
        private String baseSize;
        private String limitPrice;
        private String stopTriggerPrice;
        private String endTime;

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public Builder stopTriggerPrice(String stopTriggerPrice) {
            this.stopTriggerPrice = stopTriggerPrice;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public TriggerGtd build() {
            TriggerGtd triggerGtd = new TriggerGtd();
            triggerGtd.baseSize = this.baseSize;
            triggerGtd.limitPrice = this.limitPrice;
            triggerGtd.stopTriggerPrice = this.stopTriggerPrice;
            triggerGtd.endTime = this.endTime;
            return triggerGtd;
        }
    }
}
