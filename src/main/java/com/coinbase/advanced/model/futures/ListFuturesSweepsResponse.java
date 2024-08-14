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