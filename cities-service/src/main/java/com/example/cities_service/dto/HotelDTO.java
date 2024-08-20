package com.example.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO {
    private Long id_hotel;
    private String nombre;
    private int estrellas;
    private Long id_city;
}
