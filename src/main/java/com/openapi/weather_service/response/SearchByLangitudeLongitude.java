package com.openapi.weather_service.response;

public record SearchByLangitudeLongitude( double latitude,
                                          double longitude,
                                          double generationtimeMs,
                                          int utcOffsetSeconds,
                                          String timezone,
                                          String timezoneAbbreviation,
                                          double elevation,
                                          CurrentUnits currentUnits,
                                          Current current) {
}
