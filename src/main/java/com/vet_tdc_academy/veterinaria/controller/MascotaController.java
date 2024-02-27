/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vet_tdc_academy.veterinaria.controller;

import com.vet_tdc_academy.veterinaria.model.Mascota;
import com.vet_tdc_academy.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/mascota")
public class MascotaController {
    @Autowired 
    private IMascotaService mascoService;
    // ALTA
    @PostMapping("/mascota/alta")
    public void saveMascota(@RequestBody Mascota masco){
        mascoService.saveMascota(masco);
    }
    // BAJA
    @DeleteMapping("/mascota/eliminar/{id_mascota}")
    public void deleteMascota(@PathVariable Integer id_mascota){
        mascoService.deleteMascota(id_mascota);
    }
    // MODIFICAION
    @PutMapping("/mascota/editar/{id_original}")
    public Mascota editMascota(@PathVariable Integer id_original, @RequestParam(required = false, name = "id") Integer id_nuevo, 
            @RequestParam(required = false, name = "nombre") String nombre_nuevo, 
            @RequestParam(required = false, name = "especie") String especie_nueva, 
            @RequestParam(required = false, name = "raza")String raza_nueva, 
            @RequestParam(required = false, name = "color")String color_nuevo){
       return mascoService.editMascota(id_original, id_nuevo, nombre_nuevo, especie_nueva, raza_nueva, color_nuevo);
        
    }
    
    @PutMapping("/mascota/editar")
    public void editMascota(@RequestBody Mascota masco){
         mascoService.editMascota(masco);
    }
    // LECTURA
    @GetMapping("/mascota/traer/{id_mascota}")
    public Mascota findMascota(@PathVariable Integer id_mascota){
        return mascoService.findMascota(id_mascota);
    }
    @GetMapping("/mascota/traerTodos")
    public List<Mascota> getMascotass(){
        return mascoService.getMascotas();
    }
}
