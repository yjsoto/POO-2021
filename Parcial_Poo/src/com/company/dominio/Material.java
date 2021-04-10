package com.company.dominio;

public class Material {
    private int codigo;
    private String nombre;
    private int duracion;
    private String tipo;

    public  Material (String tipo, String nombre, int codigo, int duracion){
        this.tipo= tipo;
        this.nombre= nombre;
        this.codigo = codigo;
        this.duracion= duracion;

    }

    public int getCodigo() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
