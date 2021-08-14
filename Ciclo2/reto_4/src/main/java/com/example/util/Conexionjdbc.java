package com.example.util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionjdbc {
    
    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection()throws SQLException{
            String url = "jdbc:sqlite:" + UBICACION_BD;
            return DriverManager.getConnection(url);
    }
    
    public static boolean estaVacia(){
        File archivo = new File (Conexionjdbc.UBICACION_BD);
        return archivo.length()==0;
    }
}
