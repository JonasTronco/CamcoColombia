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

        Usuario uSer = new Usuario();
        ConsultaUsuario cUser = new ConsultaUsuario();
        Login frmLogin = new Login();
        Principal frmPrincipal = new Principal();
        
        ControladorLogin ctrlLogin = new ControladorLogin(uSer, cUser, frmLogin,frmPrincipal);
        frmLogin.setVisible(true);
    }

}
