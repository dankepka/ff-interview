package com.foreflight.core.airport.dto;

import java.util.List;

public class AirportDetails {
    private String faaCode;
    private String name;
    private List<Runway> runways;
    private Double latitude;
    private Double longitude;

    public String getFaaCode() {
        return faaCode;
    }

    public void setFaaCode(String faaCode) {
        this.faaCode = faaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Runway> getRunways() {
        return runways;
    }

    public void setRunways(List<Runway> runways) {
        this.runways = runways;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
