/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.Investigadores;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.GestionInvestigadores;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultaInvestigadores extends Conexion {

    //Variables
    GestionInvestigadores formularioGestion;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaInvestigadores(GestionInvestigadores formularioGestion) {
        this.formularioGestion = formularioGestion;
    }

    //Método ingresar abeja
    public boolean ingresar(Investigador inves) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into RegistroCalidad values(?,?,?,?,?)";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, inves.getIdEmpleado());
            ps.setInt(2, inves.getIdProducto());
            ps.setDate(3, java.sql.Date.valueOf(inves.getFechaRegistroC()));
            ps.setDouble(4, inves.getPuntacionRegistroC());
            ps.setString(5, inves.getAprovacionRegistroC());

            ps.execute();
            return true;

        } catch (SQLException e) {

            System.err.println("Error: " + e);
            return false;

        } catch (Exception e) {
            System.err.println("Error: " + e.getLocalizedMessage());
            return false;
        } finally {
            try {

                con.close();

            } catch (Exception e) {

                System.err.println("Error: " + e);

            }
        }
    }

    public void consulta(String consulta, String campo) {

        String where = "";

        if (consulta.equals("General")) {

            where = "";

        } else if (consulta.equals("Por ID")) {
            where = "where IdRegistroC = " + Integer.parseInt(campo);

        }

        limpiarTabla();
        formularioGestion.tblConsulta.setModel(modelo);

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select * from RegistroCalidad "+where;

        modelo.addColumn("Id");
        modelo.addColumn("Id Empleado");
        modelo.addColumn("Id Producto");
        modelo.addColumn("Fecha");
        modelo.addColumn("Puntuación");
        modelo.addColumn("Aprovación");

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
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

    public boolean Actualizar(Investigador inves) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update RegistroCalidad set IdProducto=?, FechaRegistroC=?, PuntacionRegistroC=?, AprovacionRegistroC=?" + " where IdEmpleado=?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);

            
            ps.setInt(1, inves.getIdProducto());
            ps.setDate(2, java.sql.Date.valueOf(inves.getFechaRegistroC()));
            ps.setDouble(3, inves.getPuntacionRegistroC());
            ps.setString(4, inves.getAprovacionRegistroC());
            
            ps.setInt(5, inves.getIdEmpleado());

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

    public boolean Borrado(Investigador inves) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "delete from RegistroCalidad where IdRegistroC = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, inves.getIdRegistroC());
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
    
      //Método cargar id abejas
    public int cargarIdEmpleado(String UserLogin) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select IdEmpleado from Empleado where UsuarioEmpleado = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, UserLogin);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("IdEmpleado");
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
            return 0;
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
