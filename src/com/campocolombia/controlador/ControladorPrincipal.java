/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.empleado.ConsultaEmpleado;
import com.campocolombia.modelo.empleado.Empleado;
import com.campocolombia.modelo.gestionabejas.Abeja;
import com.campocolombia.modelo.gestionabejas.ConsultaAbeja;
import com.campocolombia.vista.GestionAbeja;
import com.campocolombia.vista.GestionEmpleados;
import com.campocolombia.vista.Login;
import com.campocolombia.vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author NIKOFERO
 */
public class ControladorPrincipal implements ActionListener {

    //Variables
    Login formularioLogin;
    Principal formularioMenu;

    //Método constructor
    public ControladorPrincipal(Login formularioLogin, Principal formularioMenu) {
        this.formularioLogin = formularioLogin;
        this.formularioMenu = formularioMenu;
    }

    //Actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {

        //Botòn salir
        if (e.getSource() == formularioMenu.btnSalir) {

            //Se realiza el cambio de forms
            formularioLogin.setVisible(true);
            formularioMenu.setVisible(false);

        } else {
            //Botòn Abeja & Colmena
            if (e.getSource() == formularioMenu.btmGestionAbejas) {

                // Se inicializa el formulario, modelo y objetdo de las abejas & colmenas
                GestionAbeja formularioAbeja = new GestionAbeja();
                ConsultaAbeja modeloAbeja = new ConsultaAbeja(formularioAbeja);
                Abeja abeja = new Abeja();

                //Se inicializa el controlador de las abejas & colmenas
                ControladorGestionAbeja controladorAbeja = new ControladorGestionAbeja(formularioMenu, formularioAbeja, modeloAbeja, abeja);
                formularioAbeja.setControlador(controladorAbeja);

                //Se realiza el cambio de forms
                formularioAbeja.setVisible(true);
                formularioMenu.setVisible(false);

            }
        }

        if (e.getSource() == formularioMenu.btmGestionUser) {

            GestionEmpleados formularioEmpleado = new GestionEmpleados();
            ConsultaEmpleado modeloEmpleado = new ConsultaEmpleado(formularioEmpleado);
            Empleado empleado = new Empleado();

            ControladorGestionEmpleados controladorEmpleado = new ControladorGestionEmpleados(formularioMenu, formularioEmpleado, modeloEmpleado, empleado);
            formularioEmpleado.setControlador(controladorEmpleado);

            formularioEmpleado.setVisible(true);
            formularioMenu.setVisible(false);
        }
    }
}
