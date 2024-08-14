package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxDetail {

    @JsonProperty("name")
    private String name;

    @JsonProperty("amount")
    private Amount amount;

    public TaxDetail() {}

    private TaxDetail(Builder builder) {
        this.name = builder.name;
        this.amount = builder.amount;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    // Builder class
    public static class Builder {
        private String name;
        private Amount amount;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        public TaxDetail build() {
            return new TaxDetail(this);
        }
    }
}