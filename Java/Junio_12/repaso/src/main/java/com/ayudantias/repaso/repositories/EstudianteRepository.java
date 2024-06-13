package com.ayudantias.repaso.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantias.repaso.models.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
    
    // BUSCAR TODOS LOS DORMITORIOS
    List<Estudiante> findAll();

    // BUSCAR POR ID
    Optional<Estudiante> findById(Long id);

}
