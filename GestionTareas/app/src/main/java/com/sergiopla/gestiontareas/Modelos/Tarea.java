package com.sergiopla.gestiontareas.Modelos;

import android.os.Parcel;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ivan on 22/11/2017.
 */

public class Tarea implements Serializable{

    private String cabecera;
    private Equipo equipo;
    private String comentario;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Empleado> empleados;

    public Tarea(Equipo equipo, Date fechaInicio) {
        this.equipo = equipo;
        this.fechaInicio = formatearFecha(fechaInicio);
        this.empleados = new ArrayList<Empleado>();
        this.cabecera = "Nombra la tarea";
        this.comentario = "Escribe un comentario";
        this.fechaFin = "";
    }

    public Tarea(String cabecera, Equipo equipo) {
        this.cabecera = cabecera;
        this.equipo = equipo;
    }

    public Tarea(Parcel source) {
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

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String formatearFecha(Date fecha) {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yy");
        return ft.format(fecha);
    }

}