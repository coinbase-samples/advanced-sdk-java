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

import com.coinbase.advanced.model.common.TradeIncentiveMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateConvertQuoteRequest {
    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("trade_incentive_metadata")
    private TradeIncentiveMetadata tradeIncentiveMetadata;

    public CreateConvertQuoteRequest() {}

    private CreateConvertQuoteRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.amount = builder.amount;
        this.tradeIncentiveMetadata = builder.tradeIncentiveMetadata;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public String getAmount() {
        return amount;
    }

    public TradeIncentiveMetadata getTradeIncentiveMetadata() {
        return tradeIncentiveMetadata;
    }

    public static class Builder {
        private String fromAccount;
        private String toAccount;
        private String amount;
        private TradeIncentiveMetadata tradeIncentiveMetadata;

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder tradeIncentiveMetadata(TradeIncentiveMetadata tradeIncentiveMetadata) {
            this.tradeIncentiveMetadata = tradeIncentiveMetadata;
            return this;
        }

        public CreateConvertQuoteRequest build() {
            return new CreateConvertQuoteRequest(this);
        }
    }
}
