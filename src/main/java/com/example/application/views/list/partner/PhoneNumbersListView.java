package com.example.application.views.list.partner;

import com.example.application.data.model.partners.Partner;
import com.example.application.data.model.partners.PhoneNumbers;
import com.example.application.data.service.PartnerService;
import com.example.application.security.oauth.UserSession;
import com.example.application.views.list.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.util.List;

@Route(value = "phoneNumber", layout = MainLayout.class)
@PageTitle("Partner - Phone Numbers")
@PermitAll
public class PhoneNumbersListView extends VerticalLayout {
    Grid<PhoneNumbers> phoneNumbersGrid = new Grid<>(PhoneNumbers.class);

    public PhoneNumbersListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(phoneNumbersGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getPartner(accessToken));
    }

    private void configureGrid(List<Partner> partners) {

        for (Partner partner : partners) {
            List<PhoneNumbers> phoneNumbers = partner.getPhoneNumbers();

            phoneNumbersGrid.addClassName("phoneNumbers");
            phoneNumbersGrid.setSizeFull();
            phoneNumbersGrid.setColumns("areaCode", "telephoneNumber", "communicationType", "internationalAreaCode");
            phoneNumbersGrid.getColumns().forEach(col -> col.setAutoWidth(true));
            phoneNumbersGrid.setItems(phoneNumbers);
        }
    }
}
