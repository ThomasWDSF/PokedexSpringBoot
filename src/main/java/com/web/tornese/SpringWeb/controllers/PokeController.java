package com.web.tornese.SpringWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokeController {
    
    @GetMapping("/pokelista")
    public String index(){
        return "pokemons/index";
    }

}
