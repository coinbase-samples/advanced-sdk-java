/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrderResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("failure_reason")
    private String failureReason;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("success_response")
    private SuccessResponse successResponse;

    @JsonProperty("error_response")
    private ErrorResponse errorResponse;

    @JsonProperty("order_configuration")
    private OrderConfiguration orderConfiguration;

    public CreateOrderResponse() {}

    private CreateOrderResponse(Builder builder) {
        this.success = builder.success;
        this.failureReason = builder.failureReason;
        this.orderId = builder.orderId;
        this.successResponse = builder.successResponse;
        this.errorResponse = builder.errorResponse;
        this.orderConfiguration = builder.orderConfiguration;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public String getOrderId() {
        return orderId;
    }

    public SuccessResponse getSuccessResponse() {
        return successResponse;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public OrderConfiguration getOrderConfiguration() {
        return orderConfiguration;
    }

    public static class Builder {
        private boolean success;
        private String failureReason;
        private String orderId;
        private SuccessResponse successResponse;
        private ErrorResponse errorResponse;
        private OrderConfiguration orderConfiguration;

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
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

        public CreateOrderResponse build() {
            return new CreateOrderResponse(this);
        }
    }
}
