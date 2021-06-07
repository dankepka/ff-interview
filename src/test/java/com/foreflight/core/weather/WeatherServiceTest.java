package com.foreflight.core.weather;


import com.foreflight.core.weather.dto.WeatherDetails;
import com.foreflight.web.Application;
import com.foreflight.web.ForeFlightConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@Import({ForeFlightConfig.class})
@SpringBootTest(classes = Application.class)
public class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;

    @Test(expected = WeatherAPIException.class)
    public void testBadAirportCode(){
        weatherService.getWeatherDetails("ABCDEFGHIJ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullAirportCode(){
        weatherService.getWeatherDetails(null);
    }

    @Test
    public void testValidAirportCode(){
        WeatherDetails weatherDetails = weatherService.getWeatherDetails("ORD");
        Assert.isTrue(null!=weatherDetails.getConditions(),"Conditions are null");
        Assert.isTrue(null!=weatherDetails.getForeCast(),"Forecast is null");
    }
}
