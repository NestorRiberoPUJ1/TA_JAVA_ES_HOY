package com.ayudantias.repaso.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantias.repaso.models.Dormitorio;

@Repository
public interface DormitorioRepository extends CrudRepository<Dormitorio, Long> {
    
    // BUSCAR TODOS LOS DORMITORIOS
    List<Dormitorio> findAll();

    // BUSCAR POR ID
    Optional<Dormitorio> findById(Long id);

}
