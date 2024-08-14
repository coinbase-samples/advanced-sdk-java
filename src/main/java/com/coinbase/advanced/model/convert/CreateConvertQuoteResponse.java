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

package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateConvertQuoteResponse {

    @JsonProperty("trade")
    private Convert convert;

    public CreateConvertQuoteResponse() {}

    private CreateConvertQuoteResponse(Builder builder) {
        this.convert = builder.convert;
    }

    public Convert getConvert() {
        return convert;
    }

    public static class Builder {
        private Convert convert;

        public Builder convert(Convert convert) {
            this.convert = convert;
            return this;
        }

        public static Builder from(CreateConvertQuoteResponse resp) {
            return new Builder().convert(resp.getConvert());
        }

        public CreateConvertQuoteResponse build() {
            return new CreateConvertQuoteResponse(this);
        }
    }
}
