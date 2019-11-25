/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.gestionMantenimiento;

/**
 *
 * @author Jonattan
 */
public class Mantenimiento {
    
    int IdMantenimiento;
    int IdEmpleado;
    String TipoMantenimiento;
    String DescripcionMantenimiento;
    String Fecha;
    int Idcolmena;

    public String getTipoMantenimiento() {
        return TipoMantenimiento;
    }

    public void setTipoMantenimiento(String TipoMantenimiento) {
        this.TipoMantenimiento = TipoMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return DescripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String DescripcionMantenimiento) {
        this.DescripcionMantenimiento = DescripcionMantenimiento;
    }

    public int getIdcolmena() {
        return Idcolmena;
    }

    public void setIdcolmena(int Idcolmena) {
        this.Idcolmena = Idcolmena;
    }

    public int getIdMantenimiento() {
        return IdMantenimiento;
    }

    public void setIdMantenimiento(int IdMantenimiento) {
        this.IdMantenimiento = IdMantenimiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }
    
    
    
    

}
