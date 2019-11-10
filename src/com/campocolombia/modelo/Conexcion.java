/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo;

import com.campocolombia.modelo.user.User;
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
    private final String URL = "jdbc:mysql://localhost:3306/" + nombreBaseDatos ;    
    private Connection Connec = null;
    private User User;

    //private final User[] ArrayUser = {new User("Apicultor", "12345"), new User("Gerente", "123"), new User("Investigador", "56789")};

   

    public Connection getConexion( ) {
        
      
        
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
    
     public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
