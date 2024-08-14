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
