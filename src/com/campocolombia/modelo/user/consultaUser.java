/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.user;

import com.campocolombia.modelo.Conexcion;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jonattan
 */
public class consultaUser extends Conexcion {

    public boolean consultaUser(User User) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet ResultadoProcedure = null;
        
        String SQL = "call consultarEmpleado(?,?)"; // Se requiere una consulta a tabla empleado 
        
         try {
             
            ps = con.prepareStatement(SQL);
            ps.setString(1, User.getNick());
            ps.setString(2, User.getPassword());
            ResultadoProcedure = ps.executeQuery();
            
             
            
        } catch (Exception e) {
        }
        return false;

    }

}
