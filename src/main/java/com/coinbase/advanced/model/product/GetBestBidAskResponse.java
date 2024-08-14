package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetBestBidAskResponse {

    @JsonProperty("pricebooks")
    private List<PriceBook> priceBooks;

    public GetBestBidAskResponse() {}

    private GetBestBidAskResponse(Builder builder) {
        this.priceBooks = builder.priceBooks;
    }

    public List<PriceBook> getPriceBooks() {
        return priceBooks;
    }

    public void setPriceBooks(List<PriceBook> priceBooks) {
        this.priceBooks = priceBooks;
    }

    public static class Builder {
        private List<PriceBook> priceBooks;

        public Builder priceBooks(List<PriceBook> priceBooks) {
            this.priceBooks = priceBooks;
            return this;
        }

        public GetBestBidAskResponse build() {
            return new GetBestBidAskResponse(this);
        }
    }
}
