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

package com.coinbase.advanced.model.publics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetServerTimeResponse {

    @JsonProperty("iso")
    private String iso;

    @JsonProperty("epochSeconds")
    private String epochSeconds;

    @JsonProperty("epochMillis")
    private String epochMillis;

    public GetServerTimeResponse() {}

    private GetServerTimeResponse(Builder builder) {
        this.iso = builder.iso;
        this.epochSeconds = builder.epochSeconds;
        this.epochMillis = builder.epochMillis;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getEpochSeconds() {
        return epochSeconds;
    }

    public void setEpochSeconds(String epochSeconds) {
        this.epochSeconds = epochSeconds;
    }

    public String getEpochMillis() {
        return epochMillis;
    }

    public void setEpochMillis(String epochMillis) {
        this.epochMillis = epochMillis;
    }

    public static class Builder {
        private String iso;
        private String epochSeconds;
        private String epochMillis;

        public Builder() {}

        public Builder iso(String iso) {
            this.iso = iso;
            return this;
        }

        public Builder epochSeconds(String epochSeconds) {
            this.epochSeconds = epochSeconds;
            return this;
        }

        public Builder epochMillis(String epochMillis) {
            this.epochMillis = epochMillis;
            return this;
        }

        public static Builder from(GetServerTimeResponse resp) {
            return new Builder()
                    .iso(resp.getIso())
                    .epochSeconds(resp.getEpochSeconds())
                    .epochMillis(resp.getEpochMillis());
        }

        public GetServerTimeResponse build() {
            return new GetServerTimeResponse(this);
        }
    }
}
