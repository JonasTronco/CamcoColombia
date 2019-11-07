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
public class Conexcion {
    private final String nombreBaseDatos = "CampoColombia";
    private String userLogin;
    private String password;
    private final String URL = "jdbc:mysql://localhost:3306/"+ nombreBaseDatos;
    private Connection Connec = null;

    public Conexcion(String userLogin, String password) {
        this.userLogin = userLogin;
        this.password = password;
    }
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connec = (Connection) DriverManager.getConnection(this.URL, this.userLogin, this.password);
        } catch (SQLException e) {
            System.err.println("Conexción Fallida" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Connec;
    }
}
