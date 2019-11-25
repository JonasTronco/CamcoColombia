/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.gestionMantenimiento.ConsultaMantenimiento;
import com.campocolombia.modelo.gestionMantenimiento.Mantenimiento;
import com.campocolombia.vista.GestionMantenimiento;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ControladorGestionMantenimiento implements ActionListener, WindowListener{

    //Variables
    Principal formularioMenu;
    GestionMantenimiento formularioGestion;
    ConsultaMantenimiento modelo;
    Mantenimiento mante;

    public ControladorGestionMantenimiento(Principal formularioMenu, GestionMantenimiento formularioGestion, ConsultaMantenimiento modelo, Mantenimiento mante) {
        this.formularioMenu = formularioMenu;
        this.formularioGestion = formularioGestion;
        this.modelo = modelo;
        this.mante = mante;
    }

   
   
    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        //Botòn salir
        if (e.getSource() == formularioGestion.btnAtras) {

            //Se realiza el cambio de forms
            formularioMenu.setVisible(true);
            formularioGestion.setVisible(false);

        }

        //Botón insertar 
        if (e.getSource() == formularioGestion.btmIngresar) {

            try {

                //Se obtienen los datos 
                mante.setIdcolmena(Integer.parseInt(formularioGestion.textIDColmena.getText()));
                mante.setTipoMantenimiento(formularioGestion.textTipoMantenimiento.getText());
                mante.setDescripcionMantenimiento(formularioGestion.textAnotaciones.getText());

                mante.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaMantenimiento.getDate()));

                //Se realiza la inserción a la base de datos
                if (modelo.ingresar(mante,String.valueOf(mante.getIdEmpleado()))) {

                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");

                }

            } catch (HeadlessException w) {

                JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);

            } catch (Exception g) {
                System.err.println("Error" + g.getLocalizedMessage());
            }

        }

        if (e.getSource() == formularioGestion.btmConsulta) {

            String consulta = new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaMantenimientoConsulta.getDate());

            try {
                modelo.consulta(consulta);

            } catch (HeadlessException w) {

                modelo.limpiarTabla();
                JOptionPane.showMessageDialog(null, "Error al consultar por Cargo", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

        //Botón modificar
        if (e.getSource() == formularioGestion.btmModificar) {

            try {

                
                //Se obtienen los datos 
                mante.setIdcolmena(Integer.parseInt(formularioGestion.textIDColmena.getText()));
                mante.setTipoMantenimiento(formularioGestion.textTipoMantenimiento.getText());
                mante.setDescripcionMantenimiento(formularioGestion.textAnotaciones.getText());

                mante.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaMantenimiento.getDate()));
                //Se realiza la inserción a la base de datos
                if (modelo.Actualizar(mante)) {

                    JOptionPane.showMessageDialog(null, "Registro Modificado correctamente");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al Modificar el registro");

                }

            } catch (HeadlessException w) {

                JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);

            } catch (Exception g) {
                System.err.println("Error" + g.getLocalizedMessage());
            }

        }

        //Botón borrar
        if (e.getSource() == formularioGestion.btmBorrado) {

            try {

                //Se obtienen los datos 
                mante.setIdMantenimiento(Integer.parseInt(formularioGestion.textIDMantenimiento.getText()));

                //Se realiza la inserción a la base de datos
                if (modelo.Borrado(mante)) {

                    JOptionPane.showMessageDialog(null, "Registro Borrado correctamente");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al Borrar el registro");

                }

            } catch (HeadlessException w) {

                JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);

            } catch (Exception g) {
                System.err.println("Error" + g.getLocalizedMessage());
            }

        }

    }
    
    @Override
    public void windowOpened(WindowEvent we) {

       int IDEmpleado = modelo.cargarIdEmpleado(formularioMenu.lblUsuarioEmpleado.getText());
       mante.setIdEmpleado(IDEmpleado);
    }


    @Override
    public void windowClosing(WindowEvent we) {
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }


}