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

    // Getters and setters for each field

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
