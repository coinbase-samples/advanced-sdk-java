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

package com.coinbase.advanced.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amount {

    @JsonProperty("value")
    private String value;

    @JsonProperty("currency")
    private String currency;

    public Amount() {}

    private Amount(Builder builder) {
        this.value = builder.value;
        this.currency = builder.currency;
    }

    public static class Builder {
        private String value;
        private String currency;

        public Builder() {}

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Amount build() {
            return new Amount(this);
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
