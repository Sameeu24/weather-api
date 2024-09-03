package com.openapi.weather_service.response;

import java.time.Instant;
import java.time.LocalDateTime;

public record Current(
        LocalDateTime time,
        int   interval,
        double   temperature
) {
}
