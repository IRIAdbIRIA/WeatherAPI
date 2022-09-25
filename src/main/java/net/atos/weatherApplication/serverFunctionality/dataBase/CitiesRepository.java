package net.atos.weatherApplication.serverFunctionality.dataBase;

import net.atos.weatherApplication.objects.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CitiesRepository extends JpaRepository<City,Long> {

    Optional<City> findByCityNameIgnoreCase(String cityName);
}
