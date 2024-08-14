package com.coinbase.advanced.model.product;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMarketTradesRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("limit")
    private String limit;

    @JsonProperty("start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String start;

    @JsonProperty("end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String end;

    public GetMarketTradesRequest() {}

    private GetMarketTradesRequest(Builder builder) {
        this.productId = builder.productId;
        this.limit = builder.limit;
        this.start = builder.start;
        this.end = builder.end;
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String getPath() {
        return String.format("/brokerage/products/%s/ticker", productId);
    }

    @Override
    public String getQueryString() {
        StringBuilder queryParams = new StringBuilder();
        queryParams.append("limit=").append(limit);
        if (start != null && !start.isEmpty()) {
            queryParams.append("&start=").append(start);
        }
        if (end != null && !end.isEmpty()) {
            queryParams.append("&end=").append(end);
        }
        return queryParams.toString();
    }

    public static class Builder {
        private String productId;
        private String limit;
        private String start;
        private String end;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public GetMarketTradesRequest build() {
            return new GetMarketTradesRequest(this);
        }
    }
}
