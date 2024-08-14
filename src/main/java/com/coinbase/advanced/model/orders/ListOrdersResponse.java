package com.coinbase.advanced.model.orders;

import com.coinbase.advanced.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListOrdersResponse {

    @JsonProperty("orders")
    private List<Order> orders;

    @JsonProperty("sequence")
    private String sequence;

    @JsonProperty("has_next")
    private boolean hasNext;

    @JsonProperty("cursor")
    private String cursor;

    public ListOrdersResponse() {}

    private ListOrdersResponse(Builder builder) {
        this.orders = builder.orders;
        this.sequence = builder.sequence;
        this.hasNext = builder.hasNext;
        this.cursor = builder.cursor;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static class Builder {
        private List<Order> orders;
        private String sequence;
        private boolean hasNext;
        private String cursor;

        public Builder orders(List<Order> orders) {
            this.orders = orders;
            return this;
        }

        public Builder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public static Builder from(ListOrdersResponse resp) {
            return new Builder()
                    .orders(resp.getOrders())
                    .sequence(resp.getSequence())
                    .hasNext(resp.isHasNext())
                    .cursor(resp.getCursor());
        }

        public ListOrdersResponse build() {
            return new ListOrdersResponse(this);
        }
    }
}
