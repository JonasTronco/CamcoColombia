package com.campocolombia.modelo.Clima;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.GestionClima;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultaClima extends Conexion {

    //Variables
    GestionClima formularioGestion;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaClima(GestionClima formularioGestion) {
        this.formularioGestion = formularioGestion;
    }

    //Método ingresar abeja
    public boolean ingresar(Clima clima) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into Climatologia(TemperaturaClima,HumedadClima,PrecipitacionClima,FechaClima,IdEmpleado) values(?,?,?,?,?)";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setDouble(1, clima.getTemperaturaClima());
            ps.setDouble(2, clima.getHumedadClima());
            ps.setDouble(3, clima.getPrecipitacionClima());

            ps.setDate(4, java.sql.Date.valueOf(clima.getFechaClima()));
            ps.setInt(5, clima.getIdEmpleado());

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

    public void consulta(String consulta) {

        limpiarTabla();
        formularioGestion.tblConsulta.setModel(modelo);

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Select * from Empleado where =?";

        modelo.addColumn("Id");
        modelo.addColumn("Temperatura");
        modelo.addColumn("Humedad");
        modelo.addColumn("Precipitación");
        modelo.addColumn("Fecha");
        modelo.addColumn("Edad");
        modelo.addColumn("IdEmpleado");

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(consulta));
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

    public boolean Actualizar(Clima clima) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Climatologia set TemperaturaClima=?, HumedadClima=?, PrecipitacionClima=?, FechaClima=?" + " where IdClima=?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setDouble(1, clima.getTemperaturaClima());
            ps.setDouble(2, clima.getHumedadClima());
            ps.setDouble(3, clima.getPrecipitacionClima());

            ps.setDate(4, java.sql.Date.valueOf(clima.getFechaClima()));
            ps.setInt(5, clima.getIdClima());

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

    public boolean Borrado(Clima clima) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "delete from Climatologia where IdClima = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, clima.getIdClima());
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
