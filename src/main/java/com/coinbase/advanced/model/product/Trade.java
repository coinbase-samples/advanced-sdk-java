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

package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Trade {

    @JsonProperty("trade_id")
    private String tradeId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    @JsonProperty("time")
    private String time;

    @JsonProperty("side")
    private String side;

    @JsonProperty("bid")
    private String bid;

    @JsonProperty("ask")
    private String ask;

    public Trade() {}

    private Trade(Builder builder) {
        this.tradeId = builder.tradeId;
        this.productId = builder.productId;
        this.price = builder.price;
        this.size = builder.size;
        this.time = builder.time;
        this.side = builder.side;
        this.bid = builder.bid;
        this.ask = builder.ask;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public static class Builder {
        private String tradeId;
        private String productId;
        private String price;
        private String size;
        private String time;
        private String side;
        private String bid;
        private String ask;

        public Builder tradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        public Builder ask(String ask) {
            this.ask = ask;
            return this;
        }

        public Trade build() {
            return new Trade(this);
        }
    }
}
