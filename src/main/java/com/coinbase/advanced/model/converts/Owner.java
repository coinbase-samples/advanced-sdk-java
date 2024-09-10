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

package com.coinbase.advanced.model.converts;

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
