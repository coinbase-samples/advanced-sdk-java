package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleFuturesSweepResponse {

    @JsonProperty("success")
    private boolean success;

    public ScheduleFuturesSweepResponse() {}

    private ScheduleFuturesSweepResponse(Builder builder) {
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

        public static Builder from(ScheduleFuturesSweepResponse resp) {
            return new Builder().success(resp.isSuccess());
        }

        public ScheduleFuturesSweepResponse build() {
            return new ScheduleFuturesSweepResponse(this);
        }
    }
}
