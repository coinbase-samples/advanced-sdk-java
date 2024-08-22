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

public class ListProductsResponse {

    @JsonProperty("products")
    private List<Product> products;

    @JsonProperty("num_products")
    private int numProducts;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public void setNumProducts(int numProducts) {
        this.numProducts = numProducts;
    }

    public static class Builder {
        private List<Product> products;
        private int numProducts;

        public Builder products(List<Product> products) {
            this.products = products;
            return this;
        }

        public Builder numProducts(int numProducts) {
            this.numProducts = numProducts;
            return this;
        }

        public ListProductsResponse build() {
            ListProductsResponse response = new ListProductsResponse();
            response.setProducts(this.products);
            response.setNumProducts(this.numProducts);
            return response;
        }
    }
}
