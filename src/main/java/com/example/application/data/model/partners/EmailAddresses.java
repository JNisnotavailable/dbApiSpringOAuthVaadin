package com.example.application.data.model.partners;

public class EmailAddresses {
    private String emailAddress;
    private EmailAddressType emailAddressType;

    public EmailAddressType getEmailAddressType() {
        return emailAddressType;
    }

    public void setEmailAddressType(EmailAddressType emailAddressType) {
        this.emailAddressType = emailAddressType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
