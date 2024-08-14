package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetMarketTradesResponse {

    @JsonProperty("trades")
    private List<Trade> trades;

    @JsonProperty("best_bid")
    private String bestBid;

    @JsonProperty("best_ask")
    private String bestAsk;

    public GetMarketTradesResponse() {}

    private GetMarketTradesResponse(Builder builder) {
        this.trades = builder.trades;
        this.bestBid = builder.bestBid;
        this.bestAsk = builder.bestAsk;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }

    public String getBestBid() {
        return bestBid;
    }

    public void setBestBid(String bestBid) {
        this.bestBid = bestBid;
    }

    public String getBestAsk() {
        return bestAsk;
    }

    public void setBestAsk(String bestAsk) {
        this.bestAsk = bestAsk;
    }

    public static class Builder {
        private List<Trade> trades;
        private String bestBid;
        private String bestAsk;

        public Builder trades(List<Trade> trades) {
            this.trades = trades;
            return this;
        }

        public Builder bestBid(String bestBid) {
            this.bestBid = bestBid;
            return this;
        }

        public Builder bestAsk(String bestAsk) {
            this.bestAsk = bestAsk;
            return this;
        }

        public GetMarketTradesResponse build() {
            return new GetMarketTradesResponse(this);
        }
    }
}
