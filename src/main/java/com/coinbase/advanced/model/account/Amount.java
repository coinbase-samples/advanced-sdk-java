package com.coinbase.advanced.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amount {

    @JsonProperty("value")
    private String value;

    @JsonProperty("currency")
    private String currency;

    public Amount() {}

    private Amount(Builder builder) {
        this.value = builder.value;
        this.currency = builder.currency;
    }

    public static class Builder {
        private String value;
        private String currency;

        public Builder() {}

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Amount build() {
            return new Amount(this);
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
