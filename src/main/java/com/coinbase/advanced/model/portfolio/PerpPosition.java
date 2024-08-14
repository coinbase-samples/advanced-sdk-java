package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.DualCurrencyValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PerpPosition {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("product_uuid")
    private String productUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("asset_image_url")
    private String assetImageUrl;

    @JsonProperty("vwap")
    private DualCurrencyValue vwap;

    @JsonProperty("position_side")
    private String positionSide;

    @JsonProperty("net_size")
    private String netSize;

    @JsonProperty("buy_order_size")
    private String buyOrderSize;

    @JsonProperty("sell_order_size")
    private String sellOrderSize;

    @JsonProperty("im_contribution")
    private String imContribution;

    @JsonProperty("unrealized_pnl")
    private DualCurrencyValue unrealizedPnl;

    @JsonProperty("mark_price")
    private DualCurrencyValue markPrice;

    @JsonProperty("liquidation_price")
    private DualCurrencyValue liquidationPrice;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("im_notional")
    private DualCurrencyValue imNotional;

    @JsonProperty("mm_notional")
    private DualCurrencyValue mmNotional;

    @JsonProperty("position_notional")
    private DualCurrencyValue positionNotional;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("liquidation_buffer")
    private String liquidationBuffer;

    @JsonProperty("liquidation_percentage")
    private String liquidationPercentage;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetImageUrl() {
        return assetImageUrl;
    }

    public void setAssetImageUrl(String assetImageUrl) {
        this.assetImageUrl = assetImageUrl;
    }

    public DualCurrencyValue getVwap() {
        return vwap;
    }

    public void setVwap(DualCurrencyValue vwap) {
        this.vwap = vwap;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
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

    public DualCurrencyValue getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(DualCurrencyValue unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public DualCurrencyValue getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(DualCurrencyValue markPrice) {
        this.markPrice = markPrice;
    }

    public DualCurrencyValue getLiquidationPrice() {
        return liquidationPrice;
    }

    public void setLiquidationPrice(DualCurrencyValue liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public DualCurrencyValue getImNotional() {
        return imNotional;
    }

    public void setImNotional(DualCurrencyValue imNotional) {
        this.imNotional = imNotional;
    }

    public DualCurrencyValue getMmNotional() {
        return mmNotional;
    }

    public void setMmNotional(DualCurrencyValue mmNotional) {
        this.mmNotional = mmNotional;
    }

    public DualCurrencyValue getPositionNotional() {
        return positionNotional;
    }

    public void setPositionNotional(DualCurrencyValue positionNotional) {
        this.positionNotional = positionNotional;
    }

    public String getMarginType() {
        return marginType;
    }

    public void setMarginType(String marginType) {
        this.marginType = marginType;
    }

    public String getLiquidationBuffer() {
        return liquidationBuffer;
    }

    public void setLiquidationBuffer(String liquidationBuffer) {
        this.liquidationBuffer = liquidationBuffer;
    }

    public String getLiquidationPercentage() {
        return liquidationPercentage;
    }

    public void setLiquidationPercentage(String liquidationPercentage) {
        this.liquidationPercentage = liquidationPercentage;
    }
}
