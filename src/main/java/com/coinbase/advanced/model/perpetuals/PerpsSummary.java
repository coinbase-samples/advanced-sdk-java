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

public class PerpsSummary {

    @JsonProperty("unrealized_pnl")
    private Amount unrealizedPnl;

    @JsonProperty("buying_power")
    private Amount buyingPower;

    @JsonProperty("total_balance")
    private Amount totalBalance;

    @JsonProperty("max_withdrawal_amount")
    private Amount maxWithdrawalAmount;

    public PerpsSummary() {}

    private PerpsSummary(Builder builder) {
        this.unrealizedPnl = builder.unrealizedPnl;
        this.buyingPower = builder.buyingPower;
        this.totalBalance = builder.totalBalance;
        this.maxWithdrawalAmount = builder.maxWithdrawalAmount;
    }

    public Amount getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(Amount unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public Amount getBuyingPower() {
        return buyingPower;
    }

    public void setBuyingPower(Amount buyingPower) {
        this.buyingPower = buyingPower;
    }

    public Amount getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Amount totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Amount getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(Amount maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public static class Builder {
        private Amount unrealizedPnl;
        private Amount buyingPower;
        private Amount totalBalance;
        private Amount maxWithdrawalAmount;

        public Builder() {}

        public Builder unrealizedPnl(Amount unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder buyingPower(Amount buyingPower) {
            this.buyingPower = buyingPower;
            return this;
        }

        public Builder totalBalance(Amount totalBalance) {
            this.totalBalance = totalBalance;
            return this;
        }

        public Builder maxWithdrawalAmount(Amount maxWithdrawalAmount) {
            this.maxWithdrawalAmount = maxWithdrawalAmount;
            return this;
        }

        public PerpsSummary build() {
            return new PerpsSummary(this);
        }
    }
}
