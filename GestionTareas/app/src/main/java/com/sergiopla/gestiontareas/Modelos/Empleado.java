package com.sergiopla.gestiontareas.Modelos;

import java.util.ArrayList;

/**
 * Created by ivan on 22/11/2017.
 */

public class Empleado {
    private String nombre;
    private Equipo equipo;
    private ArrayList<Tarea> tarea;

    public Empleado(String nombre, Equipo equipo, ArrayList<Tarea> tarea) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.tarea = tarea;
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
        return tarea;
    }

    public void setTarea(ArrayList<Tarea> tarea) {
        this.tarea = tarea;
    }
}
