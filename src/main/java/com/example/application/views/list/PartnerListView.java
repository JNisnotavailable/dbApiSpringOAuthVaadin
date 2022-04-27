package com.example.application.views.list;

import com.example.application.data.model.CashAccount;
import com.example.application.data.service.CashAccountService;
import com.example.application.security.oauth.UserSession;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.*;
import org.hibernate.event.internal.MergeContext;

import javax.annotation.security.PermitAll;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Route(value = "partner", layout = MainLayout.class)
@PermitAll
public class PartnerListView extends VerticalLayout {

    Grid<Partner> partnersGrid = new Grid<>(Partner.class);

    public PartnerListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(partnersGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getCashAccountList(accessToken));
    }

    private void configureGrid(List<CashAccount> cashAccounts) {
        cashAccountsGrid.addClassName("cashAccountsGrid");
        cashAccountsGrid.setSizeFull();
        cashAccountsGrid.setColumns("productDescription");
        cashAccountsGrid.getColumns().forEach(col -> col.setAutoWidth(true));
        cashAccountsGrid.setItems(cashAccounts);

        cashAccountsGrid.addColumn(new ComponentRenderer<>(item -> {
                    Button getTransactionsButton = new Button("Get Transactions");
                    getTransactionsButton.addClickListener(click -> UI.getCurrent().navigate(CashAccountTransactionsListView.class, new RouteParameters("iban", item.getIban())));
                    HorizontalLayout editLayout = new HorizontalLayout(getTransactionsButton);
                    editLayout.setWidth("100%");
                    return editLayout;
                }))
                .setKey("transactionsButton")
                .setId("transactionsButton");
    }



}