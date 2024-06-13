package com.ayudantias.repaso.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ayudantias.repaso.models.Dormitorio;
import com.ayudantias.repaso.repositories.DormitorioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DormitorioServices {
    private final DormitorioRepository dormitorioRepository;


    // BUSCAR TODOS LOS DORMITORIOS
    public List<Dormitorio> buscarTodos() {
        return dormitorioRepository.findAll();
    }

    // BUSCAR POR ID
    public Dormitorio buscarPorId(Long id) {
        return dormitorioRepository.findById(id).orElse(null);
    }

    // CREAR DORMITORIO
    public Dormitorio crearDormitorio(Dormitorio dormitorio) {
        return dormitorioRepository.save(dormitorio);
    }

    // ACTUALIZAR DORMITORIO
    public Dormitorio actualizarDormitorio(Dormitorio dormitorio) {
        return dormitorioRepository.save(dormitorio);
    }

    // ELIMINAR DORMITORIO
    public void eliminarDormitorio(Long id) {
        dormitorioRepository.deleteById(id);
    }


}
