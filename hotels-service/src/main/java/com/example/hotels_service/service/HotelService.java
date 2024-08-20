package com.example.hotels_service.service;

import com.example.hotels_service.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService{

    @Override
    public List<Hotel> getHotelsByIdCity(Long id_city) {
         List<Hotel> hotels = loadHotels();
         List<Hotel> hotelsByCity = new ArrayList<>();

         for(Hotel hotel:hotels){
            if (hotel.getId_city().equals(id_city)){
                hotelsByCity.add(hotel);
            }
         }
         return hotelsByCity;
    }

    @Override
    public List<Hotel> loadHotels() {

        List<Hotel> hotels = new ArrayList<>();

        hotels.add(new Hotel(1L, "Hotel Marshall", 3, 3L));
        hotels.add(new Hotel(2L, "Hotel Andes", 2, 2L));
        hotels.add(new Hotel(3L, "Hotel Aconcagua", 3, 4L));
        hotels.add(new Hotel(4L, "Hotel Ilotas", 3, 1L));
        hotels.add(new Hotel(5L, "Hotel Ejecutivo", 5, 1L));
        hotels.add(new Hotel(6L, "Hotel Loras", 4, 1L));
        hotels.add(new Hotel(7L, "Hotel Ciri", 3, 1L));
        hotels.add(new Hotel(8L, "Hotel Geralt", 3, 3L));
        hotels.add(new Hotel(9L, "Hotel Ripley", 5, 2L));
        hotels.add(new Hotel(10L, "Hotel Terminator", 3, 1L));
        hotels.add(new Hotel(11L, "Hotel Mafeo", 3, 5L));
        hotels.add(new Hotel(12L, "Hotel Acuña", 3, 5L));

        return hotels;






    }

}
