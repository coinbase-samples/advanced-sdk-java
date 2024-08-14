package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Fee {

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("amount")
    private Amount amount;

    @JsonProperty("label")
    private String label;

    @JsonProperty("disclosure")
    private Disclosure disclosure;

    public Fee() {}

    private Fee(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.amount = builder.amount;
        this.label = builder.label;
        this.disclosure = builder.disclosure;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Disclosure getDisclosure() {
        return disclosure;
    }

    public void setDisclosure(Disclosure disclosure) {
        this.disclosure = disclosure;
    }

    public static class Builder {
        private String title;
        private String description;
        private Amount amount;
        private String label;
        private Disclosure disclosure;

        public Builder() {}

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder disclosure(Disclosure disclosure) {
            this.disclosure = disclosure;
            return this;
        }

        public Fee build() {
            return new Fee(this);
        }
    }
}