package com.coinbase.advanced.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductBookResponse {
    @JsonProperty("pricebook")
    private PriceBook priceBook;

    public GetProductBookResponse() {}

    private GetProductBookResponse(Builder builder) {
        this.priceBook = builder.priceBook;
    }

    public PriceBook getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(PriceBook priceBook) {
        this.priceBook = priceBook;
    }

    public static class Builder {
        private PriceBook priceBook;

        public Builder priceBook(PriceBook priceBook) {
            this.priceBook = priceBook;
            return this;
        }

        public GetProductBookResponse build() {
            return new GetProductBookResponse(this);
        }
    }
}
