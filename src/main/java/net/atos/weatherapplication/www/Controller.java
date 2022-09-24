package net.atos.weatherapplication.www;


import net.atos.weatherapplication.objects.InputStringClass;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/")
    public String getCitiesFromUser(ModelMap modelMap) {
        modelMap.addAttribute("cities", new InputStringClass());
        return "index";
    }


}
