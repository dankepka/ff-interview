package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ForecastConditionSerializer extends StdSerializer<ForeCast> {

    public ForecastConditionSerializer(){
        super(ForeCast.class);
    }

    @Override
    public void serialize(ForeCast conditionsForecasts, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        if(conditionsForecasts.getConditions().size()>2){
            List forecasts = Arrays.asList(conditionsForecasts.getConditions().get(1),conditionsForecasts.getConditions().get(2));
            jsonGenerator.writeObjectField("conditions",forecasts);
        }
        jsonGenerator.writeEndObject();
    }
}
