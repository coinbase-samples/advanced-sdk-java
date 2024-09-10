package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LimitGtd {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("post_only")
    private boolean postOnly;

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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public static class Builder {
        private String baseSize;
        private String limitPrice;
        private String endTime;
        private boolean postOnly;

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder postOnly(boolean postOnly) {
            this.postOnly = postOnly;
            return this;
        }

        public LimitGtd build() {
            LimitGtd limitGtd = new LimitGtd();
            limitGtd.baseSize = this.baseSize;
            limitGtd.limitPrice = this.limitPrice;
            limitGtd.endTime = this.endTime;
            limitGtd.postOnly = this.postOnly;
            return limitGtd;
        }
    }
}
