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

        public static Builder from(SetIntradayMarginSettingResponse resp) {
            return new Builder()
                    .description(resp.getDescription())
                    .schema(resp.getSchema());
        }

        public SetIntradayMarginSettingResponse build() {
            return new SetIntradayMarginSettingResponse(this);
        }
    }
}
