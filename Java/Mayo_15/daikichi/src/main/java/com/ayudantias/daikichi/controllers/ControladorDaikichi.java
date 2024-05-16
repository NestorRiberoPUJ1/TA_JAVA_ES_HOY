package com.ayudantias.daikichi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {

    /* RUTAS ESTATICAS */
    @GetMapping("")
    public String bienvenida() {
        return "Bienvenido";
    }

    @GetMapping("/today")
    public String today() {
        return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
    }

    @GetMapping("/tomorrow")
    public String tomorrow() {
        return "Mañana llegará una nueva oportunidad, debes estar abierto a nuevas ideas";
    }

    /* VARIABLES DE RUTAS */

    /* RUTA /TRAVEL/{ciudad} */
    @GetMapping("/travel/{ciudad}")
    public String travelCiudad(@PathVariable("ciudad") String ciudad) {
        return "Felicitaciones pronto viajaras a " + ciudad;
    }

    /* RUTA 'http://localhost:8080/daikichi/lotto/8', */

    @GetMapping("/lotto/{num}")
    public String lotto(@PathVariable("num") Integer num) {

        if (num % 2 == 0) {
            return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
        }

        return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
    }

}
