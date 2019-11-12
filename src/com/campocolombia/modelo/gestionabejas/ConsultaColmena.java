/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionabejas;

import com.campocolombia.modelo.Conexion;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jonattan
 */
public class ConsultaColmena extends Conexion{
    
    public boolean registrar(Colmena Col) {
        
        try {
           
            Connection con = getConexion();
            
            CallableStatement Sentencia = (CallableStatement) con.prepareCall("{call consultaUser(?,?,?)}");
            
            

            ResultSet result = Sentencia.executeQuery();

            if (result.next()) {
                
                return result.getInt(1) == 1;
                
            } else {
                return false;

            }

        } catch (SQLException e) {
            System.err.println(e + " consulta");
            return false;
        }
    
    }
}
