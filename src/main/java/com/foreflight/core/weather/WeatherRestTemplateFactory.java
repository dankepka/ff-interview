package com.foreflight.core.weather;

import com.foreflight.core.airport.HttpComponentsClientHttpRequestFactoryBasicAuth;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component(value = "weatherresttemplate")
public class WeatherRestTemplateFactory implements FactoryBean<RestTemplate>, InitializingBean {

    private RestTemplate restTemplate;

    public RestTemplate getObject() {
        return restTemplate;
    }
    public Class<RestTemplate> getObjectType() {
        return RestTemplate.class;
    }
    public boolean isSingleton() {
        return true;
    }

    public void afterPropertiesSet() {
        restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((httpRequest, body, execution) -> {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.add("ff-coding-exercise","1");
            return execution.execute(httpRequest, body);
        });
    }
}
