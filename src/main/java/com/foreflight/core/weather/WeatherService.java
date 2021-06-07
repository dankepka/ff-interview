package com.foreflight.core.weather;

import com.foreflight.core.weather.dto.WeatherDetails;

public interface WeatherService {
    /**
     *
     * @param identifier
     * @return
     */
    WeatherDetails getWeatherDetails(String identifier);
}
