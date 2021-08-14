package com.example.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.model.dao.Liderporsalario_dao;
import com.example.model.vo.Liderporsalario;
import com.example.model.dao.Proyectoportipo_dao;
import com.example.model.vo.Proyectoportipo;
import com.example.model.dao.LideresporNombre_dao;
import com.example.model.vo.LideresporNombre;
public class Controlador {
   
    private final Liderporsalario_dao _lidersalario; 
    private final Proyectoportipo_dao _proyectotipo;
    private final LideresporNombre_dao _lideresnombre;


    public Controlador() {
        _lidersalario = new Liderporsalario_dao();
        _proyectotipo = new Proyectoportipo_dao();
        _lideresnombre = new LideresporNombre_dao();
    }

    public ArrayList<Liderporsalario> Requerimiento_1 () throws SQLException {
        return _lidersalario.requerimiento1();
    }

    public ArrayList <Proyectoportipo> Requerimiento_2 () throws SQLException {
        return _proyectotipo.requermiento2();
    }    
    public ArrayList <LideresporNombre> Requerimiento_3 () throws SQLException {
        return _lideresnombre.requerimiento3();
    }
}
