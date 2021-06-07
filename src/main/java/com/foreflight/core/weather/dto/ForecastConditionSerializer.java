package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

public class ForecastConditionSerializer extends StdSerializer<List> {

    public ForecastConditionSerializer(){
        super(List.class);
    }

    @Override
    public void serialize(List conditionsForecasts, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        if(conditionsForecasts.size()>2){
            List forecasts = Arrays.asList(conditionsForecasts.get(1),conditionsForecasts.get(2));
            jsonGenerator.writeObjectField("conditions",forecasts);
        }
        jsonGenerator.writeEndObject();
    }
}
