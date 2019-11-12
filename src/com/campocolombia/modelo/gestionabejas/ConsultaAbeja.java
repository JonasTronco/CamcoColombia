/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionabejas;

import com.campocolombia.modelo.Conexion;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 *
 * @author Jonattan
 */
public class ConsultaAbeja extends Conexion {

    public boolean registrar(Abeja Abe) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call registrarAbeja(?,?,?,?,?,?)}");
            Sentencia.setString(1, Abe.getNombreAbejas());
            Sentencia.setString(2, Abe.getRazaAbejas());
            Sentencia.setDouble(3, Abe.getPesoAbejas());
            Sentencia.setString(4, Abe.getColorAbejas());
            Sentencia.setDouble(5, Abe.getAltoAbejas());
            Sentencia.setDouble(6, Abe.getAncho());

            Sentencia.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

    public boolean modificar(Abeja Abe, int ID) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call registrarAbeja(?,?,?,?,?,?,?)}");

            Sentencia.setInt(1, ID);
            Sentencia.setString(2, Abe.getNombreAbejas());
            Sentencia.setString(3, Abe.getRazaAbejas());
            Sentencia.setDouble(4, Abe.getPesoAbejas());
            Sentencia.setString(5, Abe.getColorAbejas());
            Sentencia.setDouble(6, Abe.getAltoAbejas());
            Sentencia.setDouble(7, Abe.getAncho());

            Sentencia.execute();

            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

    public boolean borrado(Colmena Col, int ID) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call eliminarAbeja(?)}");
            Sentencia.setInt(1, ID);
            Sentencia.execute();

            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

}
