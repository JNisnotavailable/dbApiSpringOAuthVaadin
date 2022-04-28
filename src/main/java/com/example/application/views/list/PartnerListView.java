package com.example.application.views.list;

import com.example.application.data.model.partners.Partner;
import com.example.application.data.service.PartnerService;
import com.example.application.security.oauth.UserSession;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.util.List;

@Route(value = "partner", layout = MainLayout.class)
@PageTitle("Partner")
@PermitAll
public class PartnerListView extends VerticalLayout {

    Grid<Partner> partnersGrid = new Grid<>(Partner.class);

    public PartnerListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(partnersGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getPartner(accessToken));
    }

    private void configureGrid(List<Partner> partner) {
        Grid.Column<Partner> additionalPersonalDataColumn = partnersGrid
                .addColumn(Partner::getAdditionalPersonalData).setHeader("Additional Personal Data");

        Grid.Column<Partner> partnerTypeColumn = partnersGrid
                .addColumn(Partner::getPartnerType).setHeader("Partner Type");

        Grid.Column<Partner> communityTypeColumn = partnersGrid
                .addColumn(Partner::getCommunity).setHeader("Community");


        partnersGrid.addClassName("partnersGrid");
        partnersGrid.setSizeFull();
        //partnersGrid.setColumns("additionalPersonalData", "community", "contractingBank", "emailAddresses", "naturalPerson", "organization", "partnerType", "phoneNumbers");
        partnersGrid.getColumns().forEach(col -> col.setAutoWidth(true));
        //partnersGrid.setItems(partner);

        HeaderRow headerRow = partnersGrid.prependHeaderRow();
        headerRow.join(additionalPersonalDataColumn, partnerTypeColumn, communityTypeColumn).setText("Partnerdaten");


    }



}