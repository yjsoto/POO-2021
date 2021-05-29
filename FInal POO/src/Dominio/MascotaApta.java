package Dominio;

public class MascotaApta extends mascota implements operable {

    public MascotaApta(String nombre, String sexo, int edad, boolean esterilizado){
        super( nombre,  sexo,  edad,  esterilizado);

    }

    @Override
    public void operar() {

        super.setEsterilizado(true);

    }
}
