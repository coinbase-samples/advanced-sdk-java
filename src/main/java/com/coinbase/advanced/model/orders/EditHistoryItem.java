package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EditHistoryItem {
    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    @JsonProperty("replace_accept_timestamp")
    private String replaceAcceptTimestamp;

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

    public String getReplaceAcceptTimestamp() {
        return replaceAcceptTimestamp;
    }

    public void setReplaceAcceptTimestamp(String replaceAcceptTimestamp) {
        this.replaceAcceptTimestamp = replaceAcceptTimestamp;
    }

    // Builder Class
    public static class Builder {
        private String price;
        private String size;
        private String replaceAcceptTimestamp;

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder replaceAcceptTimestamp(String replaceAcceptTimestamp) {
            this.replaceAcceptTimestamp = replaceAcceptTimestamp;
            return this;
        }

        public EditHistoryItem build() {
            EditHistoryItem item = new EditHistoryItem();
            item.price = this.price;
            item.size = this.size;
            item.replaceAcceptTimestamp = this.replaceAcceptTimestamp;
            return item;
        }
    }
}
