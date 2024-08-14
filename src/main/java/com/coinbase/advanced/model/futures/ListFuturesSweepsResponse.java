package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListFuturesSweepsResponse {

    @JsonProperty("sweeps")
    private List<Sweep> sweeps;

    public ListFuturesSweepsResponse() {}

    private ListFuturesSweepsResponse(Builder builder) {
        this.sweeps = builder.sweeps;
    }

    public List<Sweep> getSweeps() {
        return sweeps;
    }

    public void setSweeps(List<Sweep> sweeps) {
        this.sweeps = sweeps;
    }

    public static class Builder {
        private List<Sweep> sweeps;

        public Builder sweeps(List<Sweep> sweeps) {
            this.sweeps = sweeps;
            return this;
        }

        public static Builder from(ListFuturesSweepsResponse resp) {
            return new Builder().sweeps(resp.getSweeps());
        }

        public ListFuturesSweepsResponse build() {
            return new ListFuturesSweepsResponse(this);
        }
    }
}