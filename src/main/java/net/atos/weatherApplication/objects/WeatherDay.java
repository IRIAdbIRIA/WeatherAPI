package net.atos.weatherApplication.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDay {

    private String cityName;
    private double temp;
    private double tempMin;
    private double tempMax;

    private String weatherType;

    private String icon;

    private double pressure;
    private double humidity;

    @JsonProperty("main")
    private void unpackMain(Map<String, Double> main) {
        temp = BigDecimal.valueOf(main.get("temp") - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        tempMin = BigDecimal.valueOf(main.get("temp_min") - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        tempMax = BigDecimal.valueOf(main.get("temp_max") - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        pressure = BigDecimal.valueOf(main.get("pressure") - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        humidity = BigDecimal.valueOf(main.get("humidity") - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @JsonProperty("weather")
    private void unpackWeather(List<Map<String, String>> weather) {
        this.weatherType=weather.get(0).get("main");
        icon=weather.get(0).get("icon");
    }

    public String getWeather(){
        return "temp - " + temp + ",tempMin - " + tempMax + ",tempMax - " + tempMax + ",weatherType - " + weatherType +
                ",pressure - " + pressure + ",humidity - " + humidity;
    }
}
