
package com.vet_tdc_academy.veterinaria.service;


import com.vet_tdc_academy.veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
//    Metodos CRUD 
//    ALTA
    public void saveDuenio(Duenio due);
    
//    BAJA
    public void deleteDuenio(Integer id_duenio);
    
//    MODIFICACION
    //    larga
    public Duenio editDuenio(Integer id_original, String dni_nuevo, Integer id_nuevo,
            String nombre_nuevo, String apellido_nueva, String celular_nueva);
    //    corta
    public void editDuenio(Duenio due);
    
//    LECTURA INDIVIDUAL
    public Duenio findDuenio(Integer id_duenio);
//    LECTURA COLECTIVA
    public List<Duenio> getDuenios();
}

