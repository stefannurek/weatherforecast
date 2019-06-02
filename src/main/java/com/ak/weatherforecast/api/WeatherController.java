package com.ak.weatherforecast.api;

import com.ak.weatherforecast.service.OpenWeatherMapService;
import com.ak.weatherforecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, ModelMap modelMap) {
        modelMap.put("weather", weatherService.getWeather(city));
        return "result";
    }
}
