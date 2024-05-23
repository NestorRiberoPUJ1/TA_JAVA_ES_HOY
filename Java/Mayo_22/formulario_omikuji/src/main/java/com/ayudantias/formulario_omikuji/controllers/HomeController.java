package com.ayudantias.formulario_omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "index.jsp";
    }

    @PostMapping("/omikuji")
    public String postMethodName(
            RedirectAttributes redirectAttributes,
            @RequestParam("years") String years,
            @RequestParam("place") String place,
            @RequestParam("person") String person,
            @RequestParam("hobby") String hobby,
            @RequestParam("living") String living,
            @RequestParam("message") String message) {

        redirectAttributes.addFlashAttribute("years", years);
        redirectAttributes.addFlashAttribute("place", place);
        redirectAttributes.addFlashAttribute("person", person);
        redirectAttributes.addFlashAttribute("hobby", hobby);
        redirectAttributes.addFlashAttribute("living", living);
        redirectAttributes.addFlashAttribute("message", message);

        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showOmikuji() {
        return "result.jsp";
    }

}
