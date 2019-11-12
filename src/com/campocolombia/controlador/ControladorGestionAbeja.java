package com.campocolombia.controlador;

import com.campocolombia.modelo.gestionabejas.Abeja;
import com.campocolombia.modelo.gestionabejas.Colmena;
import com.campocolombia.modelo.gestionabejas.ConsultaColmena;
import com.campocolombia.vista.GestionAbeja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorGestionAbeja implements ActionListener {

    private Colmena Col;
    private ConsultaColmena Consulta;
    private GestionAbeja Gestion;
    private Abeja Abe;

    public ControladorGestionAbeja(Colmena Col, ConsultaColmena Consulta, GestionAbeja Gestion) {
        this.Col = Col;
        this.Consulta = Consulta;
        this.Gestion = Gestion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Gestion.btmIngresarColmena) {

            try {

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error: " + w);
            }

        }

        if (e.getSource() == Gestion.btmModificarColmena) {

            try {

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error: " + w);
            }

        }

        if (e.getSource() == Gestion.btmBorradoColmena) {

            try {

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error: " + w);
            }

        }

        if (e.getSource() == Gestion.btmConsultaColmena) {

            try {

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error: " + w);
            }

        }

        if (e.getSource() == Gestion.btmIngresarAbeja) {

            try {

                Abe.setNombreAbejas(Gestion.textNombreAbejas.getText());
                Abe.setRazaAbejas(Gestion.textRazaAbeja.getText());
                Abe.setColorAbejas(Gestion.textColorAbeja.getText());
                Abe.setPesoAbejas(Double.parseDouble(Gestion.textPesoAbeja.getText()));
                Abe.setAncho(Double.parseDouble(Gestion.textAnchoAbeja.getText()));
                Abe.setAltoAbejas(Double.parseDouble(Gestion.textAltoAbeja.getText()));
                
                if (Consulta.registrar(Col)) {
                    JOptionPane.showMessageDialog(null, "Ingreso correcto");
                }

            } catch (Exception w) {
                JOptionPane.showMessageDialog(null, "Error Ingreso: " + w);
            }

        }

    }

    public void limpiar() {

    }

}
