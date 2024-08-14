package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fill {

    @JsonProperty("entry_id")
    private String entryId;

    @JsonProperty("trade_id")
    private String tradeId;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("trade_time")
    private String tradeTime;

    @JsonProperty("trade_type")
    private String tradeType;

    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    @JsonProperty("commission")
    private String commission;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("sequence_timestamp")
    private String sequenceTimestamp;

    @JsonProperty("liquidity_indicator")
    private String liquidityIndicator;

    @JsonProperty("size_in_quote")
    private boolean sizeInQuote;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    public Fill() {}

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSequenceTimestamp() {
        return sequenceTimestamp;
    }

    public void setSequenceTimestamp(String sequenceTimestamp) {
        this.sequenceTimestamp = sequenceTimestamp;
    }

    public String getLiquidityIndicator() {
        return liquidityIndicator;
    }

    public void setLiquidityIndicator(String liquidityIndicator) {
        this.liquidityIndicator = liquidityIndicator;
    }

    public boolean isSizeInQuote() {
        return sizeInQuote;
    }

    public void setSizeInQuote(boolean sizeInQuote) {
        this.sizeInQuote = sizeInQuote;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getRetailPortfolioId() {
        return retailPortfolioId;
    }

    public void setRetailPortfolioId(String retailPortfolioId) {
        this.retailPortfolioId = retailPortfolioId;
    }

    public static class Builder {
        private String entryId;
        private String tradeId;
        private String orderId;
        private String tradeTime;
        private String tradeType;
        private String price;
        private String size;
        private String commission;
        private String productId;
        private String sequenceTimestamp;
        private String liquidityIndicator;
        private boolean sizeInQuote;
        private String userId;
        private String side;
        private String retailPortfolioId;

        public Builder entryId(String entryId) {
            this.entryId = entryId;
            return this;
        }

        public Builder tradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder tradeTime(String tradeTime) {
            this.tradeTime = tradeTime;
            return this;
        }

        public Builder tradeType(String tradeType) {
            this.tradeType = tradeType;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder commission(String commission) {
            this.commission = commission;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder sequenceTimestamp(String sequenceTimestamp) {
            this.sequenceTimestamp = sequenceTimestamp;
            return this;
        }

        public Builder liquidityIndicator(String liquidityIndicator) {
            this.liquidityIndicator = liquidityIndicator;
            return this;
        }

        public Builder sizeInQuote(boolean sizeInQuote) {
            this.sizeInQuote = sizeInQuote;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder retailPortfolioId(String retailPortfolioId) {
            this.retailPortfolioId = retailPortfolioId;
            return this;
        }

        public static Builder from(Fill fill) {
            return new Builder()
                    .entryId(fill.getEntryId())
                    .tradeId(fill.getTradeId())
                    .orderId(fill.getOrderId())
                    .tradeTime(fill.getTradeTime())
                    .tradeType(fill.getTradeType())
                    .price(fill.getPrice())
                    .size(fill.getSize())
                    .commission(fill.getCommission())
                    .productId(fill.getProductId())
                    .sequenceTimestamp(fill.getSequenceTimestamp())
                    .liquidityIndicator(fill.getLiquidityIndicator())
                    .sizeInQuote(fill.isSizeInQuote())
                    .userId(fill.getUserId())
                    .side(fill.getSide())
                    .retailPortfolioId(fill.getRetailPortfolioId());
        }

        public Fill build() {
            return new Fill(this);
        }
    }

    private Fill(Builder builder) {
        this.entryId = builder.entryId;
        this.tradeId = builder.tradeId;
        this.orderId = builder.orderId;
        this.tradeTime = builder.tradeTime;
        this.tradeType = builder.tradeType;
        this.price = builder.price;
        this.size = builder.size;
        this.commission = builder.commission;
        this.productId = builder.productId;
        this.sequenceTimestamp = builder.sequenceTimestamp;
        this.liquidityIndicator = builder.liquidityIndicator;
        this.sizeInQuote = builder.sizeInQuote;
        this.userId = builder.userId;
        this.side = builder.side;
        this.retailPortfolioId = builder.retailPortfolioId;
    }
}
