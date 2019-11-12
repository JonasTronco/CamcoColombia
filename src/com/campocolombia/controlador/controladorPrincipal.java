/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.user.User;
import com.campocolombia.modelo.user.consultaUser;
import com.campocolombia.vista.gestionAbejas;
import com.campocolombia.vista.gestionClima;
import com.campocolombia.vista.gestionMantenimiento;
import com.campocolombia.vista.gestionProduccion;
import com.campocolombia.vista.gestionUsuarios;
import com.campocolombia.vista.login;
import com.campocolombia.vista.principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonattan
 */
public class controladorPrincipal implements ActionListener{

    private consultaUser consultaUser;
    private User User;
    private principal frmPrincipal;
    private gestionUsuarios frmGestionUsuarios;
    private gestionClima frmGestionClima;
    private gestionMantenimiento frmGestionMantenimiento;
    private gestionProduccion frmProduccion;
    private gestionAbejas frmAbejas;
     private login frmLogin;

    public controladorPrincipal(consultaUser consultaUser, User User, principal frmPrincipal, gestionUsuarios frmGestionUsuarios, gestionClima frmGestionClima, gestionMantenimiento frmGestionMantenimiento, gestionProduccion frmProduccion, gestionAbejas frmAbejas, login frmLogin) {
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
    public void actionPerformed( ActionEvent e){
        
        frmPrincipal.labNombreEmpleadoLogin.setText(User.getNick());
        frmPrincipal.labCargoLogin.setText(User.getRol());
        
        if (e.getSource() == frmPrincipal.btmGestionAbejas) frmAbejas.setVisible(true);
        if (e.getSource() == frmPrincipal.btmProduccion) frmProduccion.setVisible(true);
        if (e.getSource() == frmPrincipal.btmMantenimiento) frmGestionMantenimiento.setVisible(true);
        if (e.getSource() == frmPrincipal.btmClima) frmGestionClima.setVisible(true);
        if (e.getSource() == frmPrincipal.btmGestionUser) frmGestionUsuarios.setVisible(true);       
        
        //Boton SALIR
        
        if (e.getSource() == frmPrincipal.btmSalir) {
                //Salir, Cerrar todo pero dejar la principal
                frmPrincipal.setVisible(false);
                frmLogin.setVisible(true);
                User.setPassword("");
        }
    
    }
    
    


}
