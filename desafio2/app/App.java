package desafio2.app;

import desafio2.dominio.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Empleado juan = new Directo("Juan",5360000);
        Empleado julian = new Vendedor("Julian",2450000,55510000);
        Empleado johanna=new Freelance("Jhoanna",76000,85);
        Empleado carolina = new Vendedor("Carolina",990000,62487000);
        Empleado pedro= new Promotor("Pedro",1500,250,48);
        Empleado david= new Directo("David",2895000);
        Empleado gustavo = new Freelance("Gustavo",52500,60);
        List<Empleado> empleado = new ArrayList<>(Arrays.asList(juan, julian, johanna,carolina,pedro,david,gustavo));
        Nomina nomina = new Nomina(empleado);

        boolean seguirEjecutando= true;

        while (seguirEjecutando){
            List <String> seleccionar = Arrays.asList("   Rango trabajadores   ", "   Liquidacion trabajadores   ");

            int seleccion= JOptionPane.showOptionDialog(null,"Bienvenid@ al pograma de tu empresa! \nQue quieres Conocer!","POO - Liquidaciones",0,JOptionPane.QUESTION_MESSAGE,null,seleccionar.toArray(),null);

            switch (seleccion) {
                case 0:{
                    List <String> seleccionar2 = Arrays.asList("   Mostrar Freelacers  ", "   Mostrar Promotores   "," Mostrar Directos ");
                    int seleccion2= JOptionPane.showOptionDialog(null,"\nQue quieres Ver!","POO - Liquidaciones",0,JOptionPane.QUESTION_MESSAGE,null,seleccionar2.toArray(),null);
                    switch (seleccion2){
                        case 0:{
                            nomina.listarFreelacers();
                            break;
                        }
                        case 1:{
                            nomina.listarPromotores();
                            break;
                        }
                        case 2:{
                            nomina.listarDirectos();
                            break;
                        }

                    }
                    break;
                }
                case 1:{

                    nomina.calcularNomina();
                    break;
                }
                case -1:{
                    seguirEjecutando=false;
                    break;

                }

            }

        }

    }

}
