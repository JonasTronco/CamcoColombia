/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.user.User;
import com.campocolombia.modelo.user.consultaUser;
import com.campocolombia.vista.login;
import com.campocolombia.vista.principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonattan
 */
public  class controladorLogin implements ActionListener{
    
    private User User;
    private consultaUser consultaUser;
    private login frmLogin;
    private principal frmPrincipal;

    public controladorLogin(User User, consultaUser consultaUser, login login, principal principal) {
        this.User = User;
        this.consultaUser = consultaUser;
        this.frmLogin = login;    
        this.frmPrincipal = principal;
        this.frmLogin.botonIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed( ActionEvent e){
        
        if (e.getSource() == frmLogin.botonIngresar) {
            User.setNick(frmLogin.textUserName.getText());
            User.setPassword(frmLogin.textUserPassword.getText());
            User.setRol(frmLogin.selectRol.getSelectedItem().toString());
            
            
            
            
            try {
                
                if (consultaUser.consultaUser(User)) {
                frmPrincipal.setVisible(true);
                frmLogin.setVisible(false);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no son correctos");
                limpiar();
            }
                
            } catch (Exception w) {
                System.err.println(w + " Login" );
            }
            
        }
        
    
    }
    
    public void limpiar(){
        
        //frmLogin.textUserName.setText(null);
        frmLogin.textUserPassword.setText(null);
        
    }
    
      
    
    
    
}
