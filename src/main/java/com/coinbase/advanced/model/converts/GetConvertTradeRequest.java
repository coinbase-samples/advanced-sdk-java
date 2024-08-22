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

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetConvertTradeRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("trade_id")
    private String tradeId;

    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    public GetConvertTradeRequest() {}

    private GetConvertTradeRequest(Builder builder) {
        this.tradeId = builder.tradeId;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    @Override
    public String getPath() {
        return "/brokerage/convert/trade/" + tradeId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String tradeId;
        private String fromAccount;
        private String toAccount;

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

        public GetConvertTradeRequest build() {
            return new GetConvertTradeRequest(this);
        }
    }
}
