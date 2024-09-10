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

package com.coinbase.advanced.model.common;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DualCurrencyValue {

    @JsonProperty("userNativeCurrency")
    private Amount userNativeCurrency;

    @JsonProperty("rawCurrency")
    private Amount rawCurrency;

    public DualCurrencyValue() {}

    private DualCurrencyValue(Builder builder) {
        this.userNativeCurrency = builder.userNativeCurrency;
        this.rawCurrency = builder.rawCurrency;
    }

    public Amount getUserNativeCurrency() {
        return userNativeCurrency;
    }

    public void setUserNativeCurrency(Amount userNativeCurrency) {
        this.userNativeCurrency = userNativeCurrency;
    }

    public Amount getRawCurrency() {
        return rawCurrency;
    }

    public void setRawCurrency(Amount rawCurrency) {
        this.rawCurrency = rawCurrency;
    }

    public static class Builder {
        private Amount userNativeCurrency;
        private Amount rawCurrency;

        public Builder userNativeCurrency(Amount userNativeCurrency) {
            this.userNativeCurrency = userNativeCurrency;
            return this;
        }

        public Builder rawCurrency(Amount rawCurrency) {
            this.rawCurrency = rawCurrency;
            return this;
        }

        public DualCurrencyValue build() {
            return new DualCurrencyValue(this);
        }
    }
}
