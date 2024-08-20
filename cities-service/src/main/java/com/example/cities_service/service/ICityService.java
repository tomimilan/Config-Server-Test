package com.example.cities_service.service;

import com.example.cities_service.dto.CityDTO;
import com.example.cities_service.model.City;

import java.util.List;

public interface ICityService {

    public CityDTO getCityAndHotels(String nombre, String pais);
    public List<City> loadCities();
    //public CityDTO fallbackGetCityAndHotels(Throwable throwable);
    //public void createException();
}
