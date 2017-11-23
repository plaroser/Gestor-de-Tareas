package com.sergiopla.gestiontareas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Modelos.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Empleado;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class ListarEquiposActivity extends AppCompatActivity {
    private ListView listViewEquipos;
    private ArrayList<Equipo> equipos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listViewEquipos = (ListView) findViewById(R.id.list_item);

        equipos = new ArrayList<Equipo>();
        equipos.add(new Equipo("Equipo1"));
        equipos.add(new Equipo("Equipo2"));

        AdapterListarEquipos myAdapter=new AdapterListarEquipos(this,R.layout.content_listar_equipos, equipos);
        listViewEquipos.setAdapter(myAdapter);







    }
}
