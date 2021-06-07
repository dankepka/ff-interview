package com.foreflight.web;

import com.foreflight.core.airport.AirportService;
import com.foreflight.core.airport.dto.AirportDetails;
import com.foreflight.core.weather.WeatherService;
import com.foreflight.core.weather.dto.WeatherDetails;
import com.foreflight.web.dto.ApiResponse;
import com.foreflight.web.dto.Instructions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@Import(ForeFlightConfig.class)
public class FFApi {

    @Autowired
    private AirportService airportService;

    @Autowired
    private WeatherService weatherService;

    @GetMapping(produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    Instructions instructions(){
        return new Instructions();
    }

    @GetMapping(value = "/api/{airport}",produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    Object getResponse(@PathVariable("airport")String airport){
        try {
            AirportDetails airportDetails = airportService.getAirportDetails(airport);
            WeatherDetails weatherDetails = weatherService.getWeatherDetails(airport);
            return ApiResponse.ApiResponseBuilder.anApiResponse().
                    withAirportDetails(airportDetails).
                    withWeatherDetails(weatherDetails).build();
        }catch (Exception ex){
            throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR, "API Error", ex);
        }
    }
}
