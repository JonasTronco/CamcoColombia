/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.user.Usuario;
import com.campocolombia.modelo.user.ConsultaUsuario;
import com.campocolombia.vista.Login;
import com.campocolombia.vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonattan
 */
public class ControladorLogin implements ActionListener {

    //Variables
    private Usuario usuario;
    private ConsultaUsuario consultaUsuario;
    private Login frmLogin;
    private Principal frmPrincipal;

    public ControladorLogin(Usuario User, ConsultaUsuario consultaUser, Login login, Principal principal) {
        this.usuario = User;
        this.consultaUsuario = consultaUser;
        this.frmLogin = login;
        this.frmPrincipal = principal;
        this.frmLogin.botonIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmLogin.botonIngresar) {
            usuario.setUsuario(frmLogin.textUserName.getText());
            usuario.setPassword(frmLogin.textUserPassword.getText());
            usuario.setTipo(frmLogin.selectRol.getSelectedItem().toString());

            try {

                if (consultaUsuario.consultaUsuario(usuario)) {
                    
                    frmPrincipal.setVisible(true);
                    frmLogin.setVisible(false);
                    limpiar();
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Los datos no son correctos");
                    limpiar();
                    
                }

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error: " + w);
            }

        }

    }

    public void limpiar() {
        
        frmLogin.textUserPassword.setText(null);
        
    }

}
