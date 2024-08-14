package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketIoc {
    @JsonProperty("quote_size")
    private String quoteSize;

    @JsonProperty("base_size")
    private String baseSize;

    public String getQuoteSize() {
        return quoteSize;
    }

    public void setQuoteSize(String quoteSize) {
        this.quoteSize = quoteSize;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    // Builder Class
    public static class Builder {
        private String quoteSize;
        private String baseSize;

        public Builder quoteSize(String quoteSize) {
            this.quoteSize = quoteSize;
            return this;
        }

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public MarketIoc build() {
            MarketIoc marketIoc = new MarketIoc();
            marketIoc.quoteSize = this.quoteSize;
            marketIoc.baseSize = this.baseSize;
            return marketIoc;
        }
    }
}
