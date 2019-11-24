/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.user;

import com.campocolombia.modelo.Conexion;
import com.campocolombia.vista.Login;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 *
 * @author Jonattan
 */
public class ConsultaUsuario extends Conexion {
    
    //Variables
    Login formularioLogin;
    

    //Método constructor
    public ConsultaUsuario(Login formularioLogin) {
        this.formularioLogin = formularioLogin;
    }
    
    //Método consultar usuario
    public boolean consultaUsuario(Usuario usuario) {

        setUsuarioLogin(usuario.getTipo());

        if ("Apicultor".equals(getUsuarioLogin())) {
            setPasswordLogin("Apicultor123");
        } else {
            if ("Gerente".equals(getUsuarioLogin())) {
                setPasswordLogin("Gerente123");
            } else {
                if ("Investigador".equals(getUsuarioLogin())) {
                    setPasswordLogin("Investigador123");
                } else {
                    setPasswordLogin("0");
                }
            }
        }

        Connection con = getConexion();

        try {

            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call consultarEmpleado(?,?,?,?)}");
            Sentencia.setString(1, usuario.getUsuario());
            Sentencia.setString(2, usuario.getPassword());
            Sentencia.setString(3, usuario.getTipo());
            Sentencia.registerOutParameter(4, java.sql.Types.BOOLEAN);
            Sentencia.execute();
            return Sentencia.getBoolean(4) == true;

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
}
