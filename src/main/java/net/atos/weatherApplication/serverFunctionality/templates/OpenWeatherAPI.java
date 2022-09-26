package net.atos.weatherApplication.serverFunctionality.templates;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.atos.weatherApplication.objects.City;
import net.atos.weatherApplication.objects.WeatherDay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeoutException;

public class OpenWeatherAPI {

    private static final String KEY = "93836445ebca1a81c1081e8b9fa753f0";
    private static final String URL = "https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}";

    public static WeatherDay getWeather(City city) throws TimeoutException{

        RestTemplate template = new RestTemplate();

        String url = URL.replaceFirst("\\{lat}", String.valueOf(city.getLat()))
                .replaceFirst("\\{lon}", String.valueOf(city.getLon()))
                .replaceFirst("\\{API key}", KEY);

        ResponseEntity<String> response = template.getForEntity(url, String.class);
        ObjectMapper mapper = new ObjectMapper();

        WeatherDay weatherDay;
        try {
            weatherDay = mapper.readValue(response.getBody(), WeatherDay.class);
            weatherDay.setCityName(city.getCityName());
            return weatherDay;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        throw new TimeoutException(URL.substring(0,URL.indexOf(".org")+4) + " is not available.");
    }
}
