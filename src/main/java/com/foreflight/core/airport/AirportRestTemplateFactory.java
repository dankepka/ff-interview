package com.foreflight.core.airport;

import org.apache.http.HttpHost;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component(value = "aiportresttemplate")
public class AirportRestTemplateFactory implements FactoryBean<RestTemplate>, InitializingBean {

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
        HttpHost host = new HttpHost("localhost", 8080, "http");
        restTemplate = new RestTemplate(
                new HttpComponentsClientHttpRequestFactoryBasicAuth(host));
        restTemplate.getInterceptors().add(
                new BasicAuthenticationInterceptor("ff-interview", "@-*KzU.*dtP9dkoE7PryL2ojY!uDV.6JJGC9"));
        restTemplate.getInterceptors().add((httpRequest, body, execution) -> {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.add("ff-coding-exercise","1");
            return execution.execute(httpRequest, body);
        });
    }
}
