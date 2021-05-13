package desafio2.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }


    public  void listarDirectos(){
        this.empleados.forEach(directos->{
            if(directos instanceof Directo){
                JOptionPane.showMessageDialog(null,directos.getNombre()+ " Es Directo ");

            }
        });


    }
    public  void listarFreelacers(){
        this.empleados.forEach(Freelace->{
            if(Freelace instanceof Freelance){
                JOptionPane.showMessageDialog(null,Freelace.getNombre()+ " Es Freelace ");


            }
        });


    }
     public void  listarPromotores(){
        this.empleados.forEach(promotores->{
            if(promotores instanceof Promotor){
                JOptionPane.showMessageDialog(null,promotores.getNombre()+ " Es Promotor ");

            }
        });


    }
    public void  calcularNomina(){
        this.empleados.forEach(empleado -> {
            JOptionPane.showMessageDialog(null,"El pago de "+empleado.getNombre() + " Este mes es de:  "+ empleado.calcularSalario());

        });

    }


}
