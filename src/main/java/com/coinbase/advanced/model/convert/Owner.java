package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner {

    @JsonProperty("id")
    private String id;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("user_uuid")
    private String userUuid;

    @JsonProperty("type")
    private String type;

    public Owner() {}

    private Owner(Builder builder) {
        this.id = builder.id;
        this.uuid = builder.uuid;
        this.userUuid = builder.userUuid;
        this.type = builder.type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String id;
        private String uuid;
        private String userUuid;
        private String type;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder userUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        }
    }
}
