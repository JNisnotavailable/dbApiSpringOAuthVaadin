package com.example.application.data.model.partners;

public class Affiliations {
    private String naceCode;
    private Boolean isMainIndustry;
    private int percentage;

    public String getNaceCode() {
        return naceCode;
    }

    public void setNaceCode(String naceCode) {
        this.naceCode = naceCode;
    }

    public Boolean getMainIndustry() {
        return isMainIndustry;
    }

    public void setMainIndustry(Boolean mainIndustry) {
        isMainIndustry = mainIndustry;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
