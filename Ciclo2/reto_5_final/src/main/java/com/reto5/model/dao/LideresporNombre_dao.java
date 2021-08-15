package com.reto5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.reto5.model.vo.LideresporNombre;
import com.reto5.util.Conexionjdbc;

public class LideresporNombre_dao {
    
    public ArrayList<LideresporNombre> requerimiento3 () throws SQLException {

        ArrayList<LideresporNombre> respuesta = new ArrayList<LideresporNombre>();
        Connection conect = Conexionjdbc.getConnection();

        try {
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido "+ 
                              "from Lider l "+
                              "where Primer_Apellido LIKE '%z' "+
                              "ORDER BY Nombre ASC ";

            PreparedStatement statement = conect.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                LideresporNombre lideres = new LideresporNombre();

                lideres.setNombre(resultado.getString("Nombre"));
                lideres.setId_lider(resultado.getInt("ID_Lider"));
                lideres.setApellido(resultado.getString("Primer_Apellido"));

                respuesta.add(lideres);
                
            }
            resultado.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Se ha generado el siguiente error: " + e);
        } finally {
            if (conect != null) {
                conect.close();
            }
        }
        return respuesta;
    }
}
