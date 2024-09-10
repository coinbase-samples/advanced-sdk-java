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

public class GetProductCandlesResponse {

    @JsonProperty("candles")
    private List<Candle> candles;

    public GetProductCandlesResponse() {}

    private GetProductCandlesResponse(Builder builder) {
        this.candles = builder.candles;
    }

    public List<Candle> getCandles() {
        return candles;
    }

    public void setCandles(List<Candle> candles) {
        this.candles = candles;
    }

    public static class Builder {
        private List<Candle> candles;

        public Builder candles(List<Candle> candles) {
            this.candles = candles;
            return this;
        }

        public GetProductCandlesResponse build() {
            return new GetProductCandlesResponse(this);
        }
    }
}
