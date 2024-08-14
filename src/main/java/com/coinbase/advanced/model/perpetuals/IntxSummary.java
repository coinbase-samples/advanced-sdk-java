package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntxSummary {

    @JsonProperty("aggregated_pnl")
    private Amount aggregatedPnl;

    public IntxSummary() {}

    private IntxSummary(Builder builder) {
        this.aggregatedPnl = builder.aggregatedPnl;
    }

    public Amount getAggregatedPnl() {
        return aggregatedPnl;
    }

    public void setAggregatedPnl(Amount aggregatedPnl) {
        this.aggregatedPnl = aggregatedPnl;
    }

    public static class Builder {
        private Amount aggregatedPnl;

        public Builder() {}

        public Builder aggregatedPnl(Amount aggregatedPnl) {
            this.aggregatedPnl = aggregatedPnl;
            return this;
        }

        public IntxSummary build() {
            return new IntxSummary(this);
        }
    }
}
