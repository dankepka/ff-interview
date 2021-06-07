package com.foreflight.core.airport.impl;

import com.foreflight.core.airport.AirportAPIException;
import com.foreflight.core.airport.AirportService;
import com.foreflight.core.airport.dto.AirportDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class AirportServiceImpl implements AirportService {

    public static String AIRPORTS_PREFIX = "https://qa.foreflight.com/airports/";

    @Autowired
    @Qualifier(value = "aiportresttemplate")
    private RestTemplate restTemplate;

    @Override
    public AirportDetails getAirportDetails(String identifier) {
        Assert.isTrue(StringUtils.hasLength(identifier),"Identifier is required.");
        try{
            String s = String.format("%s/%s",AIRPORTS_PREFIX,identifier);
            HttpEntity<String> requestEntity = new HttpEntity<>(null);
            ResponseEntity<AirportDetails> airportDetails = restTemplate.exchange(s, HttpMethod.GET,requestEntity, AirportDetails.class);
            return airportDetails.getBody();
        } catch (Exception e){
            throw new AirportAPIException("Airport api invocation error.");
        }
    }
}
