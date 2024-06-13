package com.ayudantias.repaso.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ayudantias.repaso.models.Estudiante;
import com.ayudantias.repaso.repositories.EstudianteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EstudianteServices {
    private final EstudianteRepository estudianteRepository;


    // BUSCAR TODOS LOS ESTUDIANTES
    public List<Estudiante> buscarTodos() {
        return estudianteRepository.findAll();
    }

    // BUSCAR POR ID
    public Estudiante buscarPorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    // CREAR ESTUDIANTE
    public Estudiante crearEstudiante(Estudiante dormitorio) {
        return estudianteRepository.save(dormitorio);
    }

    // ACTUALIZAR ESTUDIANTE
    public Estudiante actualizarEstudiante(Estudiante dormitorio) {
        return estudianteRepository.save(dormitorio);
    }

    // ELIMINAR ESTUDIANTE
    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }


}
