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

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxDetail {

    @JsonProperty("name")
    private String name;

    @JsonProperty("amount")
    private Amount amount;

    public TaxDetail() {}

    private TaxDetail(Builder builder) {
        this.name = builder.name;
        this.amount = builder.amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }


    public static class Builder {
        private String name;
        private Amount amount;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        public TaxDetail build() {
            return new TaxDetail(this);
        }
    }
}