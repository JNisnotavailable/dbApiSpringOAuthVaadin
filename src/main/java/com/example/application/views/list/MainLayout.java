package com.example.application.views.list;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;

import javax.swing.text.html.ListView;

public class MainLayout extends AppLayout {

    public MainLayout() {
        createHaeder();
        createDrawer();
    }

    private void createHaeder() {
        H1 logo = new H1("Cash Accounts");
        logo.addClassNames("text-l", "m-m");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setSizeFull();
        header.addClassNames("py-0", "px-m");

        addToNavbar(header);
    }

    private void createDrawer() {
        RouterLink listView = new RouterLink("Cash Accounts", CashAccountListView.class);
        listView.setHighlightCondition(HighlightConditions.sameLocation());

        RouterLink addressListView = new RouterLink("Addresses", AddressListView.class);
        addressListView.setHighlightCondition(HighlightConditions.sameLocation());

        RouterLink partnerListView = new RouterLink("Partners", PartnerListView.class);
        partnerListView.setHighlightCondition(HighlightConditions.sameLocation());

        addToDrawer(new VerticalLayout(
            listView,
            addressListView,
            partnerListView,
            new RouterLink("Dashboard", DashboardView.class)
        ));
    }


}
