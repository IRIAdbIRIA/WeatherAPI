package net.atos.weatherApplication.serverFunctionality.dataBase;

import net.atos.weatherApplication.objects.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    private final CitiesRepository citiesRepository;

    @Autowired
    public CityService(CitiesRepository citiesRepository){
        this.citiesRepository = citiesRepository;
    }

    public Optional<City> find(long id) {
        return citiesRepository.findById(id);
    }

    public Optional<City> find(String name) {
        return citiesRepository.findByCityNameIgnoreCase(name);
    }

    public List<City> findAll() {
        return citiesRepository.findAll();
    }

    @Transactional
    public City save(City city) {
        return citiesRepository.save(city);
    }

    @Transactional
    public void delete(City city) {
        citiesRepository.delete(city);
    }

    @Transactional
    public void delete(long id) {
        citiesRepository.deleteById(id);
    }
}
