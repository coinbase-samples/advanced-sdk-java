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

package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntxSummary {

    @JsonProperty("aggregated_pnl")
    private Amount aggregatedPnl;

    public IntxSummary() {}

    private IntxSummary(Builder builder) {
        this.aggregatedPnl = builder.aggregatedPnl;
    }

    public Amount getAggregatedPnl() {
        return aggregatedPnl;
    }

    public void setAggregatedPnl(Amount aggregatedPnl) {
        this.aggregatedPnl = aggregatedPnl;
    }

    public static class Builder {
        private Amount aggregatedPnl;

        public Builder() {}

        public Builder aggregatedPnl(Amount aggregatedPnl) {
            this.aggregatedPnl = aggregatedPnl;
            return this;
        }

        public IntxSummary build() {
            return new IntxSummary(this);
        }
    }
}
