package com.company.dominio;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pooflix {

    private int CANTIDAD = 15;
    private List<Material> materiales;
    private int codigoingresado=0;


    public Pooflix() {
        this.materiales = new ArrayList<>();
    }


    public boolean agregarMaterial(Material material){
        if(this.materiales.size() < CANTIDAD){
            this.materiales.add(material);
            return true;
        }
      return false;
    }
     public boolean retirarProducto(int codigoingresado){
         for (Material material : materiales) {
             if (codigoingresado == material.getCodigo())
             continue;
         }
         return false;
    }
//se sobrecarga el metodo por que uno recive un string otro resive un entero

    public List<Material> BuscarProducto(int codigo) {
        Material material = this.materiales.stream()
                .filter(code -> code.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
        return (List<Material>) material;

    }
    public List<Material> BuscarProducto() {
     return null;
    }

    public List<Material> BuscarProductoxtipo(String tipo) {
     return null;
    }
    public int calcularDuracionTotal(int duracion){
        return 0;
    }
    public void MostrarMateriales() {
        materiales.forEach(material -> {
            System.out.println(" Nombre--> "+material.getNombre()+" Tipo--> "+ material.getTipo()+" Duracion--> "+material.getDuracion()+" Codigo--> "+material.getCodigo());
        });

    }



}
