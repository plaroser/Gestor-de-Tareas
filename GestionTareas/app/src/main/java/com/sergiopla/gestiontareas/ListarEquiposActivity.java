package com.sergiopla.gestiontareas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sergiopla.gestiontareas.Adapters.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import junit.framework.Assert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import static android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;


public class ListarEquiposActivity extends AppCompatActivity {
    private ListView listViewEquipos;
    private ArrayList<Equipo> equipos;
    private ArrayList<Tarea> tareas;
    private Date currentTime = Calendar.getInstance().getTime();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listViewEquipos = (ListView) findViewById(R.id.list_item);

        equipos = new ArrayList<Equipo>();
        final Equipo equipo1 = new Equipo("Equipo 1");
        final Equipo equipo2 = new Equipo("Equipo 2");
        final Equipo equipo3 = new Equipo("Equipo 3");
        final Equipo equipo4 = new Equipo("Equipo 4");
        final Equipo equipo5 = new Equipo("Equipo 5");
        final Tarea tarea1 = new Tarea(equipo1, currentTime);
        final Tarea tarea2 = new Tarea(equipo1, currentTime);
        final Tarea tarea3 = new Tarea(equipo1, currentTime);
        final Tarea tarea4 = new Tarea(equipo1, currentTime);
        final Tarea tarea5 = new Tarea(equipo1, currentTime);

        tareas = new ArrayList<Tarea>();
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        tareas.add(tarea4);
        tareas.add(tarea5);

        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);

        equipo1.setTareas(tareas);

        listViewEquipos.setClickable(true);

        AdapterListarEquipos myAdapter = new AdapterListarEquipos(this, R.layout.items_listar_equipos, equipos);
        listViewEquipos.setAdapter(myAdapter);


        listViewEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent newActivity = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                newActivity.putExtra("Equipo " + i, (Serializable) listViewEquipos.getItemAtPosition(i));
                startActivity(newActivity);
            }
        });


    }


}
