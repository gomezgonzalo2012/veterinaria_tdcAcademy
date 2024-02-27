package com.vet_tdc_academy.veterinaria.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter @Setter
@Entity
@Table(name="duenios")
public class Duenio {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_duenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    
    // relacion 1 - n ( un dueño tiene muchos perros)
    @OneToMany(mappedBy="duenio"/*,fetch = FetchType.LAZY*/)
    @JsonIgnoreProperties("duenio")
    private List<Mascota> listaMascotas;

    public Duenio() {
    }

    public Duenio(Integer id_duenio, String dni, String nombre, String apellido, String celular, List<Mascota> listaMascotas) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.listaMascotas = listaMascotas;
    }
    
    
}
