package com.ayudantias.repaso.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ayudantias.repaso.models.Dormitorio;
import com.ayudantias.repaso.models.Estudiante;
import com.ayudantias.repaso.services.DormitorioServices;
import com.ayudantias.repaso.services.EstudianteServices;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/estudiantes")
@AllArgsConstructor
public class EstudianteController {

    private final EstudianteServices estudianteServices;
    private final DormitorioServices dormitorioServices;

    // LISTAR TODOS LOS ESTUIDANTES
    @GetMapping("")
    public List<Estudiante> listarEstudiantes() {
        return estudianteServices.buscarTodos();
    }

    // BUSCAR ESTUIDANTE POR ID
    @GetMapping("/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id") Long id) {
        return estudianteServices.buscarPorId(id);
    }

    // CREAR ESTUIDANTE
    @PostMapping("")
    public Estudiante crearEstudiante(
            @RequestParam("nombre") String nombre,
            @RequestParam("dormitorioId") Long dormitorioId) {
        Dormitorio buscarDormitorio = dormitorioServices.buscarPorId(dormitorioId);
        if (buscarDormitorio == null) {
            return null;
        }
        Estudiante estudiante = new Estudiante(nombre, buscarDormitorio);
        return estudianteServices.crearEstudiante(estudiante);
    }

    // ACTUALIZAR ESTUIDANTE
    @PutMapping("/{id}")
    public Estudiante actualizarEstudiante(
            @PathVariable("id") Long id,
            @RequestParam("nombre") String nombre,
            @RequestParam("dormitorioId") Long dormitorioId) {
        Dormitorio buscarDormitorio = dormitorioServices.buscarPorId(dormitorioId);
        if (buscarDormitorio == null) {
            return null;
        }
        Estudiante estudiante = estudianteServices.buscarPorId(id);
        estudiante.setNombre(nombre);
        estudiante.setDormitorio(buscarDormitorio);
        return estudianteServices.actualizarEstudiante(estudiante);
    }

    // ELIMINAR ESTUIDANTE
    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable("id") Long id) {
        estudianteServices.eliminarEstudiante(id);
    }

}
