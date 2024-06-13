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
import com.ayudantias.repaso.services.DormitorioServices;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/dormitorios")
@AllArgsConstructor
public class DormitorioController {

    private final DormitorioServices dormitorioServices;

    // LISTAR TODOS LOS DORMITORIOS
    @GetMapping("")
    public List<Dormitorio> listarDormitorios() {
        return dormitorioServices.buscarTodos();
    }

    // BUSCAR DORMITORIO POR ID
    @GetMapping("/{id}")
    public Dormitorio buscarDormitorio(@PathVariable("id") Long id) {
        return dormitorioServices.buscarPorId(id);
    }

    // CREAR DORMITORIO
    @PostMapping("")
    public Dormitorio crearDormitorio(@RequestParam("nombre") String nombre) {
        Dormitorio dormitorio = new Dormitorio(nombre,null);
        return dormitorioServices.crearDormitorio(dormitorio);
    }

    // ACTUALIZAR DORMITORIO
    @PutMapping("/{id}")
    public Dormitorio actualizarDormitorio(@PathVariable("id") Long id, @RequestParam("nombre") String nombre) {
        Dormitorio dormitorio = dormitorioServices.buscarPorId(id);
        dormitorio.setNombre(nombre);
        return dormitorioServices.actualizarDormitorio(dormitorio);
    }

    // ELIMINAR DORMITORIO
    @DeleteMapping("/{id}")
    public void eliminarDormitorio(@PathVariable("id") Long id) {
        dormitorioServices.eliminarDormitorio(id);
    }

}
