/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionabejas;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.GestionAbeja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author NIKOFERO
 */
public class ConsultaAbeja extends Conexion {

    //Variables
    GestionAbeja formularioGestionAbeja;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaAbeja(GestionAbeja formularioGestionAbeja) {
        this.formularioGestionAbeja = formularioGestionAbeja;
    }

    //Método ingresar abeja
    public boolean ingresarAbeja(Abeja abeja) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into Abeja (NombreAbeja, RazaAbeja, PesoAbeja, AltoAbeja, AnchoAbeja, ColorAbeja) values(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, abeja.getNombreAbejas());
            ps.setString(2, abeja.getRazaAbejas());
            ps.setDouble(3, abeja.getPesoAbejas());
            ps.setDouble(4, abeja.getAltoAbejas());
            ps.setDouble(5, abeja.getAncho());
            ps.setString(6, abeja.getColorAbejas());
            ps.execute();
            return true;

        } catch (SQLException e) {

            System.err.println("Error: " + e);
            return false;

        } finally {
            try {

                con.close();

            } catch (SQLException e) {

                System.err.println("Error: " + e);

            }
        }
    }

    //Método actualizar abeja
    public boolean ActualizarAbeja(Abeja abeja) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Abeja set NombreAbeja=?, RazaAbeja=?, PesoAbeja=?, AltoAbeja=?, AnchoAbeja=?, ColorAbeja=? where IdAbeja=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, abeja.getNombreAbejas());
            ps.setString(2, abeja.getRazaAbejas());
            ps.setDouble(3, abeja.getPesoAbejas());
            ps.setDouble(4, abeja.getAltoAbejas());
            ps.setDouble(5, abeja.getAncho());
            ps.setString(6, abeja.getColorAbejas());
            ps.setInt(7, abeja.getIdAbejas());
            ps.execute();
            return true;

        } catch (SQLException e) {

            System.err.println("Error: " + e);
            return false;

        } finally {
            try {

                con.close();

            } catch (SQLException e) {

                System.err.println("Error: " + e);

            }
        }
    }

    //Método consulta general abeja
    public void consultaAbejas(String consulta, String campo) {

        String where = "";

        if (consulta.equals("General")) {

            where = "";

        } else {

            if (consulta.equals("Por id")) {
                where = "where IdAbeja = " + Integer.parseInt(campo);
            }
        }

        limpiarTabla();
        formularioGestionAbeja.tblConsulta.setModel(modelo);

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select * from Abeja " + where;

        modelo.addColumn("Identifiación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Raza");
        modelo.addColumn("Peso");
        modelo.addColumn("Altura");
        modelo.addColumn("Anchura");
        modelo.addColumn("Color");

        try {

            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }

        } catch (SQLException e) {

            System.err.println("Error: " + e);

        } finally {
            try {

                con.close();

            } catch (SQLException e) {

                System.err.println("Error: " + e);

            }
        }
    }

    //Método limpiar tabla
    public void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }

        modelo.setColumnCount(0);
    }
}