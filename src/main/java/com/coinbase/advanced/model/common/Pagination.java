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

package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

    @JsonProperty("has_next")
    private boolean hasNext;

    @JsonProperty("cursor")
    private String cursor;

    @JsonProperty("size")
    private int size;

    public Pagination() {}

    private Pagination(Builder builder) {
        this.hasNext = builder.hasNext;
        this.cursor = builder.cursor;
        this.size = builder.size;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class Builder {
        private boolean hasNext;
        private String cursor;
        private int size;

        public Builder() {}

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Pagination build() {
            return new Pagination(this);
        }
    }
}
