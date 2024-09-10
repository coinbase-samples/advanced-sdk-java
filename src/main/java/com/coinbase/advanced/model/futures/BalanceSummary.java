package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceSummary {

    @JsonProperty("futures_buying_power")
    private Amount futuresBuyingPower;

    @JsonProperty("total_usd_balance")
    private Amount totalUsdBalance;

    @JsonProperty("cbi_usd_balance")
    private Amount cbiUsdBalance;

    @JsonProperty("cfm_usd_balance")
    private Amount cfmUsdBalance;

    @JsonProperty("total_open_orders_hold_amount")
    private Amount totalOpenOrdersHoldAmount;

    @JsonProperty("unrealized_pnl")
    private Amount unrealizedPnl;

    @JsonProperty("daily_realized_pnl")
    private Amount dailyRealizedPnl;

    @JsonProperty("initial_margin")
    private Amount initialMargin;

    @JsonProperty("available_margin")
    private Amount availableMargin;

    @JsonProperty("liquidation_threshold")
    private Amount liquidationThreshold;

    @JsonProperty("liquidation_buffer_amount")
    private Amount liquidationBufferAmount;

    @JsonProperty("liquidation_buffer_percentage")
    private String liquidationBufferPercentage;

    public BalanceSummary() {}

    private BalanceSummary(Builder builder) {
        this.futuresBuyingPower = builder.futuresBuyingPower;
        this.totalUsdBalance = builder.totalUsdBalance;
        this.cbiUsdBalance = builder.cbiUsdBalance;
        this.cfmUsdBalance = builder.cfmUsdBalance;
        this.totalOpenOrdersHoldAmount = builder.totalOpenOrdersHoldAmount;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.dailyRealizedPnl = builder.dailyRealizedPnl;
        this.initialMargin = builder.initialMargin;
        this.availableMargin = builder.availableMargin;
        this.liquidationThreshold = builder.liquidationThreshold;
        this.liquidationBufferAmount = builder.liquidationBufferAmount;
        this.liquidationBufferPercentage = builder.liquidationBufferPercentage;
    }

    public Amount getFuturesBuyingPower() {
        return futuresBuyingPower;
    }

    public void setFuturesBuyingPower(Amount futuresBuyingPower) {
        this.futuresBuyingPower = futuresBuyingPower;
    }

    public Amount getTotalUsdBalance() {
        return totalUsdBalance;
    }

    public void setTotalUsdBalance(Amount totalUsdBalance) {
        this.totalUsdBalance = totalUsdBalance;
    }

    public Amount getCbiUsdBalance() {
        return cbiUsdBalance;
    }

    public void setCbiUsdBalance(Amount cbiUsdBalance) {
        this.cbiUsdBalance = cbiUsdBalance;
    }

    public Amount getCfmUsdBalance() {
        return cfmUsdBalance;
    }

    public void setCfmUsdBalance(Amount cfmUsdBalance) {
        this.cfmUsdBalance = cfmUsdBalance;
    }

    public Amount getTotalOpenOrdersHoldAmount() {
        return totalOpenOrdersHoldAmount;
    }

    public void setTotalOpenOrdersHoldAmount(Amount totalOpenOrdersHoldAmount) {
        this.totalOpenOrdersHoldAmount = totalOpenOrdersHoldAmount;
    }

    public Amount getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(Amount unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public Amount getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public void setDailyRealizedPnl(Amount dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }

    public Amount getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(Amount initialMargin) {
        this.initialMargin = initialMargin;
    }

    public Amount getAvailableMargin() {
        return availableMargin;
    }

    public void setAvailableMargin(Amount availableMargin) {
        this.availableMargin = availableMargin;
    }

    public Amount getLiquidationThreshold() {
        return liquidationThreshold;
    }

    public void setLiquidationThreshold(Amount liquidationThreshold) {
        this.liquidationThreshold = liquidationThreshold;
    }

    public Amount getLiquidationBufferAmount() {
        return liquidationBufferAmount;
    }

    public void setLiquidationBufferAmount(Amount liquidationBufferAmount) {
        this.liquidationBufferAmount = liquidationBufferAmount;
    }

    public String getLiquidationBufferPercentage() {
        return liquidationBufferPercentage;
    }

    public void setLiquidationBufferPercentage(String liquidationBufferPercentage) {
        this.liquidationBufferPercentage = liquidationBufferPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Amount futuresBuyingPower;
        private Amount totalUsdBalance;
        private Amount cbiUsdBalance;
        private Amount cfmUsdBalance;
        private Amount totalOpenOrdersHoldAmount;
        private Amount unrealizedPnl;
        private Amount dailyRealizedPnl;
        private Amount initialMargin;
        private Amount availableMargin;
        private Amount liquidationThreshold;
        private Amount liquidationBufferAmount;
        private String liquidationBufferPercentage;

        public Builder futuresBuyingPower(Amount futuresBuyingPower) {
            this.futuresBuyingPower = futuresBuyingPower;
            return this;
        }

        public Builder totalUsdBalance(Amount totalUsdBalance) {
            this.totalUsdBalance = totalUsdBalance;
            return this;
        }

        public Builder cbiUsdBalance(Amount cbiUsdBalance) {
            this.cbiUsdBalance = cbiUsdBalance;
            return this;
        }

        public Builder cfmUsdBalance(Amount cfmUsdBalance) {
            this.cfmUsdBalance = cfmUsdBalance;
            return this;
        }

        public Builder totalOpenOrdersHoldAmount(Amount totalOpenOrdersHoldAmount) {
            this.totalOpenOrdersHoldAmount = totalOpenOrdersHoldAmount;
            return this;
        }

        public Builder unrealizedPnl(Amount unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder dailyRealizedPnl(Amount dailyRealizedPnl) {
            this.dailyRealizedPnl = dailyRealizedPnl;
            return this;
        }

        public Builder initialMargin(Amount initialMargin) {
            this.initialMargin = initialMargin;
            return this;
        }

        public Builder availableMargin(Amount availableMargin) {
            this.availableMargin = availableMargin;
            return this;
        }

        public Builder liquidationThreshold(Amount liquidationThreshold) {
            this.liquidationThreshold = liquidationThreshold;
            return this;
        }

        public Builder liquidationBufferAmount(Amount liquidationBufferAmount) {
            this.liquidationBufferAmount = liquidationBufferAmount;
            return this;
        }

        public Builder liquidationBufferPercentage(String liquidationBufferPercentage) {
            this.liquidationBufferPercentage = liquidationBufferPercentage;
            return this;
        }

        public BalanceSummary build() {
            return new BalanceSummary(this);
        }
    }
}
