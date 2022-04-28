package com.example.application.data.model.partners;

import java.util.List;

public class Organization {
    private List<Affiliations> affiliations;
    public String organizationName;
    private List<RepresentativeFunctions> representativeFunctions;
    private List<TaxIdentifications> taxIdentifications;
    public TradeRegisterEntry tradeRegisterEntry;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public List<TaxIdentifications> getTaxIdentifications() {
        return taxIdentifications;
    }

    public void setTaxIdentifications(List<TaxIdentifications> taxIdentifications) {
        this.taxIdentifications = taxIdentifications;
    }

    public List<Affiliations> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<Affiliations> affiliations) {
        this.affiliations = affiliations;
    }

    public List<RepresentativeFunctions> getRepresentativeFunctions() {
        return representativeFunctions;
    }

    public void setRepresentativeFunctions(List<RepresentativeFunctions> representativeFunctions) {
        this.representativeFunctions = representativeFunctions;
    }

    public TradeRegisterEntry getTradeRegisterEntry() {
        return tradeRegisterEntry;
    }

    public void setTradeRegisterEntry(TradeRegisterEntry tradeRegisterEntry) {
        this.tradeRegisterEntry = tradeRegisterEntry;
    }
}
