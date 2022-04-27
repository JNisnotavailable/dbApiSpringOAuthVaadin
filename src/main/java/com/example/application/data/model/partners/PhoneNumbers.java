package com.example.application.data.model.partners;

public class PhoneNumbers {
    private String communicationType;
    private String internationalAreaCode;
    private String areaCode;
    private String telephoneNumber;

    public String getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(String communicationType) {
        this.communicationType = communicationType;
    }

    public String getInternationalAreaCode() {
        return internationalAreaCode;
    }

    public void setInternationalAreaCode(String internationalAreaCode) {
        this.internationalAreaCode = internationalAreaCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
