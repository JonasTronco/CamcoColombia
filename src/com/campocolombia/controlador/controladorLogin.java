/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.user.User;
import com.campocolombia.modelo.user.consultaUser;
import com.campocolombia.vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jonattan
 */
public abstract class controladorLogin implements ActionListener{
    
    private User User;
    private consultaUser consultaUser;
    private login frmLogin;

    public controladorLogin(User User, consultaUser consultaUser, login login) {
        this.User = User;
        this.consultaUser = consultaUser;
        this.frmLogin = login;       
        this.frmLogin.botonIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed( ActionEvent e){
        
        if (e.getSource() == frmLogin.botonIngresar) {
            User.setNick(frmLogin.textUserName.getText());
            User.setPassword(frmLogin.textUserPassword.getText());
            User.setRol(frmLogin.selectRol.getItemAt(0));
        }
        
    
    }
    
    
    
    
    
    
}
