package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetConvertTradeResponse {

    @JsonProperty("trade")
    private Convert convert;

    public GetConvertTradeResponse() {}

    private GetConvertTradeResponse(Builder builder) {
        this.convert = builder.convert;
    }

    public Convert getConvert() {
        return convert;
    }

    public static class Builder {
        private Convert convert;

        public Builder convert(Convert convert) {
            this.convert = convert;
            return this;
        }

        public static Builder from(GetConvertTradeResponse resp) {
            return new Builder().convert(resp.getConvert());
        }

        public GetConvertTradeResponse build() {
            return new GetConvertTradeResponse(this);
        }
    }
}
