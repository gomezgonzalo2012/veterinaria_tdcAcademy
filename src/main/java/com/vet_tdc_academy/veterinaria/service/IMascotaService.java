
package com.vet_tdc_academy.veterinaria.service;

import com.vet_tdc_academy.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
//    Metodos CRUD 
//    ALTA
    public void saveMascota(Mascota masco);
    
//    BAJA
    public void deleteMascota(Integer id_mascota);
    
//    MODIFICACION
    //    larga
    public Mascota editMascota(Integer id_original, Integer id_nuevo,
            String nombre_nuevo, String especie_nueva, String raza_nueva,
            String color_nuevo);
    //    corta
    public void editMascota(Mascota masco);
    
//    LECTURA INDIVIDUAL
    public Mascota findMascota(Integer id_mascota);
//    LECTURA COLECTIVA
    public List<Mascota> getMascotas();
    
    // buscar mascotas especie = perro & raza = caniche
    
    public List<Mascota> findPerrosCaniche();
}
