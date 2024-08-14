package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Portfolio {

    @JsonProperty("name")
    private String name;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("type")
    private String type;

    @JsonProperty("deleted")
    private boolean deleted;

    public Portfolio() {}

    private Portfolio(Builder builder) {
        this.name = builder.name;
        this.uuid = builder.uuid;
        this.type = builder.type;
        this.deleted = builder.deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public static class Builder {
        private String name;
        private String uuid;
        private String type;
        private boolean deleted;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder deleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}