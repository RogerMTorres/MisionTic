package com.example.view;

import java.util.ArrayList;

import com.example.controller.Controlador;
import com.example.model.vo.Liderporsalario;
import com.example.model.vo.Proyectoportipo;
import com.example.model.vo.LideresporNombre;

public class VistaRequerimientosReto4 {
    
    public static final Controlador control = new Controlador ();
    
    public static void requerimiento1 (){
        System.out.println("*** Lideres por salario ***");

        try {
            ArrayList<Liderporsalario> lista = control.Requerimiento_1();
            for (Liderporsalario lider : lista) {
                System.out.printf("El Lider %s %s con Id %d Tiene un salario de %d %n", 
                lider.getNombre(),
                lider.getApellido(),
                lider.getId_lider(),
                lider.getSalario()
                );
            }
        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        } 
    }

    public static void requerimiento2 (){
        
        System.out.println("*** Proyectos por Tipo ***");

        try {
            ArrayList<Proyectoportipo> listap = control.Requerimiento_2();
            for (Proyectoportipo proyecto : listap) {
                System.out.printf("El proyecto de ID_Proyecto %d de la constructora: %s de la ciudad %s, tiene un estrato asignado de %d %n",
                proyecto.getId_proyecto(),
                proyecto.getConstructora(),
                proyecto.getCiudad(),
                proyecto.getEstrato()
                );
            }
        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        }
    }


    public static void requerimiento3 (){
        
        System.out.println("*** Lideres por Nombre ***"); 

        try {
            ArrayList<LideresporNombre> listaN = control.Requerimiento_3();
            for (LideresporNombre lideresporN : listaN) {
            System.out.printf("El Lider con Id %d se llama %s %s %n",
            lideresporN.getId_lider(),
            lideresporN.getNombre(),
            lideresporN.getApellido()
            );
            }
        
        }   catch (Exception e) {
        System.err.println("Se ha generado el siguiente" + e.getMessage());
    }
   } 
}
