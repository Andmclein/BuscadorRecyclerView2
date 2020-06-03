package com.example.buscadorrecyclerview;

public class Usuario {
    String libro;
    String codigo;
    String categoria;

    public Usuario(String libro, String codigo, String categoria) {
        this.libro = libro;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
