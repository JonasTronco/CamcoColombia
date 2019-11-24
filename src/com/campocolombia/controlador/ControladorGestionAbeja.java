package com.campocolombia.controlador;



import com.campocolombia.modelo.gestionabejas.Abeja;
import com.campocolombia.modelo.gestionabejas.ConsultaAbeja;
import com.campocolombia.vista.GestionAbeja;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author NIKOFERO
 */
public class ControladorGestionAbeja implements ActionListener {

    //Variables
    Principal formularioMenu;
    GestionAbeja formularioGestionAbeja;
    ConsultaAbeja modeloAbeja;
    Abeja abeja;

    //Método constructor
    public ControladorGestionAbeja(Principal formularioMenu, GestionAbeja formularioGestionAbeja, ConsultaAbeja modeloAbeja, Abeja abeja) {
        this.formularioMenu = formularioMenu;
        this.formularioGestionAbeja = formularioGestionAbeja;
        this.modeloAbeja = modeloAbeja;
        this.abeja = abeja;
    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Botòn salir
        if (e.getSource() == formularioGestionAbeja.btnAtras) {

            //Se realiza el cambio de forms
            formularioMenu.setVisible(true);
            formularioGestionAbeja.setVisible(false);

        }

        //Botón insertar abeja
        if (e.getSource() == formularioGestionAbeja.btmIngresarAbeja) {

            //Se obtienen los datos de la abeja 
            abeja.setNombreAbejas(formularioGestionAbeja.textNombreAbejas.getText());
            abeja.setRazaAbejas(formularioGestionAbeja.textRazaAbeja.getText());
            abeja.setPesoAbejas(Double.parseDouble(formularioGestionAbeja.textPesoAbeja.getText()));
            abeja.setAltoAbejas(Double.parseDouble(formularioGestionAbeja.textAltoAbeja.getText()));
            abeja.setAncho(Double.parseDouble(formularioGestionAbeja.textAnchoAbeja.getText()));
            abeja.setColorAbejas(formularioGestionAbeja.textColorAbeja.getText());

            try {

                //Se realiza la inserción a la base de datos
                if (modeloAbeja.ingresarAbeja(abeja)) {

                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");

                }

            } catch (HeadlessException w) {

                JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {

            //Botón actualizar 
            if (e.getSource() == formularioGestionAbeja.btmModificarAbeja) {

                abeja.setNombreAbejas(formularioGestionAbeja.textNombreAbejas.getText());
                abeja.setRazaAbejas(formularioGestionAbeja.textRazaAbeja.getText());
                abeja.setPesoAbejas(Double.parseDouble(formularioGestionAbeja.textPesoAbeja.getText()));
                abeja.setAltoAbejas(Double.parseDouble(formularioGestionAbeja.textAltoAbeja.getText()));
                abeja.setAncho(Double.parseDouble(formularioGestionAbeja.textAnchoAbeja.getText()));
                abeja.setColorAbejas(formularioGestionAbeja.textColorAbeja.getText());

                try {

                    if (modeloAbeja.ActualizarAbeja(abeja)) {

                        JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");

                    } else {

                        JOptionPane.showMessageDialog(null, "Error al actualizar el registro");

                    }

                } catch (HeadlessException w) {

                    JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                if (e.getSource() == formularioGestionAbeja.btmConsultaAbejas) {
                    String consulta = formularioGestionAbeja.selectConsultaAbejas.getSelectedItem().toString();
                    String campo;
                    switch (consulta) {
                        case "General":
                            try {
                                campo = "";
                                modeloAbeja.consultaAbejas(consulta, campo);

                            } catch (HeadlessException w) {
                                
                                modeloAbeja.limpiarTabla();
                                JOptionPane.showMessageDialog(null, "Error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);

                            }
                            break;

                        case "Por id":
                            try {

                                campo = formularioGestionAbeja.textIDAbeja.getText();
                                modeloAbeja.consultaAbejas(consulta, campo);

                            } catch (HeadlessException w) {

                                modeloAbeja.limpiarTabla();
                                JOptionPane.showMessageDialog(null, "Error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);

                            }
                            break;
                        default:
                            modeloAbeja.limpiarTabla();
                            JOptionPane.showMessageDialog(null, "Error a seleccionado una opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            }
        }
    }

    //Método limpiar
    public void limpiar() {

        formularioGestionAbeja.textIDAbeja.setText(null);
        formularioGestionAbeja.textNombreAbejas.setText(null);
        formularioGestionAbeja.textRazaAbeja.setText(null);
        formularioGestionAbeja.textPesoAbeja.setText(null);
        formularioGestionAbeja.textAltoAbeja.setText(null);
        formularioGestionAbeja.textAnchoAbeja.setText(null);
        formularioGestionAbeja.textColorAbeja.setText(null);

    }
}
