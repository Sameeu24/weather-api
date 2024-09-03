package com.openapi.weather_service.controller;


import com.openapi.weather_service.response.SearchByLangitudeLongitude;
import com.openapi.weather_service.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @GetMapping("/search")
    public ResponseEntity<SearchByLangitudeLongitude> searchByLangLong(@RequestParam("latitude") String latitude,@RequestParam("longitude") String longitude){
        return ResponseEntity.ok(weatherService.searchByLangitudeLongitude(latitude,longitude));
    }
}
