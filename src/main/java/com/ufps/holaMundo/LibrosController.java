package com.ufps.holaMundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LibrosController {

    @Autowired
    private LibroService libroService;

    @RequestMapping("/libros")
    public List<Libro> getAllLibros(){
        return libroService.getAllLibros();
    }

    @RequestMapping("/libros/{codigoLibro}")
    public Libro getLibro(@PathVariable String codigoLibro){
        return libroService.getLibro(codigoLibro);
    }
}
