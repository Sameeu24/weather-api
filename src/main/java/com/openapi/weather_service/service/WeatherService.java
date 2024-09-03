package com.openapi.weather_service.service;


import com.openapi.weather_service.response.SearchByLangitudeLongitude;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestClient restClient;

    public SearchByLangitudeLongitude searchByLangitudeLongitude(String latitude,String longitude){
        return  restClient.get()
                .uri("/forecast?latitude={latitude}&longitude={longitude}&current=temperature",latitude,longitude)
                .retrieve()
                .body(SearchByLangitudeLongitude.class);
    }


}
