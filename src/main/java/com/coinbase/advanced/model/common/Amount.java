package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Amount {

    private String value;
    private String currency;

    // Default constructor
    public Amount() {}

    // Constructor
    public Amount(String value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    // Custom constructor to handle JSON objects
    @JsonCreator
    public Amount(@JsonProperty("value") JsonNode valueNode, @JsonProperty("currency") String currency) {
        if (valueNode.isNumber()) {
            this.value = valueNode.asText();  // Convert number to string
        } else if (valueNode.isTextual()) {
            this.value = valueNode.asText();  // Direct string value
        } else {
            // Handle more complex cases if needed
            throw new IllegalArgumentException("Unsupported value type for Amount: " + valueNode);
        }
        this.currency = currency;
    }

    // Getters and Setters
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
