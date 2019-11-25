package com.campocolombia.modelo.gestionMantenimiento;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.GestionMantenimiento;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultaMantenimiento extends Conexion {

    //Variables
    GestionMantenimiento formularioGestion;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaMantenimiento(GestionMantenimiento formularioGestion) {
        this.formularioGestion = formularioGestion;
    }

    //Método ingresar abeja
    public boolean ingresar(Mantenimiento mante, String IdEmpleado) {


        Connection con = getConexion();

        //String sql = "insert into Mantenimiento(TipoMantenimiento,DescripcionMantenimiento) values(?,?)";
        try {

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call ingresarMantenimiento(?,?,?,?,?)}");

            Sentencia.setInt(1, Integer.parseInt(IdEmpleado));
            Sentencia.setInt(2, mante.getIdcolmena());
            Sentencia.setString(3, mante.getTipoMantenimiento());
            Sentencia.setString(4, mante.getDescripcionMantenimiento());
            Sentencia.setDate(5, java.sql.Date.valueOf(mante.getFecha()));
            Sentencia.execute();
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

        String sql = "Select IdMantenimiento, IdColmena, TipoMantenimiento, DescripcionMantenimiento from Mantenimiento as Man"
                + " join AsignacionMantenimientoColmena as AsigMCol on Man.IdMantenimiento = AsigMCol.IdMantenimiento"
                + " where FechaMantenimientoC =?";

        modelo.addColumn("Id");
        modelo.addColumn("Colmena");
        modelo.addColumn("TipoMantenimiento");
        modelo.addColumn("DescripcionMantenimiento");

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

    public boolean Actualizar(Mantenimiento mante) {

     
        Connection con = getConexion();

       

        try {

           CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call ActualizarMantenimiento(?,?,?,?,?)}");

            Sentencia.setInt(1, mante.getIdMantenimiento());
            Sentencia.setInt(2, mante.getIdcolmena());
            Sentencia.setString(3, mante.getTipoMantenimiento());
            Sentencia.setString(4, mante.getDescripcionMantenimiento());
            Sentencia.setDate(5, java.sql.Date.valueOf(mante.getFecha()));
            Sentencia.execute();
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

    public boolean Borrado(Mantenimiento mante) {

       
        Connection con = getConexion();

       

        try {

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call borradoMantenimiento(?)}");

            Sentencia.setInt(1, mante.getIdMantenimiento());
            Sentencia.execute();
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
