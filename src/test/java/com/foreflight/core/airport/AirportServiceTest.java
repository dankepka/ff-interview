package com.foreflight.core.airport;

import com.foreflight.core.airport.dto.AirportDetails;
import com.foreflight.web.Application;
import com.foreflight.web.ForeFlightConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@RunWith(SpringRunner.class)
@Import({ForeFlightConfig.class})
@SpringBootTest(classes = Application.class)
public class AirportServiceTest {
    @Autowired
    private AirportService airportService;

    @Test(expected = AirportAPIException.class)
    public void testBadAirportCode(){
        airportService.getAirportDetails("ABCDEFGHIJ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullAirportCode(){
        airportService.getAirportDetails(null);
    }

    @Test
    public void testValidAirportCode(){
        AirportDetails airportDetails = airportService.getAirportDetails("ORD");
        Assert.isTrue(StringUtils.hasLength(airportDetails.getName()),"Airport name is null");
    }
}
