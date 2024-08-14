package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;

@JsonDeserialize(using = UnrealizedPnl.UnrealizedPnlDeserializer.class)
public class UnrealizedPnl {

    private Amount userNativeCurrency;
    private Amount rawCurrency;

    public UnrealizedPnl() {}

    private UnrealizedPnl(Builder builder) {
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

        public UnrealizedPnl build() {
            return new UnrealizedPnl(this);
        }
    }

    public static class UnrealizedPnlDeserializer extends JsonDeserializer<UnrealizedPnl> {
        @Override
        public UnrealizedPnl deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode node = p.getCodec().readTree(p);

            if (node.isNumber()) {
                Amount zeroAmount = new Amount("0", null);
                return new UnrealizedPnl.Builder()
                        .userNativeCurrency(zeroAmount)
                        .rawCurrency(zeroAmount)
                        .build();
            } else if (node.isObject()) {
                Amount userNativeCurrency = new Amount(
                        node.get("userNativeCurrency").get("value").asText(),
                        node.get("userNativeCurrency").get("currency").asText()
                );
                Amount rawCurrency = new Amount(
                        node.get("rawCurrency").get("value").asText(),
                        node.get("rawCurrency").get("currency").asText()
                );
                return new UnrealizedPnl.Builder()
                        .userNativeCurrency(userNativeCurrency)
                        .rawCurrency(rawCurrency)
                        .build();
            } else {
                throw new IllegalArgumentException("Unsupported JSON format for UnrealizedPnl");
            }
        }
    }
}
