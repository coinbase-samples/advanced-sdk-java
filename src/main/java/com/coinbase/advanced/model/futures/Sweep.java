package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class Sweep {

    @JsonProperty("id")
    private String id;

    @JsonProperty("requested_amount")
    private Amount requestedAmount;

    @JsonProperty("should_sweep_all")
    private boolean shouldSweepAll;

    @JsonProperty("status")
    private String status;

    @JsonProperty("scheduled_time")
    private String scheduledTime;

    public Sweep() {}

    private Sweep(Builder builder) {
        this.id = builder.id;
        this.requestedAmount = builder.requestedAmount;
        this.shouldSweepAll = builder.shouldSweepAll;
        this.status = builder.status;
        this.scheduledTime = builder.scheduledTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Amount getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Amount requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public boolean isShouldSweepAll() {
        return shouldSweepAll;
    }

    public void setShouldSweepAll(boolean shouldSweepAll) {
        this.shouldSweepAll = shouldSweepAll;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public static class Builder {
        private String id;
        private Amount requestedAmount;
        private boolean shouldSweepAll;
        private String status;
        private String scheduledTime;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestedAmount(Amount requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder shouldSweepAll(boolean shouldSweepAll) {
            this.shouldSweepAll = shouldSweepAll;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder scheduledTime(String scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public Sweep build() {
            return new Sweep(this);
        }
    }
}
