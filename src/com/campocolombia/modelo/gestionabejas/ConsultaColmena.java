
package com.campocolombia.modelo.gestionabejas;

import com.campocolombia.modelo.Conexion;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultaColmena extends Conexion {

    public boolean registrar(Colmena Col) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call registrarColmena(?,?,?)}");
            Sentencia.setInt(1, Col.getAbejas_IdAbejas());
            Sentencia.setInt(2, Col.getCantidadColmena());
            Sentencia.setString(3, Col.getObservacionesColmena());
            Sentencia.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

    public boolean modificar(Colmena Col) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call modificarColmena(?,?,?,?)}");
            Sentencia.setInt(1, Col.getIdColmena());
            Sentencia.setInt(2, Col.getAbejas_IdAbejas());
            Sentencia.setInt(3, Col.getCantidadColmena());
            Sentencia.setString(4, Col.getObservacionesColmena());

            Sentencia.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

    public boolean borrado(Colmena Col) {

        try {

            Connection con = getConexion();

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call eliminarColmena(?)}");
            Sentencia.setInt(1, Col.getIdColmena());
            Sentencia.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }

    }
}
