package com.ayudantias.fruty_loops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayudantias.fruty_loops.models.Item;



@Controller
public class ItemController {

    @GetMapping("/")
    public String root(Model model) {

        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Manzana", 2));
        fruits.add(new Item("Banana", 2.5));
        fruits.add(new Item("Mango", 3.2));
        fruits.add(new Item("Fresa", 4.4));
        fruits.add(new Item("Coco", 5.0));
        fruits.add(new Item("Lucuma", 3.5));

        model.addAttribute("fruits", fruits);

        return "index.jsp";
    }

}
