package com.example.application.data.service;

import com.example.application.AppProperties;
import com.example.application.data.model.partners.Partner;
import com.example.application.data.model.partners.Partners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PartnerService {

    @Autowired
    AppProperties appProperties;

    public List<Partner> getPartner(String accessToken) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = appProperties.getDbApiPartnerUrl();

        Map<String, String> uriVariables = new HashMap<>();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity request = new HttpEntity(headers);

        ResponseEntity<Partners> response = restTemplate.exchange(
                resourceUrl,
                HttpMethod.GET,
                request,
                Partners.class
        );

        Partners partners = response.getBody();

        return partners.getPartners();
    }

}
