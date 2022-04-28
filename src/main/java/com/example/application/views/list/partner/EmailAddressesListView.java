package com.example.application.views.list.partner;

import com.example.application.data.model.partners.EmailAddresses;
import com.example.application.data.model.partners.Partner;
import com.example.application.data.service.PartnerService;
import com.example.application.security.oauth.UserSession;
import com.example.application.views.list.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.util.List;

@Route(value = "emailaddress", layout = MainLayout.class)
@PageTitle("Partner - Email addresses")
@PermitAll
public class EmailAddressesListView extends VerticalLayout {
    Grid<EmailAddresses> emailaddressesGrid = new Grid<>(EmailAddresses.class);

    public EmailAddressesListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(emailaddressesGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getPartner(accessToken));
    }

    private void configureGrid(List<Partner> partners) {

        for (Partner partner : partners) {
            List<EmailAddresses> emailAddresses = partner.getEmailAddresses();

            emailaddressesGrid.addClassName("emailAddresses");
            emailaddressesGrid.setSizeFull();
            emailaddressesGrid.setColumns("emailAddress", "emailAddressType");
            emailaddressesGrid.getColumns().forEach(col -> col.setAutoWidth(true));
            emailaddressesGrid.setItems(emailAddresses);
        }
    }
}
