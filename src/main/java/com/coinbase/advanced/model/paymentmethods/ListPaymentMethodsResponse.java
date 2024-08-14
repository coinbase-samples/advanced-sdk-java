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
