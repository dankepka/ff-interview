package com.foreflight.core.weather.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foreflight.core.weather.WeatherAPIException;
import com.foreflight.core.weather.WeatherService;
import com.foreflight.core.weather.dto.WeatherDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class WeatherServiceImpl implements WeatherService {

    public static String WEATHER_PREFIX = "https://qa.foreflight.com/weather/report";

    @Autowired
    @Qualifier(value = "weatherresttemplate")
    private RestTemplate restTemplate;

    @Override
    public WeatherDetails getWeatherDetails(String identifier) {
        Assert.isTrue(StringUtils.hasLength(identifier),"Identifier is required.");
        try {
            String s = String.format("%s/%s", WEATHER_PREFIX, identifier);
            Map response = restTemplate.getForObject(s,Map.class);
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            WeatherDetails weatherDetails1 = om.convertValue(response.get("report"),WeatherDetails.class);
            return weatherDetails1;
        }catch (Exception ex){
            throw new WeatherAPIException("Weather api invocation error.");
        }
    }
}
