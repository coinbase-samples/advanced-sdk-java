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

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListFillsResponse {

    @JsonProperty("fills")
    private List<Fill> fills;

    @JsonProperty("cursor")
    private String cursor;

    public ListFillsResponse() {}

    private ListFillsResponse(Builder builder) {
        this.fills = builder.fills;
        this.cursor = builder.cursor;
    }

    public List<Fill> getFills() {
        return fills;
    }

    public void setFills(List<Fill> fills) {
        this.fills = fills;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static class Builder {
        private List<Fill> fills;
        private String cursor;

        public Builder fills(List<Fill> fills) {
            this.fills = fills;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ListFillsResponse build() {
            return new ListFillsResponse(this);
        }
    }
}
