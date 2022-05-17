package com.ufps.holaMundo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LibroService {

    private List<Libro> libros= Arrays.asList(
            new Libro("libro1","Cien años de soledad","Gabriel","descripcion",1989),
            new Libro("libro2","Ensayo sobre la ceguera","Jose","descripcion",1989),
            new Libro("libro3","Fenomelogia del es","Hegel","descripcion",1989)
    );

    public List<Libro> getAllLibros(){
        return libros;
    }

    public Libro getLibro(String codigoLibro){
        return libros.stream().filter(l -> l.getCodigoLibro().equals(codigoLibro)).findFirst().get();
    }
}
