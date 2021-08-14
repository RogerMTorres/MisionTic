package com.reto5.view;

import java.util.ArrayList;

import com.reto5.controller.Controlador;
import com.reto5.model.vo.Liderporsalario;
import com.reto5.model.vo.Proyectoportipo;
import com.reto5.model.vo.LideresporNombre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaRequerimientosReto4 extends JFrame{
    
    public static final Controlador control = new Controlador ();

    private JPanel panelcontenido;
    private static JTextArea areaDeTexto;

    public VistaRequerimientosReto4 (){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,200,800,600);
        panelcontenido = new JPanel();
        setContentPane(panelcontenido);
        panelcontenido.setLayout(null);

        //etiqueta
        JLabel etiqueta = new JLabel("*** Reto 5 ***");
        etiqueta.setBounds(300,20,100,40);
        panelcontenido.add(etiqueta);

        //barra de desplazamiento
        JScrollPane barra = new JScrollPane();
        barra.setBounds(30, 70, 740, 460);
        panelcontenido.add(barra);

        //area de texto 
        areaDeTexto = new JTextArea();
        barra.setViewportView(areaDeTexto);

        //boton consulta 1
        JButton btnConsulta1 = new JButton ("Consulta 1");
        btnConsulta1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed (ActionEvent e){
                requerimiento1();
            }
        });

        btnConsulta1.setBounds(30, 550, 120, 50);
        panelcontenido.add(btnConsulta1);

        //boton limpiar 
        JButton btnLimpiar = new JButton ("Limpiar area de texto");
        btnLimpiar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed (ActionEvent e){
                areaDeTexto.setText("");
            }
        });

        btnLimpiar.setBounds(610, 550, 160, 50);
        panelcontenido.add(btnLimpiar);

         //boton consulta 2
         JButton btnConsulta2 = new JButton ("Consulta 2");
         btnConsulta2.addActionListener(new ActionListener(){
 
             @Override
             public void actionPerformed (ActionEvent e){
                 requerimiento2();
             }
         });
 
         btnConsulta2.setBounds(200, 550, 120, 50);
         panelcontenido.add(btnConsulta2);
 
          //boton consulta 3
          JButton btnConsulta3 = new JButton ("Consulta 3");
          btnConsulta3.addActionListener(new ActionListener(){
  
              @Override
              public void actionPerformed (ActionEvent e){
                  requerimiento3();
              }
          });
  
          btnConsulta3.setBounds(370, 550, 120, 50);
          panelcontenido.add(btnConsulta3);

    }
    
    public static void requerimiento1 (){

        try {
            ArrayList<Liderporsalario> lista = control.Requerimiento_1();

            String salida = "*** Lider Por Salario *** \n\nNombre\tPrimer Apellido\tID del Lider\tSalario\n\n";

            for (Liderporsalario lider : lista) {
            
               salida += lider.getNombre();
               salida += "\t";
               salida += lider.getApellido();
               salida += "\t";
               salida += "\t";
               salida += lider.getId_lider();
               salida += "\t";
               salida += lider.getSalario();
               salida += "\n";

            }
            
            areaDeTexto.setText(salida);

        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        } 
    }

    public static void requerimiento2 (){

        try {
            
            ArrayList<Proyectoportipo> listap = control.Requerimiento_2();

            String salida ="*** Proyectos por Tipo *** \n\nId_Proyecto\tConstructora\t\tCiudad\t\tEstrato\n\n";

            for (Proyectoportipo proyecto : listap) {
                
                salida += proyecto.getId_proyecto();
                salida += "\t";
                salida += proyecto.getConstructora();
                salida += "\t";
                salida += proyecto.getCiudad();
                salida += "\t\t";
                salida += proyecto.getEstrato();
                salida += "\n";
                
            }

            areaDeTexto.setText(salida);

        } catch (Exception e) {
            System.err.println("Se ha generado el siguiente" + e.getMessage());
        }
    }


    public static void requerimiento3 (){

        try {
            ArrayList<LideresporNombre> listaN = control.Requerimiento_3();

            String salida ="*** Lideres por Nombre ***\n\nID_Lider\tNombre\tPrimer_Apellido\n\n";

            for (LideresporNombre lideresporN : listaN) {
            
            salida +=lideresporN.getId_lider();
            salida += "\t";
            salida +=lideresporN.getNombre();
            salida +="\t";
            salida +=lideresporN.getApellido();
            salida +="\n";
           
            }
            
            areaDeTexto.setText(salida);
        }   catch (Exception e) {
        System.err.println("Se ha generado el siguiente" + e.getMessage());
    }
   } 
}
