/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.controlador;

import com.campocolombia.modelo.Investigadores.ConsultaInvestigadores;
import com.campocolombia.modelo.Investigadores.Investigador;
import com.campocolombia.vista.GestionInvestigadores;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ControladorGestionInvestigacion implements ActionListener, WindowListener{

    //Variables
    Principal formularioMenu;
    GestionInvestigadores formularioGestion;
    ConsultaInvestigadores modeloInves;
    Investigador inves;

    public ControladorGestionInvestigacion(Principal formularioMenu, GestionInvestigadores formularioGestion, ConsultaInvestigadores modeloInves, Investigador inves) {
        this.formularioMenu = formularioMenu;
        this.formularioGestion = formularioGestion;
        this.modeloInves = modeloInves;
        this.inves = inves;
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
                inves.setIdProducto(Integer.parseInt(formularioGestion.textIDProducto.getText()));
                inves.setPuntacionRegistroC(Double.parseDouble(formularioGestion.textPuntuacion.getText()));
                inves.setAprovacionRegistroC(formularioGestion.selectTipoAprovacion.getSelectedItem().toString());

                inves.setFechaRegistroC(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaRegistroCalidad.getDate()));

                //Se realiza la inserción a la base de datos
                if (modeloInves.ingresar(inves)) {

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

            String consulta = formularioGestion.selectConsulta.getSelectedItem().toString();
            String campo;
            switch (consulta) {
                case "General":
                    try {
                        campo = "";
                        modeloInves.consulta(consulta, campo);

                    } catch (HeadlessException w) {

                        modeloInves.limpiarTabla();
                        JOptionPane.showMessageDialog(null, "Error al consultar por Cargo", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;

                case "Por ID":
                    try {

                        campo = formularioGestion.textIDregistroCalidad.getText();
                        modeloInves.consulta(consulta, campo);

                    } catch (HeadlessException w) {

                        modeloInves.limpiarTabla();
                        JOptionPane.showMessageDialog(null, "Error al consultar por ID", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;
                default:
                    modeloInves.limpiarTabla();
                    JOptionPane.showMessageDialog(null, "Error a seleccionado una opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

        //Botón modificar
        if (e.getSource() == formularioGestion.btmModificar) {

            try {

                //Se obtienen los datos 
                //Se obtienen los datos 
                inves.setIdProducto(Integer.parseInt(formularioGestion.textIDProducto.getText()));
                inves.setPuntacionRegistroC(Double.parseDouble(formularioGestion.textPuntuacion.getText()));
                inves.setAprovacionRegistroC(formularioGestion.selectTipoAprovacion.getSelectedItem().toString());

                inves.setFechaRegistroC(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaRegistroCalidad.getDate()));

                //Se realiza la inserción a la base de datos
                if (modeloInves.Actualizar(inves)) {

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
                inves.setIdRegistroC(Integer.parseInt(formularioGestion.textIDregistroCalidad.getText()));

                //Se realiza la inserción a la base de datos
                if (modeloInves.Borrado(inves)) {

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

       int IDEmpleado = modeloInves.cargarIdEmpleado(formularioMenu.lblUsuarioEmpleado.getText());
       inves.setIdEmpleado(IDEmpleado);
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