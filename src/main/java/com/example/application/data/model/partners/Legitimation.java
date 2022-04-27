package com.example.application.data.model.partners;

import java.util.List;

public class Legitimation {
    private int documentType;
    private String documentNumber;
    private String documentIssueDate;
    private String documentIssuingAuthority;
    private String documentExpirationDate;
    private List<CavState> cavState;

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentIssueDate() {
        return documentIssueDate;
    }

    public void setDocumentIssueDate(String documentIssueDate) {
        this.documentIssueDate = documentIssueDate;
    }

    public String getDocumentIssuingAuthority() {
        return documentIssuingAuthority;
    }

    public void setDocumentIssuingAuthority(String documentIssuingAuthority) {
        this.documentIssuingAuthority = documentIssuingAuthority;
    }

    public String getDocumentExpirationDate() {
        return documentExpirationDate;
    }

    public void setDocumentExpirationDate(String documentExpirationDate) {
        this.documentExpirationDate = documentExpirationDate;
    }

    public List<CavState> getCavState() {
        return cavState;
    }

    public void setCavState(List<CavState> cavState) {
        this.cavState = cavState;
    }
}
