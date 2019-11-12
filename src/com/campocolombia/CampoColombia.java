package com.campocolombia;

import com.campocolombia.controlador.ControladorGestionAbeja;
import com.campocolombia.controlador.ControladorLogin;
import com.campocolombia.controlador.ControladorPrincipal;
import com.campocolombia.modelo.gestionabejas.Abeja;
import com.campocolombia.modelo.gestionabejas.Colmena;
import com.campocolombia.modelo.gestionabejas.ConsultaColmena;
import com.campocolombia.modelo.user.Usuario;
import com.campocolombia.modelo.user.ConsultaUsuario;
import com.campocolombia.vista.GestionAbeja;
import com.campocolombia.vista.GestionClima;
import com.campocolombia.vista.GestionMantenimiento;
import com.campocolombia.vista.GestionProduccion;
import com.campocolombia.vista.GestionUsuarios;
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

        Colmena Col = new Colmena();
        ConsultaColmena Consulta = new ConsultaColmena();
        GestionAbeja Gestion = new GestionAbeja();
        Abeja Abe = new Abeja();

        ConsultaUsuario consultaUser = new ConsultaUsuario();

        GestionUsuarios frmGestionUsuarios = new GestionUsuarios();
        GestionClima frmGestionClima = new GestionClima();
        GestionMantenimiento frmGestionMantenimiento = new GestionMantenimiento();
        GestionProduccion frmProduccion = new GestionProduccion();
        GestionAbeja frmAbejas = new GestionAbeja();

        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(consultaUser, uSer, frmPrincipal, frmGestionUsuarios, frmGestionClima, frmGestionMantenimiento, frmProduccion, frmAbejas, frmLogin);
        ControladorLogin ctrlLogin = new ControladorLogin(uSer, cUser, frmLogin, frmPrincipal);
        ControladorGestionAbeja ctrlGestionAbeja = new ControladorGestionAbeja(Col, Consulta, Gestion);
        
        frmLogin.setVisible(true);
    }

}
