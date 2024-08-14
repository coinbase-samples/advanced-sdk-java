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

package com.coinbase.advanced.model.paymentmethods;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPaymentMethodRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("payment_method_id")
    private String paymentMethodId;

    public GetPaymentMethodRequest() {}

    private GetPaymentMethodRequest(Builder builder) {
        this.paymentMethodId = builder.paymentMethodId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @Override
    public String getPath() {
        return String.format("/brokerage/payment_methods/%s", paymentMethodId);
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String paymentMethodId;

        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public GetPaymentMethodRequest build() {
            return new GetPaymentMethodRequest(this);
        }
    }
}
