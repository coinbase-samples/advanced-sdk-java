package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleFuturesSweepRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("usd_amount")
    private String usdAmount;

    public ScheduleFuturesSweepRequest(String usdAmount) {
        this.usdAmount = usdAmount;
    }

    public String getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(String usdAmount) {
        this.usdAmount = usdAmount;
    }

    @Override
    public String getPath() {
        return "/brokerage/cfm/sweeps/schedule";
    }

    @Override
    public String getBody() {
        return "{\"usd_amount\":\"" + usdAmount + "\"}";
    }

    public static class Builder {
        private String usdAmount;

        public Builder usdAmount(String usdAmount) {
            this.usdAmount = usdAmount;
            return this;
        }

        public ScheduleFuturesSweepRequest build() {
            return new ScheduleFuturesSweepRequest(usdAmount);
        }
    }
}
