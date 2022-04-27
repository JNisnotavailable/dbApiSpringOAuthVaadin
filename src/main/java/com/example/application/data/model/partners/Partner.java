package com.example.application.data.model.partners;

import java.util.List;

public class Partner {
    private String partnerType;
    private String contractingBank;
    private List<NaturalPerson> naturalPerson;
    private List<Community> community;
    private List<Organization> organization;
    private List<EmailAddresses> emailAddresses;
    private List<PhoneNumbers> phoneNumbers;
    private List<AdditionalPersonalData> additionalPersonalData;

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public String getContractingBank() {
        return contractingBank;
    }

    public void setContractingBank(String contractingBank) {
        this.contractingBank = contractingBank;
    }

    public List<NaturalPerson> getNaturalPerson() {
        return naturalPerson;
    }

    public void setNaturalPerson(List<NaturalPerson> naturalPerson) {
        this.naturalPerson = naturalPerson;
    }

    public List<Community> getCommunity() {
        return community;
    }

    public void setCommunity(List<Community> community) {
        this.community = community;
    }

    public List<Organization> getOrganization() {
        return organization;
    }

    public void setOrganization(List<Organization> organization) {
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

    public List<AdditionalPersonalData> getAdditionalPersonalData() {
        return additionalPersonalData;
    }

    public void setAdditionalPersonalData(List<AdditionalPersonalData> additionalPersonalData) {
        this.additionalPersonalData = additionalPersonalData;
    }
}
