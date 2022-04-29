package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

@PageTitle("Home")
@Route(value = "")
@AnonymousAllowed
public class HomeView extends VerticalLayout {
    private final OAuth2AuthorizedClientService clientService;

    public HomeView(OAuth2AuthorizedClientService clientService) {
        this.clientService = clientService;
        setSpacing(false);
        setPadding(false);
        add(navbar());
        add(body());
    }

    private Component navbar() {
        HorizontalLayout root = new HorizontalLayout();
        root.setWidthFull();
        root.setAlignItems(Alignment.CENTER);
        root.setFlexGrow(1);
        root.addClassNames("contrast-5pct");

        return root;
    }


    private Component body() {
        VerticalLayout root = new VerticalLayout();

        root.add(new H1("Berufsbildungswerk Praktikum Deutsche Bank 19.04.2022 - 29.04.2022"));
        root.add(new Paragraph("Dies ist eine Webserver App"));
        root.add(new ListItem("Java 11"));
        root.add(new ListItem("Spring Boot 2.6.7"));

        ListItem listItemSpringSecurity = new ListItem("Spring Security 5.6.3");
        com.vaadin.flow.component.button.Button springSecurityButton= new com.vaadin.flow.component.button.Button();
        springSecurityButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        springSecurityButton.setText("Spring Security");

        Anchor anchorSpringSecurity = new Anchor("https://spring.io/projects/spring-security", springSecurityButton);
        anchorSpringSecurity.setHref("https://spring.io/projects/spring-security");
        listItemSpringSecurity.add(anchorSpringSecurity);
        root.add(listItemSpringSecurity);

        ListItem listItemOAuth = new ListItem("Spring OAuth 5.6.3");
        Button oAuthButton = new Button();
        oAuthButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        oAuthButton.setText("OAuth2");

        Anchor anchorOAuth = new Anchor("https://oauth.net/2/", oAuthButton);
        anchorOAuth.setHref("https://oauth.net/2");
        listItemOAuth.add(anchorOAuth);
        root.add(listItemOAuth);

        ListItem listItemVaadin = new ListItem("Vaadin");
        Button vaadinButton = new Button();
        vaadinButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        listItemVaadin.setText("vaadin 23.06 - Frontend Generierung");

        Anchor anchorVaadin = new Anchor("https://vadin.com/docs/latest/flow/application");
        anchorVaadin.setHref("https://vaadin.com/docs/latest/flow/application");
        listItemVaadin.add(anchorVaadin);
        root.add(listItemVaadin);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (!(authentication instanceof OAuth2AuthenticationToken)) {
            Button loginButton = new Button();
            loginButton.setText("Login");
            loginButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
            loginButton.getStyle().set("padding-right", "1rem");
            loginButton.addClassName("toolbar");
            Anchor anchor = new Anchor("/login", loginButton);
            anchor.getElement().setAttribute("router-ignore", true);
            root.add(anchor);
        } else {
            Notification.show("Logged In");
            OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) authentication;
            OAuth2AuthorizedClient client = this.clientService.loadAuthorizedClient(token.getAuthorizedClientRegistrationId(), token.getName());
            String accessToken = client.getAccessToken().getTokenValue();
            Notification.show("Logged in with token: " + accessToken);
        }

        root.setSizeFull();
        root.setJustifyContentMode(JustifyContentMode.CENTER);
        root.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        root.getStyle().set("text-align", "center");

        return root;
    }
}
