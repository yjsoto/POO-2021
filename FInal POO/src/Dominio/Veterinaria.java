package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Veterinaria {

    private String nombre;
    private List<MascotaApta> mascotasApta = new ArrayList<>();

    public Veterinaria(String nombre) {
        this.nombre = nombre;

    }

    public mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado){
        if(sexo.equalsIgnoreCase("macho") && edad > 12 && esterilizado == false || sexo.equalsIgnoreCase("hembra") && edad > 18 && esterilizado == false){
            return new MascotaApta(nombre,sexo,edad,esterilizado);

        }else{
            return new MascotaEsterilizada(nombre,sexo,edad,esterilizado);
        }


    }

    public  List<MascotaApta> getPacientesAOperar(){

        List<MascotaApta> getPacientesAOperar= new ArrayList<>();
        getPacientesAOperar = this.mascotasApta.stream().filter(mascotaApta -> mascotaApta.isEsterilizado()==false ).collect(Collectors.toList());
        return getPacientesAOperar;


    }
    public void operar(){
        this.mascotasApta.forEach(mascota -> {
            if(mascota instanceof operable && mascota.isEsterilizado()){
                mascota.operar();
            }
        });

    }

}
