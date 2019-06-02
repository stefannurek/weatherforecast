package com.ak.weatherforecast.service;

import com.ak.weatherforecast.model.WeatherModel;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherMapService implements WeatherService {
    @Override
    public WeatherModel getWeather(String city) {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city +
                ",pl&appid=ef2028e98b54649bf1f4c4582631f350";
        return new RestTemplate().getForObject(apiUrl, WeatherModel.class);

    }
}
