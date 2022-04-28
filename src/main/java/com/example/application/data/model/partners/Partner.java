package com.example.application.data.model.partners;

import java.util.List;

public class Partner {
    private AdditionalPersonalData additionalPersonalData;
    private Community community;
    private ContractingBank contractingBank;
    private List<EmailAddresses> emailAddresses;
    private NaturalPerson naturalPerson;
    private Organization organization;
    private PartnerType partnerType;
    private List<PhoneNumbers> phoneNumbers;

    public PartnerType getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType;
    }

    public ContractingBank getContractingBank() {
        return contractingBank;
    }

    public void setContractingBank(ContractingBank contractingBank) {
        this.contractingBank = contractingBank;
    }

    public NaturalPerson getNaturalPerson() {
        return naturalPerson;
    }

    public void setNaturalPerson(NaturalPerson naturalPerson) {
        this.naturalPerson = naturalPerson;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<EmailAddresses> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddresses> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public AdditionalPersonalData getAdditionalPersonalData() {
        return additionalPersonalData;
    }

    public void setAdditionalPersonalData(AdditionalPersonalData additionalPersonalData) {
        this.additionalPersonalData = additionalPersonalData;
    }
}
