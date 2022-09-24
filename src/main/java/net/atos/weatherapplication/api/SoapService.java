package net.atos.weatherapplication.api;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.soap.GetTownWeatherRequest;
import net.atos.weatherapplication.soap.GetTownWeatherRequestFaultMessage;
import net.atos.weatherapplication.soap.GetTownWeatherResponse;
import net.atos.weatherapplication.soap.WeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Slf4j
@Endpoint
public class SoapService implements WeatherAPI {

    private static final String NAMESPACE_URI = "http://www.example.org/WeatherAPI/";

    @Autowired
    public SoapService() {
    }

    @Override
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTownWeatherRequest")
    @ResponsePayload
    public GetTownWeatherResponse getWeatherOperation(@RequestPayload GetTownWeatherRequest parameters) throws GetTownWeatherRequestFaultMessage {
        return null;
    }
}
