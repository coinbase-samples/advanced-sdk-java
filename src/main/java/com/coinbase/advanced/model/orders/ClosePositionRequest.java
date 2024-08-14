package com.coinbase.advanced.model.orders;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClosePositionRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("size")
    private String size;

    public ClosePositionRequest() {}

    private ClosePositionRequest(Builder builder) {
        this.clientOrderId = builder.clientOrderId;
        this.productId = builder.productId;
        this.size = builder.size;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getPath() {
        return "/brokerage/orders/close_position";
    }

    @Override
    public String getBody() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize ClosePositionRequest", e);
        }
    }

    public static class Builder {
        private String clientOrderId;
        private String productId;
        private String size;

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public ClosePositionRequest build() {
            return new ClosePositionRequest(this);
        }
    }
}
