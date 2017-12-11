package com.sergiopla.gestiontareas.Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 22/11/2017.
 */

public class Equipo implements Serializable {
    private String nombre;
    private List<Empleado> empleados;
    private String departamento;
    private ArrayList<Tarea> tareas;

    public Equipo(String nombre, ArrayList<Tarea> listaTareas) {
        this.nombre = nombre;
        this.tareas = listaTareas;
    }

    /**
     * Constructor para probar
     * @param nombre
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Constructor con todos los datos de Equipo
     * @param nombre
     * @param listaEmpleados
     * @param departamento
     * @param listaTareas
     */
    public Equipo(String nombre, List<Empleado> listaEmpleados, String departamento, ArrayList<Tarea> listaTareas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.empleados = listaEmpleados;
        this.tareas = listaTareas;
    }

    /**
     * Constructor para el adaptador
     * @param nombre
     * @param departamento
     */
    public Equipo(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
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

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }


}



