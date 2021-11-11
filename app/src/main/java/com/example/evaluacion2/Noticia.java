package com.example.evaluacion2;

import java.io.Serializable;

public class Noticia implements Serializable {
    private int foto;
    private String titulo;
    private String fecha;
    private String descripcion;

    public Noticia(){
        foto = 0;
        titulo = "";
        fecha = "";
        descripcion = "";
    }

    public Noticia(int foto, String titulo, String fecha, String descripcion){
        this.foto = foto;
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
