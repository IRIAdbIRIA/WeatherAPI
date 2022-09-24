package net.atos.weatherapplication.controller;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.objects.DaysBase;
import net.atos.weatherapplication.objects.InputStringClass;
import net.atos.weatherapplication.objects.WeatherDay;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@Controller
@Slf4j
public class WeatherController {
    private String[] cities;


    @GetMapping(path = "/cities")
    public String citieList(ModelMap modelMap) {
        modelMap.addAttribute("emptyOrder", new InputStringClass());
        return "index";
    }

    @PostMapping("/cities")
    public String handleNewOrder(@ModelAttribute InputStringClass stringClass) {
        System.out.println(stringClass.getTextField());
        cities = stringClass.getTextField().split(",");
        return "redirect:/order";

    }

    @GetMapping(path = "/order")
    public String getOrders(ModelMap modelMap) {

        ArrayList<WeatherDay> days = new ArrayList<>();
        for (int i = 0;i < DaysBase.weatherDays.size();i++){
            for (int k = 0;k < cities.length;k++){
                if (DaysBase.weatherDays.get(i).getCountryName().equals(cities[k])){
                    days.add(DaysBase.weatherDays.get(i));
                    cities[k] = "----";
                }
            }
        }
        modelMap.addAttribute("days", days);
        return "order";
    }

}


