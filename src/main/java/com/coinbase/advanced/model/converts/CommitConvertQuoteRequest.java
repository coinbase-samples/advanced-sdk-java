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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommitConvertQuoteRequest {
    @JsonProperty("trade_id")
    @JsonIgnore
    private String tradeId;

    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    public CommitConvertQuoteRequest() {}

    private CommitConvertQuoteRequest(Builder builder) {
        this.tradeId = builder.tradeId;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public static class Builder {
        private String tradeId;
        private String fromAccount;
        private String toAccount;

        public Builder() {}

        public Builder tradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public CommitConvertQuoteRequest build() {
            return new CommitConvertQuoteRequest(this);
        }
    }
}
