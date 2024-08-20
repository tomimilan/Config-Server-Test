package com.example.hotels_service.service;

import com.example.hotels_service.model.Hotel;

import java.util.List;

public interface IHotelService {
    public List<Hotel> getHotelsByIdCity(Long id_city);
    public List<Hotel> loadHotels();
}
