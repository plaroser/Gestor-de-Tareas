package com.sergiopla.gestiontareas.Modelos;

import com.sergiopla.gestiontareas.Modelos.Empleado;

import java.util.ArrayList;

/**
 * Created by ivan on 22/11/2017.
 */

public class Equipo {
    private String nombre;
    private ArrayList<Empleado> empleado;
    private String departamento;
    private ArrayList<Tarea> tarea;

    public Equipo(String nombre, ArrayList<Empleado> empleado, String departamento, ArrayList<Tarea> tarea){
        this.nombre=nombre;
        this.empleado=empleado;
        this.departamento=departamento;
        this.tarea=tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Tarea> getTarea() {
        return tarea;
    }

    public void setTarea(ArrayList<Tarea> tarea) {
        this.tarea = tarea;
    }
}

