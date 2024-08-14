package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FutureProductDetails {

    @JsonProperty("venue")
    private String venue;

    @JsonProperty("contract_code")
    private String contractCode;

    @JsonProperty("contract_expiry")
    private String contractExpiry;

    @JsonProperty("contract_size")
    private String contractSize;

    @JsonProperty("contract_root_unit")
    private String contractRootUnit;

    @JsonProperty("group_description")
    private String groupDescription;

    @JsonProperty("contract_expiry_timezone")
    private String contractExpiryTimezone;

    @JsonProperty("group_short_description")
    private String groupShortDescription;

    @JsonProperty("risk_managed_by")
    private String riskManagedBy;

    @JsonProperty("contract_expiry_type")
    private String contractExpiryType;

    @JsonProperty("perpetual_details")
    private PerpetualDetails perpetualDetails;

    @JsonProperty("contract_display_name")
    private String contractDisplayName;

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractExpiry() {
        return contractExpiry;
    }

    public void setContractExpiry(String contractExpiry) {
        this.contractExpiry = contractExpiry;
    }

    public String getContractSize() {
        return contractSize;
    }

    public void setContractSize(String contractSize) {
        this.contractSize = contractSize;
    }

    public String getContractRootUnit() {
        return contractRootUnit;
    }

    public void setContractRootUnit(String contractRootUnit) {
        this.contractRootUnit = contractRootUnit;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getContractExpiryTimezone() {
        return contractExpiryTimezone;
    }

    public void setContractExpiryTimezone(String contractExpiryTimezone) {
        this.contractExpiryTimezone = contractExpiryTimezone;
    }

    public String getGroupShortDescription() {
        return groupShortDescription;
    }

    public void setGroupShortDescription(String groupShortDescription) {
        this.groupShortDescription = groupShortDescription;
    }

    public String getRiskManagedBy() {
        return riskManagedBy;
    }

    public void setRiskManagedBy(String riskManagedBy) {
        this.riskManagedBy = riskManagedBy;
    }

    public String getContractExpiryType() {
        return contractExpiryType;
    }

    public void setContractExpiryType(String contractExpiryType) {
        this.contractExpiryType = contractExpiryType;
    }

    public PerpetualDetails getPerpetualDetails() {
        return perpetualDetails;
    }

    public void setPerpetualDetails(PerpetualDetails perpetualDetails) {
        this.perpetualDetails = perpetualDetails;
    }

    public String getContractDisplayName() {
        return contractDisplayName;
    }

    public void setContractDisplayName(String contractDisplayName) {
        this.contractDisplayName = contractDisplayName;
    }
}