/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntxPosition {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("product_uuid")
    private String productUuid;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("vwap")
    private Amount vwap;

    @JsonProperty("entry_vwap")
    private Amount entryVwap;

    @JsonProperty("position_side")
    private String positionSide;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("net_size")
    private String netSize;

    @JsonProperty("buy_order_size")
    private String buyOrderSize;

    @JsonProperty("sell_order_size")
    private String sellOrderSize;

    @JsonProperty("im_contribution")
    private String imContribution;

    @JsonProperty("unrealized_pnl")
    private Amount unrealizedPnl;

    @JsonProperty("mark_price")
    private Amount markPrice;

    @JsonProperty("liquidation_price")
    private Amount liquidationPrice;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("im_notional")
    private Amount imNotional;

    @JsonProperty("mm_notional")
    private Amount mmNotional;

    @JsonProperty("position_notional")
    private String positionNotional;

    public IntxPosition() {}

    private IntxPosition(Builder builder) {
        this.productId = builder.productId;
        this.productUuid = builder.productUuid;
        this.portfolioUuid = builder.portfolioUuid;
        this.symbol = builder.symbol;
        this.vwap = builder.vwap;
        this.entryVwap = builder.entryVwap;
        this.positionSide = builder.positionSide;
        this.marginType = builder.marginType;
        this.netSize = builder.netSize;
        this.buyOrderSize = builder.buyOrderSize;
        this.sellOrderSize = builder.sellOrderSize;
        this.imContribution = builder.imContribution;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.markPrice = builder.markPrice;
        this.liquidationPrice = builder.liquidationPrice;
        this.leverage = builder.leverage;
        this.imNotional = builder.imNotional;
        this.mmNotional = builder.mmNotional;
        this.positionNotional = builder.positionNotional;
    }

    // Getters and Setters

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Amount getVwap() {
        return vwap;
    }

    public void setVwap(Amount vwap) {
        this.vwap = vwap;
    }

    public Amount getEntryVwap() {
        return entryVwap;
    }

    public void setEntryVwap(Amount entryVwap) {
        this.entryVwap = entryVwap;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getMarginType() {
        return marginType;
    }

    public void setMarginType(String marginType) {
        this.marginType = marginType;
    }

    public String getNetSize() {
        return netSize;
    }

    public void setNetSize(String netSize) {
        this.netSize = netSize;
    }

    public String getBuyOrderSize() {
        return buyOrderSize;
    }

    public void setBuyOrderSize(String buyOrderSize) {
        this.buyOrderSize = buyOrderSize;
    }

    public String getSellOrderSize() {
        return sellOrderSize;
    }

    public void setSellOrderSize(String sellOrderSize) {
        this.sellOrderSize = sellOrderSize;
    }

    public String getImContribution() {
        return imContribution;
    }

    public void setImContribution(String imContribution) {
        this.imContribution = imContribution;
    }

    public Amount getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(Amount unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public Amount getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(Amount markPrice) {
        this.markPrice = markPrice;
    }

    public Amount getLiquidationPrice() {
        return liquidationPrice;
    }

    public void setLiquidationPrice(Amount liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public Amount getImNotional() {
        return imNotional;
    }

    public void setImNotional(Amount imNotional) {
        this.imNotional = imNotional;
    }

    public Amount getMmNotional() {
        return mmNotional;
    }

    public void setMmNotional(Amount mmNotional) {
        this.mmNotional = mmNotional;
    }

    public String getPositionNotional() {
        return positionNotional;
    }

    public void setPositionNotional(String positionNotional) {
        this.positionNotional = positionNotional;
    }

    public static class Builder {
        private String productId;
        private String productUuid;
        private String portfolioUuid;
        private String symbol;
        private Amount vwap;
        private Amount entryVwap;
        private String positionSide;
        private String marginType;
        private String netSize;
        private String buyOrderSize;
        private String sellOrderSize;
        private String imContribution;
        private Amount unrealizedPnl;
        private Amount markPrice;
        private Amount liquidationPrice;
        private String leverage;
        private Amount imNotional;
        private Amount mmNotional;
        private String positionNotional;

        public Builder() {}

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder productUuid(String productUuid) {
            this.productUuid = productUuid;
            return this;
        }

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder vwap(Amount vwap) {
            this.vwap = vwap;
            return this;
        }

        public Builder entryVwap(Amount entryVwap) {
            this.entryVwap = entryVwap;
            return this;
        }

        public Builder positionSide(String positionSide) {
            this.positionSide = positionSide;
            return this;
        }

        public Builder marginType(String marginType) {
            this.marginType = marginType;
            return this;
        }

        public Builder netSize(String netSize) {
            this.netSize = netSize;
            return this;
        }

        public Builder buyOrderSize(String buyOrderSize) {
            this.buyOrderSize = buyOrderSize;
            return this;
        }

        public Builder sellOrderSize(String sellOrderSize) {
            this.sellOrderSize = sellOrderSize;
            return this;
        }

        public Builder imContribution(String imContribution) {
            this.imContribution = imContribution;
            return this;
        }

        public Builder unrealizedPnl(Amount unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder markPrice(Amount markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        public Builder liquidationPrice(Amount liquidationPrice) {
            this.liquidationPrice = liquidationPrice;
            return this;
        }

        public Builder leverage(String leverage) {
            this.leverage = leverage;
            return this;
        }

        public Builder imNotional(Amount imNotional) {
            this.imNotional = imNotional;
            return this;
        }

        public Builder mmNotional(Amount mmNotional) {
            this.mmNotional = mmNotional;
            return this;
        }

        public Builder positionNotional(String positionNotional) {
            this.positionNotional = positionNotional;
            return this;
        }

        public IntxPosition build() {
            return new IntxPosition(this);
        }
    }
}
