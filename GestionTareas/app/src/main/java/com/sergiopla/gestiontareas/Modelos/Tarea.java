package com.sergiopla.gestiontareas.Modelos;

import com.sergiopla.gestiontareas.Modelos.Empleado;
import com.sergiopla.gestiontareas.Modelos.Equipo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ivan on 22/11/2017.
 */

public class Tarea {

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
        return fechaInicio;
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

    public String formatearFecha(Date fecha){
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yy");
        return ft.format(fecha);
    }
}