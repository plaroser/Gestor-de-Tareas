package com.sergiopla.gestiontareas.Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 22/11/2017.
 */

public class Equipo {
    private String nombre;
    private List<Empleado> empleados;
    private String departamento;
    private List<Tarea> tareas;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, List<Empleado>listaEmpleados, String departamento, List<Tarea>listaTareas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.empleados= listaEmpleados;
        this.tareas= listaTareas;
    }

    public Equipo(String nombre, List<Empleado> empleados, String departamento) {
        this(nombre,new ArrayList<Empleado>(),departamento,new ArrayList<Tarea>());
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Tarea> getTareas() {
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

