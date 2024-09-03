package com.openapi.weather_service.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class HttpConfig {

//    RestClient restClient=RestClient.create();

    @Value("${api.base.url}")
    private String BASE_URL;

    @Bean
    public RestClient restClient(){
        return RestClient.create(BASE_URL);
    }
}
