package net.atos.weatherApplication;

import net.atos.weatherApplication.objects.City;
import net.atos.weatherApplication.serverFunctionality.dataBase.CitiesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.fail;

@DataJpaTest
class ApplicationTests {

	@Autowired
	CitiesRepository repository;

	@BeforeEach
	public void startDB(){
		City cityA = new City();
		cityA.setLat(1);
		cityA.setLon(1);
		cityA.setCityName("A");
		City cityB = new City();
		cityB.setLat(2);
		cityB.setLon(2);
		cityB.setCityName("B");
		repository.save(cityA);
		repository.save(cityB);
	}

	@Test
	public void repositorySaveAndGetMethodsTest(){
		Optional<City> city = repository.findByCityNameIgnoreCase("A");
		if (city.isEmpty()){
			fail();
			return;
		}
		if (!city.get().getCityName().equals("A") &&
		city.get().getLat() == 1 && city.get().getLon() == 1){
			fail();
		}
	}

	@Test
	public void repositoryDeleteTest(){
		try {
			repository.getReferenceById(12L);
		}catch (Exception e){
			fail();
		}
		repository.deleteAll();
		try {
			repository.getReferenceById(1L);
			fail();
		}catch (Exception ignored){

		}
	}



}
