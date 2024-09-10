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

package com.coinbase.advanced.model.fees;

import com.coinbase.advanced.model.common.Rate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionsSummaryResponse {

    @JsonProperty("total_volume")
    private int totalVolume;

    @JsonProperty("total_fees")
    private double totalFees;

    @JsonProperty("fee_tier")
    private FeeTier feeTier;

    @JsonProperty("margin_rate")
    private Rate marginRate;

    @JsonProperty("goods_and_services_tax")
    private Gst goodsAndServicesTax;

    @JsonProperty("advanced_trade_only_volume")
    private int advancedTradeOnlyVolume;

    @JsonProperty("advanced_trade_only_fees")
    private double advancedTradeOnlyFees;

    @JsonProperty("coinbase_pro_volume")
    private int coinbaseProVolume;

    @JsonProperty("coinbase_pro_fees")
    private double coinbaseProFees;

    @JsonProperty("total_balance")
    private double totalBalance;

    @JsonProperty("has_promo_fee")
    private boolean hasPromoFee;

    public GetTransactionsSummaryResponse() {}

    private GetTransactionsSummaryResponse(Builder builder) {
        this.totalVolume = builder.totalVolume;
        this.totalFees = builder.totalFees;
        this.feeTier = builder.feeTier;
        this.marginRate = builder.marginRate;
        this.goodsAndServicesTax = builder.goodsAndServicesTax;
        this.advancedTradeOnlyVolume = builder.advancedTradeOnlyVolume;
        this.advancedTradeOnlyFees = builder.advancedTradeOnlyFees;
        this.coinbaseProVolume = builder.coinbaseProVolume;
        this.coinbaseProFees = builder.coinbaseProFees;
        this.totalBalance = builder.totalBalance;
        this.hasPromoFee = builder.hasPromoFee;
    }

    public int getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(int totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public FeeTier getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(FeeTier feeTier) {
        this.feeTier = feeTier;
    }

    public Rate getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(Rate marginRate) {
        this.marginRate = marginRate;
    }

    public Gst getGoodsAndServicesTax() {
        return goodsAndServicesTax;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public boolean getHasPromoFee() {
        return hasPromoFee;
    }

    public void setGoodsAndServicesTax(Gst goodsAndServicesTax) {
        this.goodsAndServicesTax = goodsAndServicesTax;
    }

    public int getAdvancedTradeOnlyVolume() {
        return advancedTradeOnlyVolume;
    }

    public void setAdvancedTradeOnlyVolume(int advancedTradeOnlyVolume) {
        this.advancedTradeOnlyVolume = advancedTradeOnlyVolume;
    }

    public double getAdvancedTradeOnlyFees() {
        return advancedTradeOnlyFees;
    }

    public void setAdvancedTradeOnlyFees(double advancedTradeOnlyFees) {
        this.advancedTradeOnlyFees = advancedTradeOnlyFees;
    }

    public int getCoinbaseProVolume() {
        return coinbaseProVolume;
    }

    public void setCoinbaseProVolume(int coinbaseProVolume) {
        this.coinbaseProVolume = coinbaseProVolume;
    }

    public double getCoinbaseProFees() {
        return coinbaseProFees;
    }

    public void setCoinbaseProFees(double coinbaseProFees) {
        this.coinbaseProFees = coinbaseProFees;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setHasPromoFee(boolean hasPromoFee) {
        this.hasPromoFee = hasPromoFee;
    }

    public static class Builder {
        private int totalVolume;
        private double totalFees;
        private FeeTier feeTier;
        private Rate marginRate;
        private Gst goodsAndServicesTax;
        private int advancedTradeOnlyVolume;
        private double advancedTradeOnlyFees;
        private int coinbaseProVolume;
        private double coinbaseProFees;
        private double totalBalance;
        private boolean hasPromoFee;

        public Builder() {}

        public Builder totalVolume(int totalVolume) {
            this.totalVolume = totalVolume;
            return this;
        }

        public Builder totalFees(double totalFees) {
            this.totalFees = totalFees;
            return this;
        }

        public Builder feeTier(FeeTier feeTier) {
            this.feeTier = feeTier;
            return this;
        }

        public Builder marginRate(Rate marginRate) {
            this.marginRate = marginRate;
            return this;
        }

        public Builder goodsAndServicesTax(Gst goodsAndServicesTax) {
            this.goodsAndServicesTax = goodsAndServicesTax;
            return this;
        }

        public Builder advancedTradeOnlyVolume(int advancedTradeOnlyVolume) {
            this.advancedTradeOnlyVolume = advancedTradeOnlyVolume;
            return this;
        }

        public Builder advancedTradeOnlyFees(double advancedTradeOnlyFees) {
            this.advancedTradeOnlyFees = advancedTradeOnlyFees;
            return this;
        }

        public Builder coinbaseProVolume(int coinbaseProVolume) {
            this.coinbaseProVolume = coinbaseProVolume;
            return this;
        }

        public Builder coinbaseProFees(double coinbaseProFees) {
            this.coinbaseProFees = coinbaseProFees;
            return this;
        }

        public Builder totalBalance(double totalBalance) {
            this.totalBalance = totalBalance;
            return this;
        }

        public Builder hasPromoFee(boolean hasPromoFee) {
            this.hasPromoFee = hasPromoFee;
            return this;
        }

        public GetTransactionsSummaryResponse build() {
            return new GetTransactionsSummaryResponse(this);
        }
    }
}
