

package com.campocolombia.controlador;

import com.campocolombia.modelo.user.ConsultaUsuario;
import com.campocolombia.modelo.user.Usuario;
import com.campocolombia.vista.Login;
import com.campocolombia.vista.Principal;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author NIKOFERO
 */
public class ControladorLogin implements ActionListener {

    //Variables
    Login formularioLogin;
    ConsultaUsuario modeloLogin;
    Usuario modeloUsuario;

    //Método constructor
    public ControladorLogin(Login formularioLogin, ConsultaUsuario modeloLogin, Usuario modeloUsuario) {
        this.formularioLogin = formularioLogin;
        this.modeloLogin = modeloLogin;
        this.modeloUsuario = modeloUsuario;
    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        //Botón ingresar
        if (e.getSource() == formularioLogin.botonIngresar) {

            modeloUsuario.setUsuario(formularioLogin.textUserName.getText());
            modeloUsuario.setPassword(formularioLogin.textUserPassword.getText());
            modeloUsuario.setTipo(formularioLogin.selectRol.getSelectedItem().toString());

            try {
                if (modeloLogin.consultaUsuario(modeloUsuario)) {

                    // Se inicializa el ménu principal
                    Principal formularioMenu = new Principal(modeloUsuario.getUsuario(), modeloUsuario.getTipo());
                    formularioMenu.setVisible(true);
                    formularioLogin.setVisible(false);

                    //Se inicializa el controlador del ménu principal
                    ControladorPrincipal controlador = new ControladorPrincipal(formularioLogin, formularioMenu);
                    formularioMenu.setControlador(controlador);

                    //Se llama a la funciòn limpiar
                    limpiar();

                } else {

                    JOptionPane.showMessageDialog(null, "Los datos no son correctos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    limpiar();

                }
            } catch (HeadlessException w) {

                JOptionPane.showMessageDialog(null, "Error: " + w, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Mètodo limpiar
    public void limpiar() {

        formularioLogin.textUserName.setText(null);
        formularioLogin.textUserPassword.setText(null);

    }

}
