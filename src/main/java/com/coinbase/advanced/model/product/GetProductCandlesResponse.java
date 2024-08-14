package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetProductCandlesResponse {

    @JsonProperty("candles")
    private List<Candle> candles;

    public GetProductCandlesResponse() {}

    private GetProductCandlesResponse(Builder builder) {
        this.candles = builder.candles;
    }

    public List<Candle> getCandles() {
        return candles;
    }

    public void setCandles(List<Candle> candles) {
        this.candles = candles;
    }

    public static class Builder {
        private List<Candle> candles;

        public Builder candles(List<Candle> candles) {
            this.candles = candles;
            return this;
        }

        public GetProductCandlesResponse build() {
            return new GetProductCandlesResponse(this);
        }
    }
}
