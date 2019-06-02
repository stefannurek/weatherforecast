package com.ak.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherModel {

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private TemperatureModel temperatureModel = new TemperatureModel();

    @JsonProperty("weather")
    private List<WeatherDetailsModel> detailsModelList;



}
