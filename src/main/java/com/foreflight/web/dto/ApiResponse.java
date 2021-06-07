package com.foreflight.web.dto;

import com.foreflight.core.airport.dto.AirportDetails;
import com.foreflight.core.weather.dto.WeatherDetails;

public class ApiResponse {

    private AirportDetails airportDetails;
    private WeatherDetails weatherDetails;

    private ApiResponse(){};

    public AirportDetails getAirportDetails() {
        return airportDetails;
    }

    public WeatherDetails getWeatherDetails() {
        return weatherDetails;
    }

    public static final class ApiResponseBuilder {
        private AirportDetails airportDetails;
        private WeatherDetails weatherDetails;

        private ApiResponseBuilder() {
        }

        public static ApiResponseBuilder anApiResponse() {
            return new ApiResponseBuilder();
        }

        public ApiResponseBuilder withAirportDetails(AirportDetails airportDetails) {
            this.airportDetails = airportDetails;
            return this;
        }

        public ApiResponseBuilder withWeatherDetails(WeatherDetails weatherDetails) {
            this.weatherDetails = weatherDetails;
            return this;
        }

        public ApiResponse build() {
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.airportDetails = this.airportDetails;
            apiResponse.weatherDetails = this.weatherDetails;
            return apiResponse;
        }
    }
}
