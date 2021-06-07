package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ForeCast {

    @JsonProperty("conditions")
    private List<ConditionsForecast> conditions;

    public List<ConditionsForecast> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionsForecast> conditions) {
        this.conditions = conditions;
    }
}
