package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schema {

    @JsonProperty("type")
    private String type;

    public Schema() {}

    private Schema(Builder builder) {
        this.type = builder.type;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Builder Class
    public static class Builder {
        private String type;

        public Builder() {}

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Schema build() {
            return new Schema(this);
        }
    }
}
