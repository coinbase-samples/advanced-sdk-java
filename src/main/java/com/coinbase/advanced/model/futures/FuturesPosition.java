package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuturesPosition {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("expiration_time")
    private String expirationTime;

    @JsonProperty("side")
    private String side;

    @JsonProperty("number_of_contracts")
    private String numberOfContracts;

    @JsonProperty("current_price")
    private String currentPrice;

    @JsonProperty("avg_entry_price")
    private String avgEntryPrice;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("daily_realized_pnl")
    private String dailyRealizedPnl;

    public FuturesPosition() {}

    private FuturesPosition(Builder builder) {
        this.productId = builder.productId;
        this.expirationTime = builder.expirationTime;
        this.side = builder.side;
        this.numberOfContracts = builder.numberOfContracts;
        this.currentPrice = builder.currentPrice;
        this.avgEntryPrice = builder.avgEntryPrice;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.dailyRealizedPnl = builder.dailyRealizedPnl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getAvgEntryPrice() {
        return avgEntryPrice;
    }

    public void setAvgEntryPrice(String avgEntryPrice) {
        this.avgEntryPrice = avgEntryPrice;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public void setDailyRealizedPnl(String dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }

    public static class Builder {
        private String productId;
        private String expirationTime;
        private String side;
        private String numberOfContracts;
        private String currentPrice;
        private String avgEntryPrice;
        private String unrealizedPnl;
        private String dailyRealizedPnl;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder numberOfContracts(String numberOfContracts) {
            this.numberOfContracts = numberOfContracts;
            return this;
        }

        public Builder currentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }

        public Builder avgEntryPrice(String avgEntryPrice) {
            this.avgEntryPrice = avgEntryPrice;
            return this;
        }

        public Builder unrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder dailyRealizedPnl(String dailyRealizedPnl) {
            this.dailyRealizedPnl = dailyRealizedPnl;
            return this;
        }

        public FuturesPosition build() {
            return new FuturesPosition(this);
        }
    }
}
