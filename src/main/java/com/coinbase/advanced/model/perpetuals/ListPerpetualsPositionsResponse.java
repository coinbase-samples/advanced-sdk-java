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
