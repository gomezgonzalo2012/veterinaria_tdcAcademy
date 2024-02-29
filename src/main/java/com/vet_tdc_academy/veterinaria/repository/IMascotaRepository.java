package com.vet_tdc_academy.veterinaria.repository;

import com.vet_tdc_academy.veterinaria.model.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Integer> {
    @Query(value= "SELECT * FROM mascota WHERE especie='perro' AND raza='caniche'", nativeQuery=true)
    public List<Mascota> findPerroCaniche();
}
