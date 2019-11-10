/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.user;

import com.campocolombia.modelo.Conexcion;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jonattan
 */
public class consultaUser extends Conexcion {

    public boolean consultaUser(User User) {

        try {
            System.out.println(User.getRol());
            
            Connection con = getConexion();
            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call consultaUser(?,?,?)}");
            
            
            
            
            Sentencia.setString(1, User.getNick());
            Sentencia.setString(2, User.getRol());
            Sentencia.setString(3, User.getPassword());

            ResultSet result = Sentencia.executeQuery();

            if (result.next()) {
                return result.getBoolean(1);
            } else {
                return false;

            }

        } catch (Exception e) {
            System.err.println(e + " consulta");
            return false;
        }

    }

}
