package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioBreakdownResponse {

    @JsonProperty("breakdown")
    private Breakdown breakdown;

    public GetPortfolioBreakdownResponse() {}

    private GetPortfolioBreakdownResponse(Builder builder) {
        this.breakdown = builder.breakdown;
    }

    public Breakdown getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Breakdown breakdown) {
        this.breakdown = breakdown;
    }

    public static class Builder {
        private Breakdown breakdown;

        public Builder breakdown(Breakdown breakdown) {
            this.breakdown = breakdown;
            return this;
        }

        public GetPortfolioBreakdownResponse build() {
            return new GetPortfolioBreakdownResponse(this);
        }
    }
}
