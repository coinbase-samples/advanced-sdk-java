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
