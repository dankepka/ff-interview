package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonRootName(value = "report")
public class WeatherDetails {

    @JsonProperty("conditions")
    private Conditions conditions;
    @JsonProperty(value = "forecast")
    @JsonSerialize(using = ForecastConditionSerializer.class)
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
