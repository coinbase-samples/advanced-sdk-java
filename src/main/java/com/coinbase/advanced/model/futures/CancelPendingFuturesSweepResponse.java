package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelPendingFuturesSweepResponse {

    @JsonProperty("success")
    private boolean success;

    public CancelPendingFuturesSweepResponse() {}

    private CancelPendingFuturesSweepResponse(Builder builder) {
        this.success = builder.success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class Builder {
        private boolean success;

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public static Builder from(CancelPendingFuturesSweepResponse resp) {
            return new Builder()
                    .success(resp.isSuccess());
        }

        public CancelPendingFuturesSweepResponse build() {
            return new CancelPendingFuturesSweepResponse(this);
        }
    }
}
