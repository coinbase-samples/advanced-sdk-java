package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {

    @JsonProperty("value")
    private String value;

    public Rate() {}

    private Rate(Builder builder) {
        this.value = builder.value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        private String value;

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Rate build() {
            return new Rate(this);
        }
    }
}
