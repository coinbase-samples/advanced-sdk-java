package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginationParams {

    @JsonProperty("cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cursor;

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;

    public PaginationParams() {}

    private PaginationParams(Builder builder) {
        this.cursor = builder.cursor;
        this.limit = builder.limit;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class Builder {
        private String cursor;
        private Integer limit;

        public Builder() {}

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public PaginationParams build() {
            return new PaginationParams(this);
        }
    }
}
