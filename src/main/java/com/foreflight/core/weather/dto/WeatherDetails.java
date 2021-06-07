package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "report")
public class WeatherDetails {

    @JsonProperty(value = "conditions")
    private Conditions conditions;
    @JsonProperty(value = "forecast")
    private ForeCast foreCast;

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public ForeCast getForeCast() {
        return foreCast;
    }

    public void setForeCast(ForeCast foreCast) {
        this.foreCast = foreCast;
    }
}
