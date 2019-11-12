/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.user.ConsultaUsuario;
import com.campocolombia.modelo.user.Usuario;
import com.campocolombia.vista.GestionAbeja;
import com.campocolombia.vista.Login;
import com.campocolombia.vista.Principal;
import com.campocolombia.vista.GestionClima;
import com.campocolombia.vista.GestionMantenimiento;
import com.campocolombia.vista.GestionProduccion;
import com.campocolombia.vista.GestionUsuarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonattan
 */
public class ControladorPrincipal implements ActionListener {

    private ConsultaUsuario consultaUser;
    private Usuario User;
    private Principal frmPrincipal;
    private GestionUsuarios frmGestionUsuarios;
    private GestionClima frmGestionClima;
    private GestionMantenimiento frmGestionMantenimiento;
    private GestionProduccion frmProduccion;
    private GestionAbeja frmAbejas;
    private Login frmLogin;

    public ControladorPrincipal(ConsultaUsuario consultaUser, Usuario User, Principal frmPrincipal, GestionUsuarios frmGestionUsuarios, GestionClima frmGestionClima, GestionMantenimiento frmGestionMantenimiento, GestionProduccion frmProduccion, GestionAbeja frmAbejas, Login frmLogin) {
        this.consultaUser = consultaUser;
        this.User = User;
        this.frmPrincipal = frmPrincipal;
        this.frmGestionUsuarios = frmGestionUsuarios;
        this.frmGestionClima = frmGestionClima;
        this.frmGestionMantenimiento = frmGestionMantenimiento;
        this.frmProduccion = frmProduccion;
        this.frmAbejas = frmAbejas;
        this.frmLogin = frmLogin;
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {

        frmPrincipal.labNombreEmpleadoLogin.setText(User.getUsuario());
        frmPrincipal.labCargoLogin.setText(User.getTipo());

        if (e.getSource() == frmPrincipal.btmGestionAbejas) {
            frmAbejas.setVisible(true);
        }
        if (e.getSource() == frmPrincipal.btmProduccion) {
            frmProduccion.setVisible(true);
        }
        if (e.getSource() == frmPrincipal.btmMantenimiento) {
            frmGestionMantenimiento.setVisible(true);
        }
        if (e.getSource() == frmPrincipal.btmClima) {
            frmGestionClima.setVisible(true);
        }
        if (e.getSource() == frmPrincipal.btmGestionUser) {
            frmGestionUsuarios.setVisible(true);
        }

        //Boton SALIR
        if (e.getSource() == frmPrincipal.btmSalir) {
            //Salir, Cerrar todo pero dejar la principal
            frmPrincipal.setVisible(false);
            frmLogin.setVisible(true);
            User.setPassword("");
        }

    }

}
