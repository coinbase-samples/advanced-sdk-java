package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.Amount;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpotPosition {

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("account_uuid")
    private String accountUuid;

    @JsonProperty("total_balance_fiat")
    private double totalBalanceFiat;

    @JsonProperty("total_balance_crypto")
    private double totalBalanceCrypto;

    @JsonProperty("available_to_trade_fiat")
    private double availableToTradeFiat;

    @JsonProperty("allocation")
    private double allocation;

    @JsonProperty("one_day_change")
    private double oneDayChange;

    @JsonProperty("cost_basis")
    private Amount costBasis;

    @JsonProperty("asset_img_url")
    private String assetImgUrl;

    @JsonProperty("is_cash")
    private boolean isCash;

    @JsonProperty("average_entry_price")
    private String averageEntryPrice;

    @JsonProperty("asset_uuid")
    private String assetUuid;

    @JsonProperty("available_to_trade_crypto")
    private float availableToTradeCrypto;

    @JsonProperty("unrealized_pnl")
    private UnrealizedPnl unrealizedPnl;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public double getTotalBalanceFiat() {
        return totalBalanceFiat;
    }

    public void setTotalBalanceFiat(double totalBalanceFiat) {
        this.totalBalanceFiat = totalBalanceFiat;
    }

    public double getTotalBalanceCrypto() {
        return totalBalanceCrypto;
    }

    public void setTotalBalanceCrypto(double totalBalanceCrypto) {
        this.totalBalanceCrypto = totalBalanceCrypto;
    }

    public double getAvailableToTradeFiat() {
        return availableToTradeFiat;
    }

    public void setAvailableToTradeFiat(double availableToTradeFiat) {
        this.availableToTradeFiat = availableToTradeFiat;
    }

    public double getAllocation() {
        return allocation;
    }

    public void setAllocation(double allocation) {
        this.allocation = allocation;
    }

    public double getOneDayChange() {
        return oneDayChange;
    }

    public void setOneDayChange(double oneDayChange) {
        this.oneDayChange = oneDayChange;
    }

    public Amount getCostBasis() {
        return costBasis;
    }

    public void setCostBasis(Amount costBasis) {
        this.costBasis = costBasis;
    }

    public String getAssetImgUrl() {
        return assetImgUrl;
    }

    public void setAssetImgUrl(String assetImgUrl) {
        this.assetImgUrl = assetImgUrl;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }

    public String getAverageEntryPrice() {
        return averageEntryPrice;
    }

    public void setAverageEntryPrice(String averageEntryPrice) {
        this.averageEntryPrice = averageEntryPrice;
    }

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
    }

    public float getAvailableToTradeCrypto() {
        return availableToTradeCrypto;
    }

    public void setAvailableToTradeCrypto(float availableToTradeCrypto) {
        this.availableToTradeCrypto = availableToTradeCrypto;
    }

    public UnrealizedPnl getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(UnrealizedPnl unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }
}
