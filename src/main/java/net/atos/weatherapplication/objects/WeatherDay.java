package net.atos.weatherapplication.objects;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDay {

    private final String countryName;
    private final double tempMorn;
    private final double tempDay;
    private final double tempEve;
    private final double tempNight;
    private final double tempMin;
    private final double tempMax;

    private final WeatherType weatherType;

    private final double pressure;
    private final double humidity;

    public WeatherDay(String countryName, double tempMorn, double tempDay, double tempEve, double tempNight, double tempMin, double tempMax, WeatherType weatherType, double pressure, double humidity) {
        this.countryName = countryName;
        this.tempMorn = tempMorn;
        this.tempDay = tempDay;
        this.tempEve = tempEve;
        this.tempNight = tempNight;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.weatherType = weatherType;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTempMorn() {
        return tempMorn;
    }

    public double getTempDay() {
        return tempDay;
    }

    public double getTempEve() {
        return tempEve;
    }

    public double getTempNight() {
        return tempNight;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getAll(){
        return "temp min - " + String.format("%.2f",tempMin) + ", temp max - "  + String.format("%.2f",tempMax) + ", temp morning - " +
                String.format("%.2f",tempMorn) + ", temp day - " + String.format("%.2f",tempDay) + ", temp eve - " + String.format("%.2f",tempEve) + ", temp night - " + String.format("%.2f",tempNight) +
                ", weather type - " + weatherType + ", pressure - " + pressure + ", humidity - " + humidity + "\n";
    }
}
