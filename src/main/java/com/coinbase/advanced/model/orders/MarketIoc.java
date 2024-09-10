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

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketIoc {
    @JsonProperty("quote_size")
    private String quoteSize;

    @JsonProperty("base_size")
    private String baseSize;

    public String getQuoteSize() {
        return quoteSize;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public static class Builder {
        private String quoteSize;
        private String baseSize;

        public Builder quoteSize(String quoteSize) {
            this.quoteSize = quoteSize;
            return this;
        }

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public MarketIoc build() {
            MarketIoc marketIoc = new MarketIoc();
            marketIoc.quoteSize = this.quoteSize;
            marketIoc.baseSize = this.baseSize;
            return marketIoc;
        }
    }
}
