package com.example.hotels_service.controller;

import com.example.hotels_service.model.Hotel;
import com.example.hotels_service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private IHotelService hotelServ;


    @GetMapping("/hotel/{id_city}")
    public List<Hotel> getHotelsByIdCity(@PathVariable ("id_city") Long id_city){
        return hotelServ.getHotelsByIdCity(id_city);
    }
}
