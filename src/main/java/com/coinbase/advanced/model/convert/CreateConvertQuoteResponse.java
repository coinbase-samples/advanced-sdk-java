package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateConvertQuoteResponse {

    @JsonProperty("trade")
    private Convert convert;

    public CreateConvertQuoteResponse() {}

    private CreateConvertQuoteResponse(Builder builder) {
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

        public static Builder from(CreateConvertQuoteResponse resp) {
            return new Builder().convert(resp.getConvert());
        }

        public CreateConvertQuoteResponse build() {
            return new CreateConvertQuoteResponse(this);
        }
    }
}
