package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderResponse {

    @JsonProperty("order")
    private Order order;

    public GetOrderResponse() {}

    private GetOrderResponse(Builder builder) {
        this.order = builder.order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static class Builder {
        private Order order;

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public static Builder from(GetOrderResponse resp) {
            return new Builder()
                    .order(resp.getOrder());
        }

        public GetOrderResponse build() {
            return new GetOrderResponse(this);
        }
    }
}
