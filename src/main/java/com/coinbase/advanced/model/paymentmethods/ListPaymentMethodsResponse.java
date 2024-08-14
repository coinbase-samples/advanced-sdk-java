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
import java.util.List;

public class ListPaymentMethodsResponse {

    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;

    public ListPaymentMethodsResponse() {}

    private ListPaymentMethodsResponse(Builder builder) {
        this.paymentMethods = builder.paymentMethods;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public static class Builder {
        private List<PaymentMethod> paymentMethods;

        public Builder paymentMethods(List<PaymentMethod> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public ListPaymentMethodsResponse build() {
            return new ListPaymentMethodsResponse(this);
        }

        public static Builder from(ListPaymentMethodsResponse resp) {
            return new Builder()
                    .paymentMethods(resp.getPaymentMethods());
        }
    }
}
