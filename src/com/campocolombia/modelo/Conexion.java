/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonattan
 */
public class Conexion {

    //Variables
    private final String nombreBaseDatos = "CampoColombia";
    private String usuarioLogin;
    private String passwordLogin;
    private final String URL = "jdbc:mysql://localhost:3306/" + nombreBaseDatos + "?noAccessToProcedureBodies=true";
    private Connection Connec = null;

    //Método conexion
    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connec = (Connection) DriverManager.getConnection(this.URL, this.usuarioLogin, this.passwordLogin);

        } catch (SQLException e) {

            System.err.println("Conexción Fallida" + e);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Connec;
    }

    //Métodos getters & setters del usuario login
    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
}