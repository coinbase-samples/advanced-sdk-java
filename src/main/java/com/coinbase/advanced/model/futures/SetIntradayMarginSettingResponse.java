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

package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetIntradayMarginSettingResponse {

    @JsonProperty("description")
    private String description;

    @JsonProperty("schema")
    private Schema schema;

    public SetIntradayMarginSettingResponse() {}

    private SetIntradayMarginSettingResponse(Builder builder) {
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

    public static class Schema {
        @JsonProperty("type")
        private String type;

        @JsonProperty("title")
        private String title;

        public Schema() {}

        private Schema(Builder builder) {
            this.type = builder.type;
            this.title = builder.title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public static class Builder {
            private String type;
            private String title;

            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            }
        }
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

        public SetIntradayMarginSettingResponse build() {
            return new SetIntradayMarginSettingResponse(this);
        }
    }
}
