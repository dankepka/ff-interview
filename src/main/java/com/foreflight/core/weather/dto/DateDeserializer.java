package com.foreflight.core.weather.dto;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateDeserializer extends StdDeserializer<Instant> {

    public DateDeserializer(){
      super(Instant.class);
    }

    @Override
    public Instant deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String text = jsonParser.getText();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                // date/time
                .append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                .optionalStart().appendOffset("+HHMM", "+0000").optionalEnd()
                .toFormatter();

        LocalDateTime localDateTime = LocalDateTime.parse(text, formatter);
        return localDateTime.toInstant(ZoneOffset.UTC);
    }
}
