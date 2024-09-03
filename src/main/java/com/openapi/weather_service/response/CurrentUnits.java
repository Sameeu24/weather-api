package com.openapi.weather_service.response;

public record CurrentUnits(
        String time,
        String interval,
        String temperature
) {
}
