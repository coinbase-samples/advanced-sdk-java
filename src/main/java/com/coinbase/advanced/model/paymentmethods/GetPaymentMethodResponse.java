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

        public static Builder from(GetPaymentMethodResponse resp) {
            return new Builder()
                    .paymentMethod(resp.getPaymentMethod());
        }
    }
}
