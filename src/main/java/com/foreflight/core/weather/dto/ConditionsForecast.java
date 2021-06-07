package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ConditionsForecast {

    private String relativeHumidity;
    private Period period;
    private Wind wind;

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
