package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFuturesBalanceSummaryResponse {

    @JsonProperty("balance_summary")
    private BalanceSummary balanceSummary;

    public GetFuturesBalanceSummaryResponse() {}

    private GetFuturesBalanceSummaryResponse(Builder builder) {
        this.balanceSummary = builder.balanceSummary;
    }

    public BalanceSummary getBalanceSummary() {
        return balanceSummary;
    }

    public void setBalanceSummary(BalanceSummary balanceSummary) {
        this.balanceSummary = balanceSummary;
    }

    public static class Builder {
        private BalanceSummary balanceSummary;

        public Builder balanceSummary(BalanceSummary balanceSummary) {
            this.balanceSummary = balanceSummary;
            return this;
        }

        public static Builder from(GetFuturesBalanceSummaryResponse resp) {
            return new Builder().balanceSummary(resp.getBalanceSummary());
        }

        public GetFuturesBalanceSummaryResponse build() {
            return new GetFuturesBalanceSummaryResponse(this);
        }
    }
}
