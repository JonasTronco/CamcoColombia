/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionabejas;

import com.campocolombia.modelo.Conexion;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Jonattan
 */
public class ConsultaColmena extends Conexion{
    
    public boolean registrar(Colmena Col) {
        
        PreparedStatement ps = null;
        Connection con =  getConexion();        
        String SQL = "call registrarColmena(?,?,?,?)";
        
        try {
            ps = con.prepareStatement(SQL);
            //ps.setString(1, Col.getAbejas_IdAbejas());
        } catch (Exception e) {
        }
        return false;
    
    }
}
