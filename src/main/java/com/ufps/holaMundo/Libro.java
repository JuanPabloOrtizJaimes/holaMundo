package com.ufps.holaMundo;

public class Libro {

    String codigoLibro;
    String nombre;
    String autor;
    String descripcion;
    int anioPublicacion;

    public Libro(String codigoLibro, String nombre, String autor, String descripcion, int anioPublicacion) {
        this.codigoLibro = codigoLibro;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
