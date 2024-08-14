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

public class GetFuturesPositionResponse {

    @JsonProperty("position")
    private FuturesPosition position;

    public GetFuturesPositionResponse() {}

    private GetFuturesPositionResponse(Builder builder) {
        this.position = builder.position;
    }

    public FuturesPosition getPosition() {
        return position;
    }

    public void setPosition(FuturesPosition position) {
        this.position = position;
    }

    public static class Builder {
        private FuturesPosition position;

        public Builder position(FuturesPosition position) {
            this.position = position;
            return this;
        }

        public static Builder from(GetFuturesPositionResponse resp) {
            return new Builder().position(resp.getPosition());
        }

        public GetFuturesPositionResponse build() {
            return new GetFuturesPositionResponse(this);
        }
    }
}
