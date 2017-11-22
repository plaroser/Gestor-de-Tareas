package com.sergiopla.gestiontareas.Modelos;

import com.sergiopla.gestiontareas.Modelos.Empleado;
import com.sergiopla.gestiontareas.Modelos.Equipo;

import java.util.Date;

/**
 * Created by ivan on 22/11/2017.
 */

public class Tarea {

    private String cabecera;
    private Equipo equipo;
    private String comentario;
    private Date fechaInicio;
    private Date fechaFin;
    private Empleado empleado;

    public Tarea(String cabecera, Equipo equipo, String comentario, Date fechaInicio, Date fechaFin, Empleado empleado) {
        this.cabecera = cabecera;
        this.equipo = equipo;
        this.comentario = comentario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleado = empleado;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
