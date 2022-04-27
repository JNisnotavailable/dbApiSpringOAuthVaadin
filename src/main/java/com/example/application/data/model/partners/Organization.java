package com.example.application.data.model.partners;

import java.util.List;

public class Organization {
    public String organizationName;
    public List<TradeRegisterEntry> tradeRegisterEntryList;
    private List<TaxIdentifications> taxIdentifications;
    private List<Affiliations> affiliations;
    private List<RepresentativeFunctions> representativeFunctions;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public List<TradeRegisterEntry> getTradeRegisterEntryList() {
        return tradeRegisterEntryList;
    }

    public void setTradeRegisterEntryList(List<TradeRegisterEntry> tradeRegisterEntryList) {
        this.tradeRegisterEntryList = tradeRegisterEntryList;
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
}
