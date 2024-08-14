package com.coinbase.advanced.model.product;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.StringJoiner;

public class GetBestBidAskRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productIds;

    public GetBestBidAskRequest() {}

    private GetBestBidAskRequest(Builder builder) {
        this.productIds = builder.productIds;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    @Override
    public String getPath() {
        return "/brokerage/best_bid_ask";
    }

    @Override
    public String getQueryString() {
        if (productIds != null && !productIds.isEmpty()) {
            StringJoiner joiner = new StringJoiner(",");
            for (String id : productIds) {
                joiner.add(id);
            }
            return "product_ids=" + joiner.toString();
        }
        return "";
    }

    public static class Builder {
        private List<String> productIds;

        public Builder productIds(List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public GetBestBidAskRequest build() {
            return new GetBestBidAskRequest(this);
        }
    }
}
