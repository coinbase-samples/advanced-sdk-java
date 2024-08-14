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

package com.coinbase.advanced.model.fees;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gst {

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("type")
    private String type;

    public Gst() {}

    private Gst(Builder builder) {
        this.rate = builder.rate;
        this.type = builder.type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String rate;
        private String type;

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Gst build() {
            return new Gst(this);
        }
    }
}
