package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePortfolioResponse {

    @JsonProperty("description")
    private String description;

    @JsonProperty("schema")
    private Schema schema;

    public DeletePortfolioResponse() {}

    private DeletePortfolioResponse(Builder builder) {
        this.description = builder.description;
        this.schema = builder.schema;
    }

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

    public static class Builder {
        private String description;
        private Schema schema;

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        public DeletePortfolioResponse build() {
            return new DeletePortfolioResponse(this);
        }
    }
}
