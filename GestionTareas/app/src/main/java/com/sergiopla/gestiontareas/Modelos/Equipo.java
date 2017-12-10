package com.sergiopla.gestiontareas.Modelos;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 22/11/2017.
 */

public class Equipo implements Parcelable {
    private String nombre;
    private List<Empleado> empleados;
    private String departamento;
    private ArrayList<Tarea> tareas;

    public Equipo(String nombre, ArrayList<Tarea> listaTareas) {
        this.nombre = nombre;
        this.tareas = listaTareas;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, List<Empleado> listaEmpleados, String departamento, ArrayList<Tarea> listaTareas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.empleados = listaEmpleados;
        this.tareas = listaTareas;
    }

    public Equipo(String nombre, String departamento) {
        this(nombre, new ArrayList<Empleado>(), departamento, new ArrayList<Tarea>());
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

        public static final Parcelable.Creator<Equipo> CREATOR = new Parcelable.Creator<Equipo>() {
        @Override
        public Equipo createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public Equipo[] newArray(int i) {
            return new Equipo[0];
        }
    };
}



