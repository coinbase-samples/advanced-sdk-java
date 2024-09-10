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

package com.coinbase.advanced.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetBestBidAskResponse {

    @JsonProperty("pricebooks")
    private List<PriceBook> priceBooks;

    public GetBestBidAskResponse() {}

    private GetBestBidAskResponse(Builder builder) {
        this.priceBooks = builder.priceBooks;
    }

    public List<PriceBook> getPriceBooks() {
        return priceBooks;
    }

    public void setPriceBooks(List<PriceBook> priceBooks) {
        this.priceBooks = priceBooks;
    }

    public static class Builder {
        private List<PriceBook> priceBooks;

        public Builder priceBooks(List<PriceBook> priceBooks) {
            this.priceBooks = priceBooks;
            return this;
        }

        public GetBestBidAskResponse build() {
            return new GetBestBidAskResponse(this);
        }
    }
}
