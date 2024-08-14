package com.coinbase.advanced.model.product;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductBookRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;

    public GetProductBookRequest() {}

    private GetProductBookRequest(Builder builder) {
        this.productId = builder.productId;
        this.limit = builder.limit;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String getPath() {
        return "/brokerage/product_book";
    }

    @Override
    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();
        queryString.append("product_id=").append(productId);
        if (limit != null && !limit.isEmpty()) {
            queryString.append("&limit=").append(limit);
        }
        return queryString.toString();
    }

    public static class Builder {
        private String productId;
        private String limit;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public GetProductBookRequest build() {
            return new GetProductBookRequest(this);
        }
    }
}
