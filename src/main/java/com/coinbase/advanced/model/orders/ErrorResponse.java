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

public class ErrorResponse {

    @JsonProperty("error")
    private String error;

    @JsonProperty("message")
    private String message;

    @JsonProperty("error_details")
    private String errorDetails;

    @JsonProperty("preview_failure_reason")
    private String previewFailureReason;

    @JsonProperty("new_order_failure_reason")
    private String newOrderFailureReason;

    public ErrorResponse() {}

    private ErrorResponse(Builder builder) {
        this.error = builder.error;
        this.message = builder.message;
        this.errorDetails = builder.errorDetails;
        this.previewFailureReason = builder.previewFailureReason;
        this.newOrderFailureReason = builder.newOrderFailureReason;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public String getPreviewFailureReason() {
        return previewFailureReason;
    }

    public void setPreviewFailureReason(String previewFailureReason) {
        this.previewFailureReason = previewFailureReason;
    }

    public String getNewOrderFailureReason() {
        return newOrderFailureReason;
    }

    public void setNewOrderFailureReason(String newOrderFailureReason) {
        this.newOrderFailureReason = newOrderFailureReason;
    }

    public static class Builder {
        private String error;
        private String message;
        private String errorDetails;
        private String previewFailureReason;
        private String newOrderFailureReason;

        public Builder error(String error) {
            this.error = error;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder errorDetails(String errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        public Builder previewFailureReason(String previewFailureReason) {
            this.previewFailureReason = previewFailureReason;
            return this;
        }

        public Builder newOrderFailureReason(String newOrderFailureReason) {
            this.newOrderFailureReason = newOrderFailureReason;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(this);
        }
    }
}
