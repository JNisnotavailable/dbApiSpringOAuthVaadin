package com.example.application.data.model.partners;

import java.util.List;

public class AdditionalPersonalData {
    private List<TaxIdentifications> taxIdentifications;

    public List<TaxIdentifications> getTaxIdentifications() {
        return taxIdentifications;
    }

    public void setTaxIdentifications(List<TaxIdentifications> taxIdentifications) {
        this.taxIdentifications = taxIdentifications;
    }
}
