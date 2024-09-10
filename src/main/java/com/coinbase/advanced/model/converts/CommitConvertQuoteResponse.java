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

package com.coinbase.advanced.model.converts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommitConvertQuoteResponse {

    @JsonProperty("trade")
    private Convert trade;

    public CommitConvertQuoteResponse() {}

    private CommitConvertQuoteResponse(Builder builder) {
        this.trade = builder.trade;
    }

    public Convert getTrade() {
        return trade;
    }

    public void setTrade(Convert trade) {
        this.trade = trade;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Convert trade;

        public Builder() {}

        public Builder trade(Convert trade) {
            this.trade = trade;
            return this;
        }

        public static Builder from(CommitConvertQuoteResponse resp) {
            return new Builder().trade(resp.getTrade());
        }

        public CommitConvertQuoteResponse build() {
            return new CommitConvertQuoteResponse(this);
        }
    }
}
