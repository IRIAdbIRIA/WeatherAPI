package net.atos.weatherApplication.controller;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherApplication.objects.City;
import net.atos.weatherApplication.objects.InputStringClass;
import net.atos.weatherApplication.objects.WeatherDay;
import net.atos.weatherApplication.serverFunctionality.dataBase.CityService;
import net.atos.weatherApplication.serverFunctionality.templates.OpenWeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.TimeoutException;


@Controller
@Slf4j
public class WeatherController {
    private String[] cities;

    private final CityService service;

    @Autowired
    public WeatherController(CityService service) {
        this.service = service;
        City city = new City();
        city.setCityName("Kraków");
        city.setLat(50.049683);
        city.setLon(19.944544);
        service.save(city);
    }


    @GetMapping(path = "/cities")
    public String citiesList(ModelMap modelMap) {
        modelMap.addAttribute("emptyOrder", new InputStringClass());
        return "index";
    }

    @PostMapping(path = "/cities")
    public String handleNewOrder(@ModelAttribute InputStringClass stringClass) {
        cities = stringClass.getTextField().split(",");
        return "redirect:/order";

    }

    @GetMapping(path = "/order")
    public String getOrders(ModelMap modelMap) {
        System.out.println(service.findAll().size());
        ArrayList<WeatherDay> list = new ArrayList<>();
        for (String s : cities) {
            Optional<City> city = service.find(s);
            if (city.isPresent()) {
                try {
                    list.add(OpenWeatherAPI.getWeather(city.get()));
                } catch (TimeoutException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        modelMap.addAttribute("days", list);
        return "order";
    }

}


