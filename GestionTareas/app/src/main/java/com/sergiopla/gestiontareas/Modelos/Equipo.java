package com.sergiopla.gestiontareas.Modelos;

import com.sergiopla.gestiontareas.Modelos.Empleado;

import java.util.ArrayList;

/**
 * Created by ivan on 22/11/2017.
 */

public class Equipo {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private String departamento;
    private ArrayList<Tarea> tareas;

    public Equipo(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.empleados= new ArrayList<Empleado>();
        this.tareas= new ArrayList<Tarea>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}

