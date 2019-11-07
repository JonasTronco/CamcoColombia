/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionabejas;

/**
 *
 * @author Jonattan
 */
public class Colmena {
    private int IdColmena;
    private int Abejas_IdAbejas;
    private int CantidadColmena;
    private String ObservacionesColmena;

    public int getIdColmena() {
        return IdColmena;
    }

    public void setIdColmena(int IdColmena) {
        this.IdColmena = IdColmena;
    }

    public int getAbejas_IdAbejas() {
        return Abejas_IdAbejas;
    }

    public void setAbejas_IdAbejas(int Abejas_IdAbejas) {
        this.Abejas_IdAbejas = Abejas_IdAbejas;
    }

    public int getCantidadColmena() {
        return CantidadColmena;
    }

    public void setCantidadColmena(int CantidadColmena) {
        this.CantidadColmena = CantidadColmena;
    }

    public String getObservacionesColmena() {
        return ObservacionesColmena;
    }

    public void setObservacionesColmena(String ObservacionesColmena) {
        this.ObservacionesColmena = ObservacionesColmena;
    }
    
    
}
