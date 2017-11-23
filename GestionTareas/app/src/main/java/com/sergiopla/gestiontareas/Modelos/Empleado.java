package com.sergiopla.gestiontareas.Modelos;

import java.util.ArrayList;

/**
 * Created by ivan on 22/11/2017.
 */

public class Empleado {
    private String nombre;
    private Equipo equipo;
    private ArrayList<Tarea> tareas;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.tareas = new ArrayList<Tarea>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Tarea> getTarea() {
        return tareas;
    }

    public void setTarea(ArrayList<Tarea> tarea) {
        this.tareas = tarea;
    }
}
