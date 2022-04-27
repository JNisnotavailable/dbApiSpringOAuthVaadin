package com.example.application.views.list;

import com.example.application.data.model.partners.Partners;
import com.example.application.data.service.PartnerService;
import com.example.application.security.oauth.UserSession;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.util.List;

@Route(value = "partner", layout = MainLayout.class)
@PermitAll
public class PartnerListView extends VerticalLayout {

    Grid<Partners> partnersGrid = new Grid<>(Partners.class);

    public PartnerListView(UserSession userSession, PartnerService partnerService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(partnersGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(partnerService.getPartner(accessToken));
    }

    private void configureGrid(List<Partners> partners) {
        partnersGrid.addClassName("partnersGrid");
        partnersGrid.setSizeFull();
        partnersGrid.setColumns("productDescription");
        partnersGrid.getColumns().forEach(col -> col.setAutoWidth(true));
        partnersGrid.setItems(partners);

    }



}