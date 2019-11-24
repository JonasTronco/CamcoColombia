package com.campocolombia.controlador;

import com.campocolombia.modelo.Clima.Clima;
import com.campocolombia.modelo.Clima.ConsultaClima;
import com.campocolombia.vista.GestionClima;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class ControladorGestionClima implements ActionListener, WindowListener{

    //Variables
    Principal formularioMenu;
    GestionClima formularioGestion;
    ConsultaClima modeloClima;
    Clima clima;

    public ControladorGestionClima(Principal formularioMenu, GestionClima formularioGestion, ConsultaClima modeloClima, Clima clima) {
        this.formularioMenu = formularioMenu;
        this.formularioGestion = formularioGestion;
        this.modeloClima = modeloClima;
        this.clima = clima;
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
        if (e.getSource() == formularioGestion.btmIngresarClima) {

            try {

                //Se obtienen los datos 
                clima.setTemperaturaClima(Double.parseDouble(formularioGestion.textTemperatura.getText()));
                clima.setHumedadClima(Double.parseDouble(formularioGestion.textHumedad.getText()));
                clima.setPrecipitacionClima(Double.parseDouble(formularioGestion.textPrecipitacion.getText()));

                clima.setFechaClima(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaClima.getDate()));

                //Se realiza la inserción a la base de datos
                if (modeloClima.ingresar(clima)) {

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

        if (e.getSource() == formularioGestion.btmConsultaClima) {

            String consulta = new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaConsultaClima.getDate());

            try {
                modeloClima.consulta(consulta);

            } catch (HeadlessException w) {

                modeloClima.limpiarTabla();
                JOptionPane.showMessageDialog(null, "Error al consultar por Cargo", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

        //Botón modificar
        if (e.getSource() == formularioGestion.btmModificarClima) {

            try {

                //Se obtienen los datos 
                clima.setTemperaturaClima(Double.parseDouble(formularioGestion.textTemperatura.getText()));
                clima.setHumedadClima(Double.parseDouble(formularioGestion.textHumedad.getText()));
                clima.setPrecipitacionClima(Double.parseDouble(formularioGestion.textPrecipitacion.getText()));

                clima.setFechaClima(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestion.fechaClima.getDate()));

                //Se realiza la inserción a la base de datos
                if (modeloClima.Actualizar(clima)) {

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
        if (e.getSource() == formularioGestion.btmBorradoClima) {

            try {

                //Se obtienen los datos 
                clima.setIdClima(Integer.parseInt(formularioGestion.textIDClima.getText()));

                //Se realiza la inserción a la base de datos
                if (modeloClima.Borrado(clima)) {

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

       int IDEmpleado = modeloClima.cargarIdEmpleado(formularioMenu.lblUsuarioEmpleado.getText());
       clima.setIdEmpleado(IDEmpleado);
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
