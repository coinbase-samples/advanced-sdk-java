package com.coinbase.advanced.model.common;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DualCurrencyValue {

    @JsonProperty("userNativeCurrency")
    private Amount userNativeCurrency;

    @JsonProperty("rawCurrency")
    private Amount rawCurrency;

    public DualCurrencyValue() {}

    private DualCurrencyValue(Builder builder) {
        this.userNativeCurrency = builder.userNativeCurrency;
        this.rawCurrency = builder.rawCurrency;
    }

    public Amount getUserNativeCurrency() {
        return userNativeCurrency;
    }

    public void setUserNativeCurrency(Amount userNativeCurrency) {
        this.userNativeCurrency = userNativeCurrency;
    }

    public Amount getRawCurrency() {
        return rawCurrency;
    }

    public void setRawCurrency(Amount rawCurrency) {
        this.rawCurrency = rawCurrency;
    }

    public static class Builder {
        private Amount userNativeCurrency;
        private Amount rawCurrency;

        public Builder userNativeCurrency(Amount userNativeCurrency) {
            this.userNativeCurrency = userNativeCurrency;
            return this;
        }

        public Builder rawCurrency(Amount rawCurrency) {
            this.rawCurrency = rawCurrency;
            return this;
        }

        public DualCurrencyValue build() {
            return new DualCurrencyValue(this);
        }
    }
}
