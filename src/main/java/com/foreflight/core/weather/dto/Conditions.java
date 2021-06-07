package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Conditions {
    private Double tempC;
    private String relativeHumidity;
    private List<CloudLayer> cloudLayers;
    private Visibility visibility;
    private Wind wind;

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempC != null ? ((tempC * (1.8)) + 32) : null;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public List<CloudLayer> getCloudLayers() {
        return cloudLayers;
    }

    public void setCloudLayers(List<CloudLayer> cloudLayers) {
        this.cloudLayers = cloudLayers;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
