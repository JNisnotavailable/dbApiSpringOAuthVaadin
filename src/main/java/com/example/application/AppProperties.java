package com.example.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppProperties {

    @Value("${dbApi.url.cashAccounts}")
    private String dbApiCashAccountsUrl;

    @Value("${dbApi.url.cashAccountTransactions}")
    private String dbApiCashAccountTransactionsUrl;

    @Value("${dbApi.url.Address}")
    private String dbApiAddressUrl;

    @Value("${dbApi.url.Partner}")
    private String dbApiPartnerUrl;

    public String getDbApiCashAccountsUrl() {
        return dbApiCashAccountsUrl;
    }

    public void setDbApiCashAccountsUrl(String dbApiCashAccountsUrl) {
        this.dbApiCashAccountsUrl = dbApiCashAccountsUrl;
    }

    public String getDbApiCashAccountTransactionsUrl() {
        return dbApiCashAccountTransactionsUrl;
    }

    public void setDbApiCashAccountTransactionsUrl(String dbApiCashAccountTransactionsUrl) {
        this.dbApiCashAccountTransactionsUrl = dbApiCashAccountTransactionsUrl;
    }

    public String getDbApiAddressUrl() {
        return dbApiAddressUrl;
    }

    public void setDbApiAddressUrl(String dbApiAddressUrl) {
        this.dbApiAddressUrl = dbApiAddressUrl;
    }

    public String getDbApiPartnerUrl() {
        return dbApiPartnerUrl;
    }

    public void setDbApiPartnerUrl(String dbApiPartnerUrl) {
        this.dbApiPartnerUrl = dbApiPartnerUrl;
    }
}
