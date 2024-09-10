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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Amount {

    private String value;
    private String currency;

    public Amount() {}

    public Amount(String value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @JsonCreator
    public Amount(@JsonProperty("value") JsonNode valueNode, @JsonProperty("currency") String currency) {
        if (valueNode.isNumber()) {
            this.value = valueNode.asText();
        } else if (valueNode.isTextual()) {
            this.value = valueNode.asText();
        } else {
            throw new IllegalArgumentException("Unsupported value type for Amount: " + valueNode);
        }
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
