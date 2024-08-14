package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFuturesPositionsResponse {

    @JsonProperty("positions")
    private FuturesPosition positions;

    public ListFuturesPositionsResponse() {}

    private ListFuturesPositionsResponse(Builder builder) {
        this.positions = builder.positions;
    }

    public FuturesPosition getPositions() {
        return positions;
    }

    public void setPositions(FuturesPosition positions) {
        this.positions = positions;
    }

    public static class Builder {
        private FuturesPosition positions;

        public Builder positions(FuturesPosition positions) {
            this.positions = positions;
            return this;
        }

        public static Builder from(ListFuturesPositionsResponse resp) {
            return new Builder()
                    .positions(resp.getPositions());
        }

        public ListFuturesPositionsResponse build() {
            return new ListFuturesPositionsResponse(this);
        }
    }
}
