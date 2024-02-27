
package com.vet_tdc_academy.veterinaria.service;

import com.vet_tdc_academy.veterinaria.model.Duenio;
import com.vet_tdc_academy.veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
    @Autowired 
    IDuenioRepository duenioRepository;
    // ALTA
    @Override
    public void saveDuenio(Duenio due) {
        duenioRepository.save(due);
    }
    // BAJA
    @Override
    public void deleteDuenio(Integer id_duenio) {
        duenioRepository.deleteById(id_duenio);
    }
    // LECTURA
    @Override
    public Duenio findDuenio(Integer id_duenio) {
        Duenio due= duenioRepository.getReferenceById(id_duenio);
        return due;
    }
    @Override
    public List<Duenio> getDuenios() {
        return duenioRepository.findAll();
    }
    
    // EDICION LARGO
    @Override
    public Duenio editDuenio(Integer id_original, String dni_nuevo, Integer id_nuevo,
            String nombre_nuevo, String apellido_nueva, String celular_nueva){
        
        Duenio due = this.findDuenio(id_original);
        
        due.setId_duenio(id_nuevo);
        due.setNombre(nombre_nuevo);
        due.setApellido(apellido_nueva);
        due.setDni(dni_nuevo);
        due.setCelular(celular_nueva);
        
        this.saveDuenio(due);
        
        return this.findDuenio(id_nuevo);
    }
    // EDICION CORTO
    @Override
    public void editDuenio(Duenio due) {
         this.saveDuenio(due);
    }

    
}
