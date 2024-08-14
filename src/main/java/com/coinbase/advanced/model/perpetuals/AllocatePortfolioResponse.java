package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.model.common.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AllocatePortfolioResponse {

    @JsonProperty("description")
    private String description;

    @JsonProperty("schema")
    private Schema schema;

    public AllocatePortfolioResponse() {}

    private AllocatePortfolioResponse(Builder builder) {
        this.description = builder.description;
        this.schema = builder.schema;
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    // Builder Class
    public static class Builder {
        private String description;
        private Schema schema;

        public Builder() {}

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        public static Builder from(AllocatePortfolioResponse resp) {
            return new Builder()
                    .description(resp.getDescription())
                    .schema(resp.getSchema());
        }

        public AllocatePortfolioResponse build() {
            return new AllocatePortfolioResponse(this);
        }
    }
}
