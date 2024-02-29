
package com.vet_tdc_academy.veterinaria.service;

import com.vet_tdc_academy.veterinaria.model.Mascota;
import com.vet_tdc_academy.veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    @Autowired 
    IMascotaRepository mascoRepository;
    
    @Override
    public void saveMascota(Mascota masco) {
        mascoRepository.save(masco);
    }

    @Override
    public void deleteMascota(Integer id_mascota) {
        mascoRepository.deleteById(id_mascota);
    }
    @Override
    public Mascota findMascota(Integer id_mascota) {
        Mascota masco= mascoRepository.getReferenceById(id_mascota);
        return masco;
    }
    // edit LARGO
    @Override
    public Mascota editMascota(Integer id_original, Integer id_nuevo, String nombre_nuevo, String especie_nueva, String raza_nueva, String color_nuevo) {
        // encontrar el objeto
        Mascota masco = this.findMascota(id_original);
        // editar sus datos
        masco.setId_mascota(id_nuevo);
        masco.setNombre(nombre_nuevo);
        masco.setEspecie(especie_nueva);
        masco.setRaza(raza_nueva);
        masco.setColor(color_nuevo);
        // guardamos
        this.saveMascota(masco);
        // retornamos el nuevo objeto
        return this.findMascota(id_nuevo);
    }
    // edit CORTO
    @Override
    public void editMascota(Mascota masco) {
         this.saveMascota(masco);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepository.findAll();
    }
        // buscar mascotas especie = perro & raza = caniche
    @Override
    public List<Mascota> findPerrosCaniche() {
        return mascoRepository.findPerroCaniche();
    }
    
}
