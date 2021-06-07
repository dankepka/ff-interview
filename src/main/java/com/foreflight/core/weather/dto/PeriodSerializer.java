package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class PeriodSerializer extends StdSerializer<Period> {

    public PeriodSerializer(){
        super(Period.class);
    }

    @Override
    public void serialize(Period period, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        LocalDateTime start = period.getDateStart().atZone(ZoneOffset.UTC).toLocalDateTime();
        LocalDateTime end = period.getDateEnd().atZone(ZoneOffset.UTC).toLocalDateTime();
        long difference = ChronoUnit.MINUTES.between(start, end);
        long remainder = difference % 60;
        jsonGenerator.writeObjectField("dateStart",period.getDateStart());
        jsonGenerator.writeObjectField("dateEnd",period.getDateEnd());
        jsonGenerator.writeStringField("timeOffsetFromStart",String.format("%sh:%sm",difference/60,remainder));
        jsonGenerator.writeEndObject();
    }
}
