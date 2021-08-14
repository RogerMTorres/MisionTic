package com.example.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.model.vo.Liderporsalario;
import com.example.util.Conexionjdbc;

public class Liderporsalario_dao {

    public ArrayList<Liderporsalario> requerimiento1 () throws SQLException {

    ArrayList<Liderporsalario> respuesta = new ArrayList<Liderporsalario>();
    Connection conect = Conexionjdbc.getConnection();

    try {
        String consulta ="SELECT id_Lider, Nombre, Primer_Apellido, salario " + 
                         "FROM Lider WHERE salario <= 500000 ORDER BY salario ";

        PreparedStatement statement = conect.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();
        
        while (resultado.next()) {
            
            Liderporsalario salario = new Liderporsalario();

            salario.setNombre(resultado.getString("Nombre"));
            salario.setId_lider(resultado.getInt("id_Lider"));
            salario.setSalario(resultado.getInt("salario"));
            salario.setApellido(resultado.getString("Primer_Apellido"));

            respuesta.add(salario);

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
