package com.example.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {
    private Long id_ciudad;
    private String nombre;
    private String continente;
    private String pais;
    private String provincia;
    private List<HotelDTO> hotels;
}
