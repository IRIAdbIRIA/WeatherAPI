package net.atos.weatherapplication.serverfunctionality;

import net.atos.weatherapplication.objects.WeatherDay;
import net.atos.weatherapplication.objects.WeatherType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonReader {

    public static ArrayList<WeatherDay> readWeather(String fileName){
        ArrayList<WeatherDay> weatherDays = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                try {
                    String tmp = scanner.nextLine();
                    String countryName = tmp.substring(tmp.indexOf("name") + 7, tmp.indexOf("country") - 3);
                    double tempMorn = Double.parseDouble(tmp.substring(tmp.indexOf("morn") + 6, tmp.indexOf("pressure") - 3));
                    double tempDay = Double.parseDouble(tmp.substring(tmp.indexOf("day") + 5, tmp.indexOf("min") - 2));
                    double tempEve = Double.parseDouble(tmp.substring(tmp.indexOf("eve") + 5, tmp.indexOf("morn") - 2));
                    double tempNight = Double.parseDouble(tmp.substring(tmp.indexOf("night") + 7, tmp.indexOf("eve") - 2));
                    double tempMin = Double.parseDouble(tmp.substring(tmp.indexOf("min") + 5, tmp.indexOf("max") - 2));
                    double tempMax = Double.parseDouble(tmp.substring(tmp.indexOf("max") + 5, tmp.indexOf("night") - 2));
                    double pressure = Double.parseDouble(tmp.substring(tmp.indexOf("pressure") + 10, tmp.indexOf("humidity") - 2));
                    double humidity = Double.parseDouble(tmp.substring(tmp.indexOf("humidity") + 10, tmp.indexOf("weather") - 2));
                    WeatherType weatherType;
                    String weatherTypeString = tmp.substring(tmp.indexOf("main") + 7, tmp.indexOf("description") - 3);
                    if (weatherTypeString.equals("Rain")) {
                        weatherType = WeatherType.Rain;
                    } else if (weatherTypeString.equals("Clouds")) {
                        weatherType = WeatherType.Clouds;
                    } else if (weatherTypeString.equals("Snow")) {
                        weatherType = WeatherType.Snow;
                    } else {
                        weatherType = WeatherType.Clear;
                    }

                    weatherDays.add(new WeatherDay(countryName, tempMorn -273.15, tempDay -273.15, tempEve-273.15, tempNight-273.15, tempMin-273.15, tempMax-273.15, weatherType, pressure, humidity));
                }catch (Exception e){
                    continue;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return weatherDays;

    }
}
