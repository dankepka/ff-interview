package com.foreflight.core.weather.dto;

import java.util.List;

public class Conditions {
    private String tempC;
    private String relativeHumidity;
    private List<CloudLayer> cloudLayers;
    private Visibility visibility;
    private Wind wind;


    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
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
