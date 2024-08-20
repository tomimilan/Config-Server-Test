package com.example.cities_service.controller;

import com.example.cities_service.dto.CityDTO;
import com.example.cities_service.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private ICityService cityServ;

    @GetMapping("/city")
    public CityDTO getCityAndHotels(@RequestParam String nombre, @RequestParam String pais){
        return cityServ.getCityAndHotels(nombre, pais);
    }
}
