package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFuturesPositionResponse {

    @JsonProperty("position")
    private FuturesPosition position;

    public GetFuturesPositionResponse() {}

    private GetFuturesPositionResponse(Builder builder) {
        this.position = builder.position;
    }

    public FuturesPosition getPosition() {
        return position;
    }

    public void setPosition(FuturesPosition position) {
        this.position = position;
    }

    public static class Builder {
        private FuturesPosition position;

        public Builder position(FuturesPosition position) {
            this.position = position;
            return this;
        }

        public static Builder from(GetFuturesPositionResponse resp) {
            return new Builder().position(resp.getPosition());
        }

        public GetFuturesPositionResponse build() {
            return new GetFuturesPositionResponse(this);
        }
    }
}
