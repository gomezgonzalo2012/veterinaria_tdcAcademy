
package com.vet_tdc_academy.veterinaria.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Mascota  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    // relacion 1 - n ( un dueño tiene muchos perros)
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    @JsonIgnoreProperties("listaMascotas")
    @JoinColumn(name="id_duenio")
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(Integer id_mascota, String nombre, String especie, String raza, String color, Duenio duenio) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.duenio = duenio;
    }
    
    
    
}
