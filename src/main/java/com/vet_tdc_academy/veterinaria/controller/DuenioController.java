
package com.vet_tdc_academy.veterinaria.controller;

import com.vet_tdc_academy.veterinaria.model.Duenio;
import com.vet_tdc_academy.veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    @Autowired 
    IDuenioService duenioService;
    
    // ALTA
    @PostMapping("/duenio/alta")
    public void saveDuenio(@RequestBody Duenio duenio){
        duenioService.saveDuenio(duenio);
    }
    // BAJA
    @DeleteMapping("/duenio/eliminar/{id_duenio}")
    public void deleteDuenio(@PathVariable Integer id_duenio){
        duenioService.deleteDuenio(id_duenio);
    }
    // LECTURA
    @GetMapping("/duenio/traerTodos")
    public List<Duenio> getDuenios(){
        return duenioService.getDuenios();
    }
    @GetMapping("/duenio/traer/{id_duenio}")
    public Duenio findDuenio(@PathVariable Integer id_duenio){
        return duenioService.findDuenio(id_duenio);
    }
    
    // EDICION
    @PutMapping("duenio/editar")
    public void editDuenio(@RequestBody Duenio duenio){
        duenioService.editDuenio(duenio);
    }
}
