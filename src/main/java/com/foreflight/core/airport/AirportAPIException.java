package com.foreflight.core.airport;

public class AirportAPIException extends RuntimeException {
    public AirportAPIException(String error) {
        super(error);
    }
}
