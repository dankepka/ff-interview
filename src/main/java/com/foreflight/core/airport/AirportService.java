package com.foreflight.core.airport;

import com.foreflight.core.airport.dto.AirportDetails;

public interface AirportService {
    /**
     *
     * @param identifier
     * @return
     */
    AirportDetails getAirportDetails(String identifier);
}
