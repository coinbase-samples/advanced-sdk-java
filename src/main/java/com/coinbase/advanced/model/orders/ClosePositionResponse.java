package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClosePositionResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("success_response")
    private SuccessResponse successResponse;

    @JsonProperty("error_response")
    private ErrorResponse errorResponse;

    @JsonProperty("order_configuration")
    private OrderConfiguration orderConfiguration;

    public ClosePositionResponse() {}

    private ClosePositionResponse(Builder builder) {
        this.success = builder.success;
        this.successResponse = builder.successResponse;
        this.errorResponse = builder.errorResponse;
        this.orderConfiguration = builder.orderConfiguration;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SuccessResponse getSuccessResponse() {
        return successResponse;
    }

    public void setSuccessResponse(SuccessResponse successResponse) {
        this.successResponse = successResponse;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public OrderConfiguration getOrderConfiguration() {
        return orderConfiguration;
    }

    public void setOrderConfiguration(OrderConfiguration orderConfiguration) {
        this.orderConfiguration = orderConfiguration;
    }

    public static class Builder {
        private boolean success;
        private SuccessResponse successResponse;
        private ErrorResponse errorResponse;
        private OrderConfiguration orderConfiguration;

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder successResponse(SuccessResponse successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public Builder errorResponse(ErrorResponse errorResponse) {
            this.errorResponse = errorResponse;
            return this;
        }

        public Builder orderConfiguration(OrderConfiguration orderConfiguration) {
            this.orderConfiguration = orderConfiguration;
            return this;
        }

        public ClosePositionResponse build() {
            return new ClosePositionResponse(this);
        }
    }
}
