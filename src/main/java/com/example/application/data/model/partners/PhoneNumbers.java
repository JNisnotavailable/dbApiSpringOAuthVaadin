package com.example.application.data.model.partners;

public class PhoneNumbers {
    private CommunicationType communicationType;
    private String internationalAreaCode;
    private String areaCode;
    private String telephoneNumber;

    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(CommunicationType communicationType) {
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
