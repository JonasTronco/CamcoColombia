/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.campocolombia.modelo.empleado;

import com.mysql.fabric.xmlrpc.base.Data;
import java.util.Date;

/**
 *
 * @author Jonattan
 */
public class Empleado {

    int iIdEmpleado;
    String NombreEmpleado;
    String ApellidoEmpleado;
    String DireccionEmpleado;
    String FechaNEmpleado;
    int EdadEmpleado;
    String TipoContratoEmpleado;

    double SueldoEmpleado;
    String UsuarioEmpleado;
    String ContraseñaEmpleado;
    String TipoEmpleado;

    public String getTipoEmpleado() {
        return TipoEmpleado;
    }

    public void setTipoEmpleado(String TipoEmpleado) {
        this.TipoEmpleado = TipoEmpleado;
    }

    public int getiIdEmpleado() {
        return iIdEmpleado;
    }

    public void setiIdEmpleado(int iIdEmpleado) {
        this.iIdEmpleado = iIdEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public String getDireccionEmpleado() {
        return DireccionEmpleado;
    }

    public void setDireccionEmpleado(String DireccionEmpleado) {
        this.DireccionEmpleado = DireccionEmpleado;
    }

    public String getFechaNEmpleado() {
        return FechaNEmpleado;
    }

    public void setFechaNEmpleado(String FechaNEmpleado) {
        this.FechaNEmpleado = FechaNEmpleado;
    }

    public int getEdadEmpleado() {
        return EdadEmpleado;
    }

    public void setEdadEmpleado(int EdadEmpleado) {
        this.EdadEmpleado = EdadEmpleado;
    }

    public String getTipoContratoEmpleado() {
        return TipoContratoEmpleado;
    }

    public void setTipoContratoEmpleado(String TipoContratoEmpleado) {
        this.TipoContratoEmpleado = TipoContratoEmpleado;
    }

    public double getSueldoEmpleado() {
        return SueldoEmpleado;
    }

    public void setSueldoEmpleado(double SueldoEmpleado) {
        this.SueldoEmpleado = SueldoEmpleado;
    }

    public String getUsuarioEmpleado() {
        return UsuarioEmpleado;
    }

    public void setUsuarioEmpleado(String UsuarioEmpleado) {
        this.UsuarioEmpleado = UsuarioEmpleado;
    }

    public String getContraseñaEmpleado() {
        return ContraseñaEmpleado;
    }

    public void setContraseñaEmpleado(String ContraseñaEmpleado) {
        this.ContraseñaEmpleado = ContraseñaEmpleado;
    }
}
