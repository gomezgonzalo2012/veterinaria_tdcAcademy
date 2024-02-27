
package com.vet_tdc_academy.veterinaria.repository;

import com.vet_tdc_academy.veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio,Integer> {
    
}
