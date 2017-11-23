package com.sergiopla.gestiontareas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Empleado;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class ListarEquiposActivity extends AppCompatActivity {

    private ListView equiposListView;
    private ArrayList<Equipo> equipos;
    private ArrayList<Empleado>empleados;
    private ArrayAdapter<Equipo> equipoArrayAdapter;
    private Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        calendar=Calendar.getInstance();
        equiposListView=(ListView)findViewById(R.id.lv_equipos);
        equipos=new ArrayList<Equipo>();
        empleados=new ArrayList<Empleado>();
        Equipo equipo1= new Equipo("Equipo1","Programación");
        Empleado empleado1= new Empleado("Iván");
        Tarea tarea1 = new Tarea(equipo1,calendar.getTime());
        equipos.add(equipo1);
        empleados.add(empleado1);
        Equipo teamAux = equipos.get(0);
        teamAux.getEmpleados().add(empleado1);
        empleado1.setEquipo(teamAux);
        equipos.get(0).getEmpleados().add(empleado1);
        equipoArrayAdapter = new ArrayAdapter<Equipo>(this,R.layout.activity_listar_equipos,equipos);
        equiposListView.setAdapter(equipoArrayAdapter);

    }

    


}
