package com.ufps.holaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bienvenida")
public class SaludoController {

    @GetMapping("/Saludo")
    public String saludo(){
        return "Hola y bienvenidos al curso de Spring Boot :D";
    }
}
