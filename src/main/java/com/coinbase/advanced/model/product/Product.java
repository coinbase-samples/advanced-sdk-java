package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("price")
    private String price;

    @JsonProperty("price_percentage_change_24h")
    private String pricePercentageChange24h;

    @JsonProperty("volume_24h")
    private String volume24h;

    @JsonProperty("volume_percentage_change_24h")
    private String volumePercentageChange24h;

    @JsonProperty("base_increment")
    private String baseIncrement;

    @JsonProperty("quote_increment")
    private String quoteIncrement;

    @JsonProperty("quote_min_size")
    private String quoteMinSize;

    @JsonProperty("quote_max_size")
    private String quoteMaxSize;

    @JsonProperty("base_min_size")
    private String baseMinSize;

    @JsonProperty("base_max_size")
    private String baseMaxSize;

    @JsonProperty("base_name")
    private String baseName;

    @JsonProperty("quote_name")
    private String quoteName;

    @JsonProperty("watched")
    private boolean watched;

    @JsonProperty("is_disabled")
    private boolean isDisabled;

    @JsonProperty("new")
    private boolean isNew;

    @JsonProperty("status")
    private String status;

    @JsonProperty("cancel_only")
    private boolean cancelOnly;

    @JsonProperty("limit_only")
    private boolean limitOnly;

    @JsonProperty("post_only")
    private boolean postOnly;

    @JsonProperty("trading_disabled")
    private boolean tradingDisabled;

    @JsonProperty("auction_mode")
    private boolean auctionMode;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("quote_currency_id")
    private String quoteCurrencyId;

    @JsonProperty("base_currency_id")
    private String baseCurrencyId;

    @JsonProperty("fcm_trading_session_details")
    private SessionDetails fcmSessionDetails;

    @JsonProperty("mid_market_price")
    private String midMarketPrice;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("alias_to")
    private List<String> aliasTo;

    @JsonProperty("base_display_symbol")
    private String baseDisplaySymbol;

    @JsonProperty("quote_display_symbol")
    private String quoteDisplaySymbol;

    @JsonProperty("view_only")
    private boolean viewOnly;

    @JsonProperty("price_increment")
    private String priceIncrement;

    @JsonProperty("future_product_details")
    private FutureProductDetails futureProductDetails;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("product_venue")
    private String productVenue;

    @JsonProperty("approximate_quote_24h_volume")
    private String approximateQuote24hVolume;

    @JsonProperty("num_products")
    private int numProducts;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPricePercentageChange24h() {
        return pricePercentageChange24h;
    }

    public void setPricePercentageChange24h(String pricePercentageChange24h) {
        this.pricePercentageChange24h = pricePercentageChange24h;
    }

    public String getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(String volume24h) {
        this.volume24h = volume24h;
    }

    public String getVolumePercentageChange24h() {
        return volumePercentageChange24h;
    }

    public void setVolumePercentageChange24h(String volumePercentageChange24h) {
        this.volumePercentageChange24h = volumePercentageChange24h;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCancelOnly() {
        return cancelOnly;
    }

    public void setCancelOnly(boolean cancelOnly) {
        this.cancelOnly = cancelOnly;
    }

    public boolean isLimitOnly() {
        return limitOnly;
    }

    public void setLimitOnly(boolean limitOnly) {
        this.limitOnly = limitOnly;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public boolean isTradingDisabled() {
        return tradingDisabled;
    }

    public void setTradingDisabled(boolean tradingDisabled) {
        this.tradingDisabled = tradingDisabled;
    }

    public boolean isAuctionMode() {
        return auctionMode;
    }

    public void setAuctionMode(boolean auctionMode) {
        this.auctionMode = auctionMode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getQuoteCurrencyId() {
        return quoteCurrencyId;
    }

    public void setQuoteCurrencyId(String quoteCurrencyId) {
        this.quoteCurrencyId = quoteCurrencyId;
    }

    public String getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(String baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public SessionDetails getFcmSessionDetails() {
        return fcmSessionDetails;
    }

    public void setFcmSessionDetails(SessionDetails fcmSessionDetails) {
        this.fcmSessionDetails = fcmSessionDetails;
    }

    public String getMidMarketPrice() {
        return midMarketPrice;
    }

    public void setMidMarketPrice(String midMarketPrice) {
        this.midMarketPrice = midMarketPrice;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<String> getAliasTo() {
        return aliasTo;
    }

    public void setAliasTo(List<String> aliasTo) {
        this.aliasTo = aliasTo;
    }

    public String getBaseDisplaySymbol() {
        return baseDisplaySymbol;
    }

    public void setBaseDisplaySymbol(String baseDisplaySymbol) {
        this.baseDisplaySymbol = baseDisplaySymbol;
    }

    public String getQuoteDisplaySymbol() {
        return quoteDisplaySymbol;
    }

    public void setQuoteDisplaySymbol(String quoteDisplaySymbol) {
        this.quoteDisplaySymbol = quoteDisplaySymbol;
    }

    public boolean isViewOnly() {
        return viewOnly;
    }

    public void setViewOnly(boolean viewOnly) {
        this.viewOnly = viewOnly;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public FutureProductDetails getFutureProductDetails() {
        return futureProductDetails;
    }

    public void setFutureProductDetails(FutureProductDetails futureProductDetails) {
        this.futureProductDetails = futureProductDetails;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProductVenue() {
        return productVenue;
    }

    public void setProductVenue(String productVenue) {
        this.productVenue = productVenue;
    }

    public String getApproximateQuote24hVolume() {
        return approximateQuote24hVolume;
    }

    public void setApproximateQuote24hVolume(String approximateQuote24hVolume) {
        this.approximateQuote24hVolume = approximateQuote24hVolume;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public void setNumProducts(int numProducts) {
        this.numProducts = numProducts;
    }
}
