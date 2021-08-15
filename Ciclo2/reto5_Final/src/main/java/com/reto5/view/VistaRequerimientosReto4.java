package com.reto5.view;

import java.util.ArrayList;

import com.reto5.controller.Controlador;
import com.reto5.model.vo.Liderporsalario;
import com.reto5.model.vo.Proyectoportipo;
import com.reto5.model.vo.LideresporNombre;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class VistaRequerimientosReto4 extends JFrame{
    
    public static final Controlador control = new Controlador ();

    private JPanel panelcontenido;
    private static JTextArea areaDeTexto;

    public VistaRequerimientosReto4 (){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,200,800,700); //450,200,800,600
        panelcontenido = new JPanel();
        
        /*Para el color del fondo lo puede hacer asi con el codigo del color especifico.
        panelcontenido.setBackground(Color.decode("#32CD32"));
        
        O lo puede hacer con los colores predefinidos en Java.
        panelcontenido.setBackground(Color.black); 
        */
        panelcontenido.setBackground(Color.GRAY);
        setContentPane(panelcontenido);
        panelcontenido.setLayout(null);

        //etiqueta
        JLabel etiqueta = new JLabel("*** Reto 5 ***");
        etiqueta.setBounds(200,20,400,50);
        etiqueta.setFont(new Font("Algerian", Font.BOLD + Font.ITALIC, 48));
        etiqueta.setForeground(Color.decode("#B40D23"));
        panelcontenido.add(etiqueta);
        //#3E22AF
        //etiqueta autor
        JLabel autor = new JLabel("Autor: Roger Torres");
        autor.setBounds(800,60,600,400);
        autor.setFont(new Font("Bahnschrift Light SemiCondensed", Font.BOLD + Font.ITALIC, 26));
        autor.setForeground(Color.decode("#3E22AF"));
        panelcontenido.add(autor);

        //etiqueta grupo 
        JLabel grupo = new JLabel("Grupo: 69");
        grupo.setBounds(800,90,600,400);
        grupo.setFont(new Font("Bahnschrift Light SemiCondensed", Font.BOLD + Font.ITALIC, 26));
        grupo.setForeground(Color.decode("#3E22AF"));
        panelcontenido.add(grupo);

        //etiqueta utp 
        JLabel utp = new JLabel("MisionTic2022 UTP");
        utp.setBounds(800,120,600,400);
        utp.setFont(new Font("Bahnschrift Light SemiCondensed", Font.BOLD + Font.ITALIC, 26));
        utp.setForeground(Color.decode("#3E22AF"));
        panelcontenido.add(utp);
       
        //barra de desplazamiento
        JScrollPane barra = new JScrollPane();
        barra.setBounds(30, 70, 740, 460);
        panelcontenido.add(barra);

        //area de texto 
        areaDeTexto = new JTextArea();
        barra.setViewportView(areaDeTexto);

        // Imagene decorativa 1
        JLabel imagen1 = new JLabel(new ImageIcon("misiontic.png"));
        imagen1.setBounds(800, 20, 400, 200);
        panelcontenido.add(imagen1);
        
        // Imagene decorativa 2
        JLabel imagen2 = new JLabel(new ImageIcon("Selfie.jpg"));
        imagen2.setBounds(800, 400, 400, 200);
        panelcontenido.add(imagen2);

        //Para el area de texto es lo mismo que el del panel de contenido

        //boton consulta 1
        JButton btnConsulta1 = new JButton ("Consulta 1");
        //Agrega el icono base al boton
        btnConsulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta1_norm.png")));
        //Le quita los bordes al boton
        btnConsulta1.setBorder(null);
        //Coloca transparentes los bordes
        btnConsulta1.setBorderPainted(false);
        //Se le quia el relleno del boton
        btnConsulta1.setContentAreaFilled(false);
        //Se coloca en false esto para que no aparezca el boton precionado apenas iniciar
        btnConsulta1.setFocusPainted(false);
        //Agrega el icono cuando se preciona el boton.
        btnConsulta1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta1_press.png"))); // presionar
        //Agrega el icono cuando pasa el mouse sobre el icono.
        btnConsulta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta1_roll.png"))); // roll
        btnConsulta1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed (ActionEvent e){
                requerimiento1();
            }
        });

        btnConsulta1.setBounds(30, 550, 120, 50);
        panelcontenido.add(btnConsulta1);

        //boton limpiar 
        JButton btnLimpiar = new JButton ();
        //Agrega el icono base al boton
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/limpiar_norm.png")));
        //Le quita los bordes al boton
        btnLimpiar.setBorder(null);
        //Coloca transparentes los bordes
        btnLimpiar.setBorderPainted(false);
        //Se le quia el relleno del boton
        btnLimpiar.setContentAreaFilled(false);
        //Se coloca en false esto para que no aparezca el boton precionado apenas iniciar
        btnLimpiar.setFocusPainted(false);
        //Agrega el icono cuando se preciona el boton.
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/limpiar_press.png"))); // NOI18N
        //Agrega el icono cuando pasa el mouse sobre el icono.
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/limpiar_roll.png"))); // NOI18N
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
        //Agrega el icono base al boton
        btnConsulta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta2_norm.png")));
        //Le quita los bordes al boton
        btnConsulta2.setBorder(null);
        //Coloca transparentes los bordes
        btnConsulta2.setBorderPainted(false);
        //Se le quia el relleno del boton
        btnConsulta2.setContentAreaFilled(false);
        //Se coloca en false esto para que no aparezca el boton precionado apenas iniciar
        btnConsulta2.setFocusPainted(false);
        //Agrega el icono cuando se preciona el boton.
        btnConsulta2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta2_press.png"))); // NOI18N
        //Agrega el icono cuando pasa el mouse sobre el icono.
        btnConsulta2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta2_roll.png"))); // NOI18N
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
        //Agrega el icono base al boton
        btnConsulta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta3_norm.png")));
        //Le quita los bordes al boton
        btnConsulta3.setBorder(null);
        //Coloca transparentes los bordes
        btnConsulta3.setBorderPainted(false);
        //Se le quia el relleno del boton
        btnConsulta3.setContentAreaFilled(false);
        //Se coloca en false esto para que no aparezca el boton precionado apenas iniciar
        btnConsulta3.setFocusPainted(false);
        //Agrega el icono cuando se preciona el boton.
        btnConsulta3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta3_press.png"))); // NOI18N
        //Agrega el icono cuando pasa el mouse sobre el icono.
        btnConsulta3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("Icono/consulta3_roll.png"))); // NOI18N
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

            String salida = "*** Lider Por Salario *** \n\nNombre\tPrimer Apellido\t\tID del Lider\tSalario\n\n";/////////////

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
                
                if(proyecto.getConstructora().equals("Pegaso")) {
                	salida += proyecto.getConstructora();
                    salida += "\t"+"\t";
                }else {
                	salida += proyecto.getConstructora();
                    salida += "\t";
                }
                
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
