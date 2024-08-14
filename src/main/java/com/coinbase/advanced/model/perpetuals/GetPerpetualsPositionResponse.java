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

package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPerpetualsPositionResponse {

    @JsonProperty("position")
    private IntxPosition position;

    public GetPerpetualsPositionResponse() {}

    private GetPerpetualsPositionResponse(Builder builder) {
        this.position = builder.position;
    }

    public IntxPosition getPosition() {
        return position;
    }

    public void setPosition(IntxPosition position) {
        this.position = position;
    }

    public static class Builder {
        private IntxPosition position;

        public Builder position(IntxPosition position) {
            this.position = position;
            return this;
        }

        public static Builder from(GetPerpetualsPositionResponse resp) {
            return new Builder()
                    .position(resp.getPosition());
        }

        public GetPerpetualsPositionResponse build() {
            return new GetPerpetualsPositionResponse(this);
        }
    }
}
