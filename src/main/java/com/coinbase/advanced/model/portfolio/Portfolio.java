package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Portfolio {
    @JsonProperty("name")
    private String name;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("type")
    private String type;

    @JsonProperty("deleted")
    private boolean deleted;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
