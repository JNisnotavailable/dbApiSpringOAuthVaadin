package com.example.application.views.list.partner;

import com.example.application.data.model.partners.NaturalPerson;
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

@Route(value = "naturalPerson", layout = MainLayout.class)
@PageTitle("Partner - Natural Person")
@PermitAll
public class NaturalPersonListView extends VerticalLayout {

    Grid<NaturalPerson> naturalPersonGrid = new Grid<>(NaturalPerson.class);

    public NaturalPersonListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(naturalPersonGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getPartner(accessToken));
    }

    private void configureGrid(List<Partner> partners) {

        for (Partner partner : partners) {
            NaturalPerson naturalPerson = partner.getNaturalPerson();

            naturalPersonGrid.addClassName("naturalPerson");
            naturalPersonGrid.setSizeFull();
            naturalPersonGrid.setColumns("firstName", "lastName", "dateOfBirth", "gender", "academicTitle", "titleOfNobility", "nationality", "birthName", "birthPlace");
            naturalPersonGrid.getColumns().forEach(col -> col.setAutoWidth(true));
            naturalPersonGrid.setItems(naturalPerson);
        }
    }

}
