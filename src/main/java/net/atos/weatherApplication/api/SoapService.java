package net.atos.weatherApplication.api;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherApplication.objects.City;
import net.atos.weatherApplication.objects.WeatherDay;
import net.atos.weatherApplication.serverFunctionality.dataBase.CityService;
import net.atos.weatherApplication.serverFunctionality.templates.OpenWeatherAPI;
import net.atos.weatherApplication.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Slf4j
@Endpoint
public class SoapService implements WeatherAPI {

    private final CityService service;

    private static final String NAMESPACE_URI = "http://www.example.org/WeatherAPI/";

    @Autowired
    public SoapService(CityService service) {
        this.service = service;
    }

    @Override
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTownWeatherRequest")
    @ResponsePayload
    public GetTownWeatherResponse getWeatherOperation(@RequestPayload GetTownWeatherRequest parameters) throws GetTownWeatherRequestFaultMessage {
        System.out.println("parameters.getTownName()");
        Optional<City> city = service.find(parameters.getTownName());
        if (city.isPresent()){
            try {
                WeatherDay day = OpenWeatherAPI.getWeather(city.get());
                GetTownWeatherResponse response = new GetTownWeatherResponse();
                response.setCityName(parameters.getTownName());
                response.setTemp(day.getTemp());
                response.setWeatherType(day.getWeatherType());
                response.setTempMin(day.getTempMin());
                response.setTempMax(day.getTempMax());
                response.setPressure(day.getPressure());
                response.setHumidity(day.getHumidity());
                return response;
            } catch (Exception e) {
                GetTownWeatherRequestFault fault = new GetTownWeatherRequestFault();
                fault.setDesc(e.getMessage());
                throw new GetTownWeatherRequestFaultMessage("error",fault);
            }
        }else {
            GetTownWeatherRequestFault fault = new GetTownWeatherRequestFault();
            fault.setDesc("city not on the list");
            throw new GetTownWeatherRequestFaultMessage("error",fault);
        }
    }
}
