package com.coinbase.advanced.model.publics;

import com.coinbase.advanced.model.common.Granularity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPublicProductCandlesRequest {
    @JsonProperty("product_id")
    @JsonIgnore
    private String productId;

    private String start;

    private String end;

    private Granularity granularity;

    private Integer limit;

    public GetPublicProductCandlesRequest(String productId) {
        this.productId = productId;
    }

    private GetPublicProductCandlesRequest(Builder builder) {
        this.productId = builder.productId;
        this.start = builder.start;
        this.end = builder.end;
        this.granularity = builder.granularity;
        this.limit = builder.limit;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public Granularity getGranularity() {
        return granularity;
    }

    public void setGranularity(Granularity granularity) {
        this.granularity = granularity;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class Builder {
        private String productId;
        private String start;
        private String end;
        private Granularity granularity;
        private Integer limit;

        public Builder productId(String productId) {
            this.productId = productId;
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

        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GetPublicProductCandlesRequest build() {
            return new GetPublicProductCandlesRequest(this);
        }
    }
}
