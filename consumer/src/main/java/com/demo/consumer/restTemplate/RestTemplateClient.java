package com.demo.consumer.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateClient {

    private static final String PROVIDER_URL = "http://localhost:8081";

    private final RestTemplate restTemplate;

    public String getInstanceInfo(){
        return restTemplate.getForObject(PROVIDER_URL + "/instance-info", String.class);
    }


}
