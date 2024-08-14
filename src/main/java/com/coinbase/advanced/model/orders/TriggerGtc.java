package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerGtc {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("stop_trigger_price")
    private String stopTriggerPrice;

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

    // Builder Class
    public static class Builder {
        private String baseSize;
        private String limitPrice;
        private String stopTriggerPrice;

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

        public TriggerGtc build() {
            TriggerGtc triggerGtc = new TriggerGtc();
            triggerGtc.baseSize = this.baseSize;
            triggerGtc.limitPrice = this.limitPrice;
            triggerGtc.stopTriggerPrice = this.stopTriggerPrice;
            return triggerGtc;
        }
    }
}
