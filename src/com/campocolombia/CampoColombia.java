package com.campocolombia;

import com.campocolombia.controlador.ControladorLogin;
import com.campocolombia.modelo.user.Usuario;
import com.campocolombia.modelo.user.ConsultaUsuario;
import com.campocolombia.vista.Login;
import com.campocolombia.vista.Principal;

/**
 *
 * @author Jonattan
 */
public class CampoColombia {

    public static void main(String[] args) {
        //Vista
        Login frmLogin = new Login();        
        //Modelo
        Usuario usuario = new Usuario();
        ConsultaUsuario consultaUsuario = new ConsultaUsuario(frmLogin);

        //Controlador
        ControladorLogin ctrlLogin = new ControladorLogin(frmLogin, consultaUsuario, usuario);

        //Vista-controlador
        frmLogin.setControlador(ctrlLogin);
    
    }

}
