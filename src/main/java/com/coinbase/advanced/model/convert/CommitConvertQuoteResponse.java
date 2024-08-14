package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommitConvertQuoteResponse {

    @JsonProperty("trade")
    private Convert trade;

    public CommitConvertQuoteResponse() {}

    private CommitConvertQuoteResponse(Builder builder) {
        this.trade = builder.trade;
    }

    public Convert getTrade() {
        return trade;
    }

    public void setTrade(Convert trade) {
        this.trade = trade;
    }

    public static class Builder {
        private Convert trade;

        public Builder() {}

        public Builder trade(Convert trade) {
            this.trade = trade;
            return this;
        }

        public static Builder from(CommitConvertQuoteResponse resp) {
            return new Builder().trade(resp.getTrade());
        }

        public CommitConvertQuoteResponse build() {
            return new CommitConvertQuoteResponse(this);
        }
    }
}
