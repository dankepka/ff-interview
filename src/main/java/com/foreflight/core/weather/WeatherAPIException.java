package com.foreflight.core.weather;

public class WeatherAPIException extends RuntimeException {
    public WeatherAPIException(String error) {
        super(error);
    }
}
