package com.coinbase.advanced.model.publics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPublicProductRequest {
    @JsonProperty("product_id")
    private String productId;

    public GetPublicProductRequest() {}

    private GetPublicProductRequest(Builder builder) {
        this.productId = builder.productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public static class Builder {
        private String productId;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public GetPublicProductRequest build() {
            return new GetPublicProductRequest(this);
        }
    }
}
