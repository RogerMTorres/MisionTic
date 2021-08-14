package com.reto5;

import com.reto5.view.VistaRequerimientosReto4;

import java.awt.EventQueue;


public class App {
    public static void main( String[] args )
    {   
        EventQueue.invokeLater(new Runnable(){
           
            @Override
            public void run () {
                try {
                    VistaRequerimientosReto4 frame = new VistaRequerimientosReto4();
                    frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    
    }
}
