package com.reto5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.reto5.model.vo.Proyectoportipo;
import com.reto5.util.Conexionjdbc;

public class Proyectoportipo_dao {
    
    public ArrayList<Proyectoportipo> requermiento2 () throws SQLException {

        ArrayList<Proyectoportipo> respuesta = new ArrayList<Proyectoportipo>();
        Connection conect = Conexionjdbc.getConnection();

        try {
            String consulta = "SELECT ID_Proyecto , Constructora , Ciudad, t.Estrato "+
                              "FROM Proyecto p  join Tipo t ON p.ID_Tipo = t.ID_Tipo "+
                              "where p.Ciudad LIKE 'Cartagena' "+
                              "ORDER BY t.Estrato ASC ";

            PreparedStatement statement = conect.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                
                Proyectoportipo proyecto = new Proyectoportipo();

                proyecto.setId_proyecto(resultado.getInt("ID_Proyecto"));
                proyecto.setConstructora(resultado.getString("Constructora"));
                proyecto.setCiudad(resultado.getString("Ciudad"));
                proyecto.setEstrato(resultado.getInt("Estrato"));
               
                respuesta.add(proyecto);
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
