package com.example.application.views.list;

import com.example.application.data.model.Address;
import com.example.application.data.service.AddressService;
import com.example.application.security.oauth.UserSession;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.util.List;

@Route(value = "addresses", layout = MainLayout.class)
@PageTitle("Addresses")
@PermitAll
public class AddressListView extends VerticalLayout {

    Grid<Address> addressesGrid = new Grid<>(Address.class);

    public AddressListView(UserSession userSession, AddressService addressService) {
        addClassName("overview");
        setSizeFull();

        add(userSession.getUser().getFirstName());
        add(addressesGrid);

        String accessToken = userSession.getAccessToken();
        configureGrid(addressService.getAddress(accessToken));
    }

    private void configureGrid(List<Address> addresses) {
        addressesGrid.addClassName("addressGrid");
        addressesGrid.setSizeFull();
        addressesGrid.setColumns("street", "houseNumber", "zip", "city", "country", "registeredResidence", "addressType");
        addressesGrid.getColumns().forEach(col -> col.setAutoWidth(true));
        addressesGrid.setItems(addresses);
    }

}