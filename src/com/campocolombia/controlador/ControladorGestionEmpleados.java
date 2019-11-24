package com.campocolombia.controlador;

import com.campocolombia.modelo.empleado.ConsultaEmpleado;
import com.campocolombia.modelo.empleado.Empleado;
import com.campocolombia.vista.GestionEmpleados;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ControladorGestionEmpleados implements ActionListener {

    //Variables
    Principal formularioMenu;
    GestionEmpleados formularioGestionEmpleado;
    ConsultaEmpleado modeloEmpleado;
    Empleado empleado;

    public ControladorGestionEmpleados(Principal formularioMenu, GestionEmpleados formularioGestionEmpleado, ConsultaEmpleado modeloEmpleado, Empleado empleado) {
        this.formularioMenu = formularioMenu;
        this.formularioGestionEmpleado = formularioGestionEmpleado;
        this.modeloEmpleado = modeloEmpleado;
        this.empleado = empleado;
    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Botòn salir
        if (e.getSource() == formularioGestionEmpleado.btnAtras) {

            //Se realiza el cambio de forms
            formularioMenu.setVisible(true);
            formularioGestionEmpleado.setVisible(false);

        }

        //Botón insertar 
        if (e.getSource() == formularioGestionEmpleado.btmIngresarEmpleado) {

            try {

                //Se obtienen los datos 
                empleado.setiIdEmpleado(Integer.parseInt(formularioGestionEmpleado.textIDEmpleadoIngreso.getText()));
                empleado.setNombreEmpleado(formularioGestionEmpleado.textNombreEmpleado.getText());
                empleado.setApellidoEmpleado(formularioGestionEmpleado.textApellidoEmpleado.getText());
                empleado.setDireccionEmpleado(formularioGestionEmpleado.textDireccionEmpleado.getText());

                empleado.setFechaNEmpleado(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestionEmpleado.fechaNacimientoEmpleado.getDate()));

                empleado.setEdadEmpleado(Integer.parseInt(formularioGestionEmpleado.textEdadEmpleado.getText()));
                empleado.setTipoContratoEmpleado(formularioGestionEmpleado.selectTipoContrato.getSelectedItem().toString());
                empleado.setSueldoEmpleado(Double.parseDouble(formularioGestionEmpleado.textSueldoEmpleado.getText()));
                empleado.setUsuarioEmpleado(formularioGestionEmpleado.textUsuarioEmpleado.getText());
                empleado.setContraseñaEmpleado(formularioGestionEmpleado.textPassWordEmpleado.getText());
                empleado.setTipoEmpleado(formularioGestionEmpleado.selectTipoContrato.getSelectedItem().toString());

                //Se realiza la inserción a la base de datos
                if (modeloEmpleado.ingresar(empleado)) {

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

        if (e.getSource() == formularioGestionEmpleado.btmConsultaEmpleado) {

            String consulta = formularioGestionEmpleado.selectConsultaEmpleado.getSelectedItem().toString();
            String campo;
            switch (consulta) {
                case "General":
                    try {
                        campo = formularioGestionEmpleado.selectRol.getSelectedItem().toString();
                        modeloEmpleado.consultaEmpleado(consulta, campo);

                    } catch (HeadlessException w) {

                        modeloEmpleado.limpiarTabla();
                        JOptionPane.showMessageDialog(null, "Error al consultar por Cargo", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;

                case "Por ID":
                    try {

                        campo = formularioGestionEmpleado.textIDEmpleadoModificar.getText();
                        modeloEmpleado.consultaEmpleado(consulta, campo);

                    } catch (HeadlessException w) {

                        modeloEmpleado.limpiarTabla();
                        JOptionPane.showMessageDialog(null, "Error al consultar por ID", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;
                default:
                    modeloEmpleado.limpiarTabla();
                    JOptionPane.showMessageDialog(null, "Error a seleccionado una opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        
        
        //Botón modificar
        if (e.getSource() == formularioGestionEmpleado.btmModificarEmpleado) {

            try {

                //Se obtienen los datos 
                empleado.setiIdEmpleado(Integer.parseInt(formularioGestionEmpleado.textIDEmpleadoIngreso.getText()));
                empleado.setNombreEmpleado(formularioGestionEmpleado.textNombreEmpleado.getText());
                empleado.setApellidoEmpleado(formularioGestionEmpleado.textApellidoEmpleado.getText());
                empleado.setDireccionEmpleado(formularioGestionEmpleado.textDireccionEmpleado.getText());

                empleado.setFechaNEmpleado(new SimpleDateFormat("yyyy-MM-dd").format(formularioGestionEmpleado.fechaNacimientoEmpleado.getDate()));

                empleado.setEdadEmpleado(Integer.parseInt(formularioGestionEmpleado.textEdadEmpleado.getText()));
                empleado.setTipoContratoEmpleado(formularioGestionEmpleado.selectTipoContrato.getSelectedItem().toString());
                empleado.setSueldoEmpleado(Double.parseDouble(formularioGestionEmpleado.textSueldoEmpleado.getText()));
                empleado.setUsuarioEmpleado(formularioGestionEmpleado.textUsuarioEmpleado.getText());
                empleado.setContraseñaEmpleado(formularioGestionEmpleado.textPassWordEmpleado.getText());
                empleado.setTipoEmpleado(formularioGestionEmpleado.selectTipoContrato.getSelectedItem().toString());

                //Se realiza la inserción a la base de datos
                if (modeloEmpleado.Actualizar(empleado)) {

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
        if (e.getSource() == formularioGestionEmpleado.btmBorradoEmpleado) {

            try {

                //Se obtienen los datos 
                empleado.setiIdEmpleado(Integer.parseInt(formularioGestionEmpleado.textIDEmpleadoIngreso.getText()));
               
                //Se realiza la inserción a la base de datos
                if (modeloEmpleado.Borrado(empleado)) {

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

}
