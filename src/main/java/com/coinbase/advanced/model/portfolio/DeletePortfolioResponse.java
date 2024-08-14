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
