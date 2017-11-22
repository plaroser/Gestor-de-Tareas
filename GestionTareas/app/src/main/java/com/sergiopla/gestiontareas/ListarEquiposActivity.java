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



public class ListarEquiposActivity extends AppCompatActivity {

    private ListView equiposListView;
    private ArrayList<Equipo> equipos;
    private ArrayList<Empleado>empleados;
    private ArrayAdapter<Equipo> equipoArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//        equiposListView=(ListView)findViewById(R.id.lv_equipos);
//        equipos=new ArrayList<Equipo>();
//        empleados=new ArrayList<Empleado>();
//        Tarea tarea1= new Tarea("HOLA",equipo1)
//        Equipo equipo1=new Equipo("Equipo1",empleados,"Programación", )
//        Empleado empleado1=new Empleado("Ivan",)
//        empleados.add()
//        equipos.add("")
    }


}
