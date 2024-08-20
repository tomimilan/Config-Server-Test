package com.example.cities_service.service;

import com.example.cities_service.dto.CityDTO;
import com.example.cities_service.dto.HotelDTO;
import com.example.cities_service.model.City;
import com.example.cities_service.repository.ICityRepository;
import com.example.cities_service.repository.IHotelAPI;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService implements ICityService{


    @Autowired
    private IHotelAPI hotelAPI;

    @Override
    @CircuitBreaker(name = "hotels-service", fallbackMethod = "fallbackGetCityAndHotels")
    @Retry(name = "hotels-service")
    public CityDTO getCityAndHotels(String nombre, String pais) {
        List<City> cities = loadCities();
        City cityByName = new City();
        for (City city:cities){
            if (city.getNombre().equals(nombre)){
                cityByName = city;
                break;
            }
        }
        CityDTO cityDTO = new CityDTO();
        cityDTO.setId_ciudad(cityByName.getId_ciudad());
        cityDTO.setNombre(cityByName.getNombre());
        cityDTO.setContinente(cityByName.getContinente());
        cityDTO.setPais(cityByName.getPais());
        cityDTO.setProvincia(cityByName.getProvincia());

        List<HotelDTO> hotels = hotelAPI.getHotelsByIdCity(cityDTO.getId_ciudad());
        cityDTO.setHotels(hotels);
        //createException();
        return cityDTO;
    }

    /*@Override
    public CityDTO fallbackGetCityAndHotels(Throwable throwable){
        return new CityDTO(9999999L, "Fallido", "Fallido", "Fallido", "Fallido", null);

    }
    */
    /*@Override
    public void createException(){
        throw new IllegalArgumentException("Prueba Resilience y circuit breaker");
    }
    */
    @Override
    public List<City> loadCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City(1L, "Maipu", "South America", "Argentina", "Mendoza"));
        cities.add(new City(2L, "Curitiba", "South America", "Brasil", "Brasilia"));
        cities.add(new City(3L, "Godoy cruz", "South America", "Argentina", "Mendoza"));
        cities.add(new City(4L, "Maipu", "South America", "Chile", "Mendoza"));
        cities.add(new City(5L, "Ilpaca", "South America", "Bolivia", "Santa cruz"));

        return cities;
    }

}
