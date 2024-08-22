package com.coinbase.advanced.model.portfolios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuturesPosition {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("contract_size")
    private String contractSize;

    @JsonProperty("side")
    private String side;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("avg_entry_price")
    private String avgEntryPrice;

    @JsonProperty("current_price")
    private String currentPrice;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("underlying_asset")
    private String underlyingAsset;

    @JsonProperty("asset_img_url")
    private String assetImgUrl;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("venue")
    private String venue;

    @JsonProperty("notional_value")
    private String notionalValue;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getContractSize() {
        return contractSize;
    }

    public void setContractSize(String contractSize) {
        this.contractSize = contractSize;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAvgEntryPrice() {
        return avgEntryPrice;
    }

    public void setAvgEntryPrice(String avgEntryPrice) {
        this.avgEntryPrice = avgEntryPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getUnderlyingAsset() {
        return underlyingAsset;
    }

    public void setUnderlyingAsset(String underlyingAsset) {
        this.underlyingAsset = underlyingAsset;
    }

    public String getAssetImgUrl() {
        return assetImgUrl;
    }

    public void setAssetImgUrl(String assetImgUrl) {
        this.assetImgUrl = assetImgUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getNotionalValue() {
        return notionalValue;
    }

    public void setNotionalValue(String notionalValue) {
        this.notionalValue = notionalValue;
    }
}
