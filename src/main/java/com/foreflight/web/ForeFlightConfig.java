package com.foreflight.web;
import com.foreflight.core.airport.AirportRestTemplateFactory;
import com.foreflight.core.airport.AirportService;
import com.foreflight.core.airport.AirportServiceImpl;
import com.foreflight.core.weather.WeatherRestTemplateFactory;
import com.foreflight.core.weather.WeatherService;
import com.foreflight.core.weather.impl.WeatherServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ForeFlightConfig {
    @Bean
    FFApi ffapi(){
        return new FFApi();
    }

    @Bean
    AirportService airportService(){
        return new AirportServiceImpl();
    }

    @Bean
    WeatherService weatherService(){return new WeatherServiceImpl();}

    @Bean(name = "aiportresttemplate")
    AirportRestTemplateFactory airportRestTemplateFactory(){
        return new AirportRestTemplateFactory();
    }
    @Bean(name = "weatherresttemplate")
    WeatherRestTemplateFactory weatherTemplateFactory(){
        return new WeatherRestTemplateFactory();
    }
}
