package com.udea.edu.co.busquedadevuelos.backendvirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
    
}