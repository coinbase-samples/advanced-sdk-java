package com.coinbase.advanced.model.publics;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetPublicProductBookRequest {
    @JsonProperty("product_id")
    private String productId;
    private Integer limit;
    @JsonProperty("aggregation_price_increment")
    private String aggregationPriceIncrement;

    public GetPublicProductBookRequest(String productId) {
        this.productId = productId;
    }

    private GetPublicProductBookRequest(Builder builder) {
        this.productId = builder.productId;
        this.limit = builder.limit;
        this.aggregationPriceIncrement = builder.aggregationPriceIncrement;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getAggregationPriceIncrement() {
        return aggregationPriceIncrement;
    }

    public void setAggregationPriceIncrement(String aggregationPriceIncrement) {
        this.aggregationPriceIncrement = aggregationPriceIncrement;
    }

    public static class Builder {
        private String productId;
        private Integer limit;
        private String aggregationPriceIncrement;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder aggregationPriceIncrement(String aggregationPriceIncrement) {
            this.aggregationPriceIncrement = aggregationPriceIncrement;
            return this;
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(productId)) {
                throw new CoinbaseClientException("productId cannot be null or empty");
            }
        }

        public GetPublicProductBookRequest build() throws CoinbaseClientException {
            validate();
            return new GetPublicProductBookRequest(this);
        }
    }
}
