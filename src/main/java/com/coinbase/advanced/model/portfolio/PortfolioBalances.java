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

package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PortfolioBalances {

    @JsonProperty("total_balance")
    private Amount totalBalance;

    @JsonProperty("total_futures_balance")
    private Amount totalFuturesBalance;

    @JsonProperty("total_cash_equivalent_balance")
    private Amount totalCashEquivalentBalance;

    @JsonProperty("total_crypto_balance")
    private Amount totalCryptoBalance;

    @JsonProperty("futures_unrealized_pnl")
    private Amount futuresUnrealizedPnl;

    @JsonProperty("perp_unrealized_pnl")
    private Amount perpUnrealizedPnl;

    public Amount getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Amount totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Amount getTotalFuturesBalance() {
        return totalFuturesBalance;
    }

    public void setTotalFuturesBalance(Amount totalFuturesBalance) {
        this.totalFuturesBalance = totalFuturesBalance;
    }

    public Amount getTotalCashEquivalentBalance() {
        return totalCashEquivalentBalance;
    }

    public void setTotalCashEquivalentBalance(Amount totalCashEquivalentBalance) {
        this.totalCashEquivalentBalance = totalCashEquivalentBalance;
    }

    public Amount getTotalCryptoBalance() {
        return totalCryptoBalance;
    }

    public void setTotalCryptoBalance(Amount totalCryptoBalance) {
        this.totalCryptoBalance = totalCryptoBalance;
    }

    public Amount getFuturesUnrealizedPnl() {
        return futuresUnrealizedPnl;
    }

    public void setFuturesUnrealizedPnl(Amount futuresUnrealizedPnl) {
        this.futuresUnrealizedPnl = futuresUnrealizedPnl;
    }

    public Amount getPerpUnrealizedPnl() {
        return perpUnrealizedPnl;
    }

    public void setPerpUnrealizedPnl(Amount perpUnrealizedPnl) {
        this.perpUnrealizedPnl = perpUnrealizedPnl;
    }
}
