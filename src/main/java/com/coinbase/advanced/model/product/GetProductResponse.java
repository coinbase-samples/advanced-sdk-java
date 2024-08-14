package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductResponse {

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
    private String[] aliasTo;

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

    public GetProductResponse() {}

    private GetProductResponse(Builder builder) {
        this.productId = builder.productId;
        this.price = builder.price;
        this.pricePercentageChange24h = builder.pricePercentageChange24h;
        this.volume24h = builder.volume24h;
        this.volumePercentageChange24h = builder.volumePercentageChange24h;
        this.baseIncrement = builder.baseIncrement;
        this.quoteIncrement = builder.quoteIncrement;
        this.quoteMinSize = builder.quoteMinSize;
        this.quoteMaxSize = builder.quoteMaxSize;
        this.baseMinSize = builder.baseMinSize;
        this.baseMaxSize = builder.baseMaxSize;
        this.baseName = builder.baseName;
        this.quoteName = builder.quoteName;
        this.watched = builder.watched;
        this.isDisabled = builder.isDisabled;
        this.isNew = builder.isNew;
        this.status = builder.status;
        this.cancelOnly = builder.cancelOnly;
        this.limitOnly = builder.limitOnly;
        this.postOnly = builder.postOnly;
        this.tradingDisabled = builder.tradingDisabled;
        this.auctionMode = builder.auctionMode;
        this.productType = builder.productType;
        this.quoteCurrencyId = builder.quoteCurrencyId;
        this.baseCurrencyId = builder.baseCurrencyId;
        this.fcmSessionDetails = builder.fcmSessionDetails;
        this.midMarketPrice = builder.midMarketPrice;
        this.alias = builder.alias;
        this.aliasTo = builder.aliasTo;
        this.baseDisplaySymbol = builder.baseDisplaySymbol;
        this.quoteDisplaySymbol = builder.quoteDisplaySymbol;
        this.viewOnly = builder.viewOnly;
        this.priceIncrement = builder.priceIncrement;
        this.futureProductDetails = builder.futureProductDetails;
        this.displayName = builder.displayName;
    }

    public GetProductResponse(GetProductResponse other) {
        this.productId = other.productId;
        this.price = other.price;
        this.pricePercentageChange24h = other.pricePercentageChange24h;
        this.volume24h = other.volume24h;
        this.volumePercentageChange24h = other.volumePercentageChange24h;
        this.baseIncrement = other.baseIncrement;
        this.quoteIncrement = other.quoteIncrement;
        this.quoteMinSize = other.quoteMinSize;
        this.quoteMaxSize = other.quoteMaxSize;
        this.baseMinSize = other.baseMinSize;
        this.baseMaxSize = other.baseMaxSize;
        this.baseName = other.baseName;
        this.quoteName = other.quoteName;
        this.watched = other.watched;
        this.isDisabled = other.isDisabled;
        this.isNew = other.isNew;
        this.status = other.status;
        this.cancelOnly = other.cancelOnly;
        this.limitOnly = other.limitOnly;
        this.postOnly = other.postOnly;
        this.tradingDisabled = other.tradingDisabled;
        this.auctionMode = other.auctionMode;
        this.productType = other.productType;
        this.quoteCurrencyId = other.quoteCurrencyId;
        this.baseCurrencyId = other.baseCurrencyId;
        this.fcmSessionDetails = other.fcmSessionDetails;
        this.midMarketPrice = other.midMarketPrice;
        this.alias = other.alias;
        this.aliasTo = other.aliasTo;
        this.baseDisplaySymbol = other.baseDisplaySymbol;
        this.quoteDisplaySymbol = other.quoteDisplaySymbol;
        this.viewOnly = other.viewOnly;
        this.priceIncrement = other.priceIncrement;
        this.futureProductDetails = other.futureProductDetails;
        this.displayName = other.displayName;
        this.productVenue = other.productVenue;
        this.approximateQuote24hVolume = other.approximateQuote24hVolume;
        this.numProducts = other.numProducts;
    }

    public String getProductId() {
        return productId;
    }

    public String getPrice() {
        return price;
    }

    public String getPricePercentageChange24h() {
        return pricePercentageChange24h;
    }

    public String getVolume24h() {
        return volume24h;
    }

    public String getVolumePercentageChange24h() {
        return volumePercentageChange24h;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public String getBaseName() {
        return baseName;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public boolean isWatched() {
        return watched;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public boolean isNew() {
        return isNew;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCancelOnly() {
        return cancelOnly;
    }

    public boolean isLimitOnly() {
        return limitOnly;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public boolean isTradingDisabled() {
        return tradingDisabled;
    }

    public boolean isAuctionMode() {
        return auctionMode;
    }

    public String getProductType() {
        return productType;
    }

    public String getQuoteCurrencyId() {
        return quoteCurrencyId;
    }

    public String getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public SessionDetails getFcmSessionDetails() {
        return fcmSessionDetails;
    }

    public String getMidMarketPrice() {
        return midMarketPrice;
    }

    public String getAlias() {
        return alias;
    }

    public String[] getAliasTo() {
        return aliasTo;
    }

    public String getBaseDisplaySymbol() {
        return baseDisplaySymbol;
    }

    public String getQuoteDisplaySymbol() {
        return quoteDisplaySymbol;
    }

    public boolean isViewOnly() {
        return viewOnly;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public FutureProductDetails getFutureProductDetails() {
        return futureProductDetails;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPricePercentageChange24h(String pricePercentageChange24h) {
        this.pricePercentageChange24h = pricePercentageChange24h;
    }

    public void setVolume24h(String volume24h) {
        this.volume24h = volume24h;
    }

    public void setVolumePercentageChange24h(String volumePercentageChange24h) {
        this.volumePercentageChange24h = volumePercentageChange24h;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void setDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCancelOnly(boolean cancelOnly) {
        this.cancelOnly = cancelOnly;
    }

    public void setLimitOnly(boolean limitOnly) {
        this.limitOnly = limitOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public void setTradingDisabled(boolean tradingDisabled) {
        this.tradingDisabled = tradingDisabled;
    }

    public void setAuctionMode(boolean auctionMode) {
        this.auctionMode = auctionMode;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setQuoteCurrencyId(String quoteCurrencyId) {
        this.quoteCurrencyId = quoteCurrencyId;
    }

    public void setBaseCurrencyId(String baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public void setFcmSessionDetails(SessionDetails fcmSessionDetails) {
        this.fcmSessionDetails = fcmSessionDetails;
    }

    public void setMidMarketPrice(String midMarketPrice) {
        this.midMarketPrice = midMarketPrice;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static class Builder {
        private String productId;
        private String price;
        private String pricePercentageChange24h;
        private String volume24h;
        private String volumePercentageChange24h;
        private String baseIncrement;
        private String quoteIncrement;
        private String quoteMinSize;
        private String quoteMaxSize;
        private String baseMinSize;
        private String baseMaxSize;
        private String baseName;
        private String quoteName;
        private boolean watched;
        private boolean isDisabled;
        private boolean isNew;
        private String status;
        private boolean cancelOnly;
        private boolean limitOnly;
        private boolean postOnly;
        private boolean tradingDisabled;
        private boolean auctionMode;
        private String productType;
        private String quoteCurrencyId;
        private String baseCurrencyId;
        private SessionDetails fcmSessionDetails;
        private String midMarketPrice;
        private String alias;
        private String[] aliasTo;
        private String baseDisplaySymbol;
        private String quoteDisplaySymbol;
        private boolean viewOnly;
        private String priceIncrement;
        private FutureProductDetails futureProductDetails;
        private String displayName;

        public static Builder from(GetProductResponse other) {
            return new Builder()
                    .productId(other.productId)
                    .price(other.price)
                    .pricePercentageChange24h(other.pricePercentageChange24h)
                    .volume24h(other.volume24h)
                    .volumePercentageChange24h(other.volumePercentageChange24h)
                    .baseIncrement(other.baseIncrement)
                    .quoteIncrement(other.quoteIncrement)
                    .quoteMinSize(other.quoteMinSize)
                    .quoteMaxSize(other.quoteMaxSize)
                    .baseMinSize(other.baseMinSize)
                    .baseMaxSize(other.baseMaxSize)
                    .baseName(other.baseName)
                    .quoteName(other.quoteName)
                    .watched(other.watched)
                    .isDisabled(other.isDisabled)
                    .isNew(other.isNew)
                    .status(other.status)
                    .cancelOnly(other.cancelOnly)
                    .limitOnly(other.limitOnly)
                    .postOnly(other.postOnly)
                    .tradingDisabled(other.tradingDisabled)
                    .auctionMode(other.auctionMode)
                    .productType(other.productType)
                    .quoteCurrencyId(other.quoteCurrencyId)
                    .baseCurrencyId(other.baseCurrencyId)
                    .fcmSessionDetails(other.fcmSessionDetails)
                    .midMarketPrice(other.midMarketPrice)
                    .alias(other.alias)
                    .aliasTo(other.aliasTo)
                    .baseDisplaySymbol(other.baseDisplaySymbol)
                    .quoteDisplaySymbol(other.quoteDisplaySymbol)
                    .viewOnly(other.viewOnly)
                    .priceIncrement(other.priceIncrement)
                    .futureProductDetails(other.futureProductDetails);
        }


        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder pricePercentageChange24h(String pricePercentageChange24h) {
            this.pricePercentageChange24h = pricePercentageChange24h;
            return this;
        }

        public Builder volume24h(String volume24h) {
            this.volume24h = volume24h;
            return this;
        }

        public Builder volumePercentageChange24h(String volumePercentageChange24h) {
            this.volumePercentageChange24h = volumePercentageChange24h;
            return this;
        }

        public Builder baseIncrement(String baseIncrement) {
            this.baseIncrement = baseIncrement;
            return this;
        }

        public Builder quoteIncrement(String quoteIncrement) {
            this.quoteIncrement = quoteIncrement;
            return this;
        }

        public Builder quoteMinSize(String quoteMinSize) {
            this.quoteMinSize = quoteMinSize;
            return this;
        }

        public Builder quoteMaxSize(String quoteMaxSize) {
            this.quoteMaxSize = quoteMaxSize;
            return this;
        }

        public Builder baseMinSize(String baseMinSize) {
            this.baseMinSize = baseMinSize;
            return this;
        }

        public Builder baseMaxSize(String baseMaxSize) {
            this.baseMaxSize = baseMaxSize;
            return this;
        }

        public Builder baseName(String baseName) {
            this.baseName = baseName;
            return this;
        }

        public Builder quoteName(String quoteName) {
            this.quoteName = quoteName;
            return this;
        }

        public Builder watched(boolean watched) {
            this.watched = watched;
            return this;
        }

        public Builder isDisabled(boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Builder isNew(boolean isNew) {
            this.isNew = isNew;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder cancelOnly(boolean cancelOnly) {
            this.cancelOnly = cancelOnly;
            return this;
        }

        public Builder limitOnly(boolean limitOnly) {
            this.limitOnly = limitOnly;
            return this;
        }

        public Builder postOnly(boolean postOnly) {
            this.postOnly = postOnly;
            return this;
        }

        public Builder tradingDisabled(boolean tradingDisabled) {
            this.tradingDisabled = tradingDisabled;
            return this;
        }

        public Builder auctionMode(boolean auctionMode) {
            this.auctionMode = auctionMode;
            return this;
        }

        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder quoteCurrencyId(String quoteCurrencyId) {
            this.quoteCurrencyId = quoteCurrencyId;
            return this;
        }

        public Builder baseCurrencyId(String baseCurrencyId) {
            this.baseCurrencyId = baseCurrencyId;
            return this;
        }

        public Builder fcmSessionDetails(SessionDetails fcmSessionDetails) {
            this.fcmSessionDetails = fcmSessionDetails;
            return this;
        }

        public Builder midMarketPrice(String midMarketPrice) {
            this.midMarketPrice = midMarketPrice;
            return this;
        }

        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder aliasTo(String[] aliasTo) {
            this.aliasTo = aliasTo;
            return this;
        }

        public Builder baseDisplaySymbol(String baseDisplaySymbol) {
            this.baseDisplaySymbol = baseDisplaySymbol;
            return this;
        }

        public Builder quoteDisplaySymbol(String quoteDisplaySymbol) {
            this.quoteDisplaySymbol = quoteDisplaySymbol;
            return this;
        }

        public Builder viewOnly(boolean viewOnly) {
            this.viewOnly = viewOnly;
            return this;
        }

        public Builder priceIncrement(String priceIncrement) {
            this.priceIncrement = priceIncrement;
            return this;
        }

        public Builder futureProductDetails(FutureProductDetails futureProductDetails) {
            this.futureProductDetails = futureProductDetails;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public GetProductResponse build() {
            return new GetProductResponse(this);
        }
    }
}
