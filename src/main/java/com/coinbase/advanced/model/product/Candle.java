package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Candle {

    @JsonProperty("start")
    private String start;

    @JsonProperty("low")
    private String low;

    @JsonProperty("high")
    private String high;

    @JsonProperty("open")
    private String open;

    @JsonProperty("close")
    private String close;

    @JsonProperty("volume")
    private String volume;

    public Candle() {}

    private Candle(Builder builder) {
        this.start = builder.start;
        this.low = builder.low;
        this.high = builder.high;
        this.open = builder.open;
        this.close = builder.close;
        this.volume = builder.volume;
    }

    // Getters and Setters

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public static class Builder {
        private String start;
        private String low;
        private String high;
        private String open;
        private String close;
        private String volume;

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder low(String low) {
            this.low = low;
            return this;
        }

        public Builder high(String high) {
            this.high = high;
            return this;
        }

        public Builder open(String open) {
            this.open = open;
            return this;
        }

        public Builder close(String close) {
            this.close = close;
            return this;
        }

        public Builder volume(String volume) {
            this.volume = volume;
            return this;
        }

        public Candle build() {
            return new Candle(this);
        }
    }
}