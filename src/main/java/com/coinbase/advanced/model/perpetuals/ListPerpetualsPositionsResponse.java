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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListPerpetualsPositionsResponse {

    @JsonProperty("positions")
    private List<IntxPosition> positions;

    @JsonProperty("summary")
    private IntxSummary summary;

    public ListPerpetualsPositionsResponse() {}

    private ListPerpetualsPositionsResponse(Builder builder) {
        this.positions = builder.positions;
        this.summary = builder.summary;
    }

    public List<IntxPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<IntxPosition> positions) {
        this.positions = positions;
    }

    public IntxSummary getSummary() {
        return summary;
    }

    public void setSummary(IntxSummary summary) {
        this.summary = summary;
    }

    public static class Builder {
        private List<IntxPosition> positions;
        private IntxSummary summary;

        public Builder() {}

        public Builder positions(List<IntxPosition> positions) {
            this.positions = positions;
            return this;
        }

        public Builder summary(IntxSummary summary) {
            this.summary = summary;
            return this;
        }

        public ListPerpetualsPositionsResponse build() {
            return new ListPerpetualsPositionsResponse(this);
        }
    }
}
