package com.coinbase.advanced.model.fees;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gst {

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("type")
    private String type;

    public Gst() {}

    private Gst(Builder builder) {
        this.rate = builder.rate;
        this.type = builder.type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String rate;
        private String type;

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Gst build() {
            return new Gst(this);
        }
    }
}
