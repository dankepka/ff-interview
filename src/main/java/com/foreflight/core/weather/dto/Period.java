package com.foreflight.core.weather.dto;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Instant;
import java.time.LocalDateTime;

public class Period {

    @JsonDeserialize(using = DateDeserializer.class)
    private Instant dateStart;
    @JsonDeserialize(using = DateDeserializer.class)
    private Instant dateEnd;


    public Instant getDateStart() {
        return dateStart;
    }

    public void setDateStart(Instant dateStart) {
        this.dateStart = dateStart;
    }

    public Instant getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Instant dateEnd) {
        this.dateEnd = dateEnd;
    }
}
