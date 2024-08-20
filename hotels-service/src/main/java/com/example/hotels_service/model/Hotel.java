package com.example.hotels_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private Long id_hotel;
    private String nombre;
    private int estrellas;
    private Long id_city;
}
