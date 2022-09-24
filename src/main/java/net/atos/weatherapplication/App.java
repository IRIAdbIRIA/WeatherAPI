package net.atos.weatherapplication;

import net.atos.weatherapplication.objects.DaysBase;
import net.atos.weatherapplication.serverfunctionality.JsonReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String args[]) {
		//DaysBase.weatherDays = JsonReader.readWeather("daily_16.json");
		SpringApplication.run(App.class, args);
	}
}

