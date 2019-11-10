package com.campocolombia;

import com.campocolombia.controlador.controladorLogin;
import com.campocolombia.modelo.user.User;
import com.campocolombia.modelo.user.consultaUser;
import com.campocolombia.vista.login;
import com.campocolombia.vista.principal;

/**
 *
 * @author Jonattan
 */
public class CampoColombia {

    public static void main(String[] args) {

        User uSer = new User();
        consultaUser cUser = new consultaUser();
        login frmLogin = new login();
        principal frmPrincipal = new principal();
        
        controladorLogin ctrlLogin = new controladorLogin(uSer, cUser, frmLogin,frmPrincipal);
        frmLogin.setVisible(true);
    }

}
