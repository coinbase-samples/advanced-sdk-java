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

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPaymentMethodResponse {

    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;

    public GetPaymentMethodResponse() {}

    private GetPaymentMethodResponse(Builder builder) {
        this.paymentMethod = builder.paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public static class Builder {
        private PaymentMethod paymentMethod;

        public Builder paymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public GetPaymentMethodResponse build() {
            return new GetPaymentMethodResponse(this);
        }
    }
}
