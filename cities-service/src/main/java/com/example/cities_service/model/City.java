package com.example.cities_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private Long id_ciudad;
    private String nombre;
    private String continente;
    private String pais;
    private String provincia;
}
