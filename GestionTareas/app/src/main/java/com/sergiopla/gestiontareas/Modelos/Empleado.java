package com.sergiopla.gestiontareas.Modelos;

/**
 * Created by ivan on 22/11/2017.
 */

public class Empleado {
    private String nombre;
    private Equipo equipo;
    private Tarea tarea;

    public Empleado(String nombre, Equipo equipo, Tarea tarea) {
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

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}
