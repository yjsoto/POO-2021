package com.company.app;

import com.company.dominio.Material;
import com.company.dominio.Pooflix;
import com.company.dominio.TipoMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //List<Material> materiales= new ArrayList<>();
        Pooflix pooflix = new Pooflix();

        //agrego material
        Material Coco= new Material("Infantil","Coco",01,120);
        Material Intensamente= new Material("Infantil","Intensamente",02,95);
        Material BetiLaFea= new Material("Novela","BetiLaFea",03,320);
        Material PasionDeGabilanes= new Material("Novela","PasionDeGabilanes",04,245);
        Material HombresDeNegro= new Material("Pelicula","HombresDeNegro",05,120);
        Material Interestella= new Material("Pelicula","Interestella",06,240);
        Material Pawpatrols= new Material("Infantil","Pawpatrols",07,150);
        Material Flash= new Material("Serie","Flash",18,235);
        Material Arrow= new Material("Serie","Arrow",19,180);
        Material Salvajes= new Material("Documental","Salvajes",20,140);




        pooflix.agregarMaterial(Coco);
        pooflix.agregarMaterial(Intensamente);
        pooflix.agregarMaterial(BetiLaFea);
        pooflix.agregarMaterial(PasionDeGabilanes);
        pooflix.agregarMaterial(HombresDeNegro);
        pooflix.agregarMaterial(Interestella);
        pooflix.agregarMaterial(Pawpatrols);
        pooflix.agregarMaterial(Flash);
        pooflix.agregarMaterial(Arrow);
        pooflix.agregarMaterial(Salvajes);


        pooflix.MostrarMateriales();
        System.out.println("ingrese codigo del material que desea buscar:");
        int codigo = leer.nextInt();
        pooflix.BuscarProducto();














    }
}
