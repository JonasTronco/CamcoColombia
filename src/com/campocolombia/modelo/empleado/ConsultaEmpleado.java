package com.campocolombia.modelo.empleado;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.GestionEmpleados;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.table.DefaultTableModel;

public class ConsultaEmpleado extends Conexion {

    //Variables
    GestionEmpleados formularioGestionEmpleado;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaEmpleado(GestionEmpleados formularioGestionEmpleado) {
        this.formularioGestionEmpleado = formularioGestionEmpleado;
    }

    //Método ingresar abeja
    public boolean ingresar(Empleado empleado) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into Empleado values(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getiIdEmpleado());
            ps.setString(2, empleado.getNombreEmpleado());
            ps.setString(3, empleado.getApellidoEmpleado());
            ps.setString(4, empleado.getDireccionEmpleado());

            ps.setDate(5, java.sql.Date.valueOf(empleado.getFechaNEmpleado()));
            ps.setInt(6, empleado.getEdadEmpleado());
            ps.setString(7, empleado.getTipoContratoEmpleado());
            ps.setDouble(8, empleado.getSueldoEmpleado());
            ps.setString(9, empleado.getUsuarioEmpleado());
            ps.setString(10, empleado.getContraseñaEmpleado());
            ps.setString(11, empleado.getTipoEmpleado());

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

    public void consultaEmpleado(String consulta, String campo) {

        String where = "";

        if (consulta.equals("General")) {

            where = "where TipoEmpleado = " + campo;

        } else if (consulta.equals("Por ID")) {
            where = "where IdEmpleado = " + Integer.parseInt(campo);

        }

        limpiarTabla();
        formularioGestionEmpleado.tblConsulta.setModel(modelo);

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select * from Empleado ";

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Edad");
        modelo.addColumn("Contrato");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Usuario");
        modelo.addColumn("Cargo");

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

    public boolean Actualizar(Empleado empleado) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Empleado set NombreEmpleado=?, ApellidoEmpleado=?, DireccionEmpleado=?, FechaNEmpleado=?, EdadEmpleado=?, TipoContratoEmpleado=? "
                + "SueldoEmpleado=?, UsuarioEmpleado=?, ContraseñaEmpleado=?, TipoEmpleado=?" + " where IdEmpleado=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, empleado.getNombreEmpleado());
            ps.setString(2, empleado.getApellidoEmpleado());
            ps.setString(3, empleado.getDireccionEmpleado());

            ps.setDate(4, java.sql.Date.valueOf(empleado.getFechaNEmpleado()));
            ps.setInt(5, empleado.getEdadEmpleado());
            ps.setString(6, empleado.getTipoContratoEmpleado());
            ps.setDouble(7, empleado.getSueldoEmpleado());
            ps.setString(8, empleado.getUsuarioEmpleado());
            ps.setString(9, empleado.getContraseñaEmpleado());
            ps.setString(10, empleado.getTipoEmpleado());

            ps.setInt(11, empleado.getiIdEmpleado());

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

    public boolean Borrado(Empleado empleado) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "delete from Empleado where IdEmpleado = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getiIdEmpleado());
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

    //Método limpiar tabla
    public void limpiarTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }

        modelo.setColumnCount(0);
    }

}
