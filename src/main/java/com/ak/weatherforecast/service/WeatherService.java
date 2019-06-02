package com.ak.weatherforecast.service;

import com.ak.weatherforecast.model.WeatherModel;

public interface WeatherService {

    WeatherModel getWeather(String city);
}
