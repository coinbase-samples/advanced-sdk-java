package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPerpetualsPositionResponse {

    @JsonProperty("position")
    private IntxPosition position;

    public GetPerpetualsPositionResponse() {}

    private GetPerpetualsPositionResponse(Builder builder) {
        this.position = builder.position;
    }

    public IntxPosition getPosition() {
        return position;
    }

    public void setPosition(IntxPosition position) {
        this.position = position;
    }

    public static class Builder {
        private IntxPosition position;

        public Builder position(IntxPosition position) {
            this.position = position;
            return this;
        }

        public static Builder from(GetPerpetualsPositionResponse resp) {
            return new Builder()
                    .position(resp.getPosition());
        }

        public GetPerpetualsPositionResponse build() {
            return new GetPerpetualsPositionResponse(this);
        }
    }
}
