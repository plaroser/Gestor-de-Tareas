package com.sergiopla.gestiontareas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Adapters.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;


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
        final Tarea tarea1 = new Tarea(equipo1,currentTime);
        final Tarea tarea2 = new Tarea(equipo1,currentTime);
        final Tarea tarea3 = new Tarea(equipo1,currentTime);
        final Tarea tarea4 = new Tarea(equipo1,currentTime);
        final Tarea tarea5 = new Tarea(equipo1,currentTime);
        tareas = new ArrayList<Tarea>();
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        tareas.add(tarea4);
        tareas.add(tarea5);
        equipo1.setTareas(tareas);

        

        AdapterListarEquipos myAdapter = new AdapterListarEquipos(this, R.layout.items_listar_equipos, equipos);
        listViewEquipos.setAdapter(myAdapter);


        listViewEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent newActivity = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                    newActivity.putExtra("Equipo 1",(Parcelable)equipo1);
                    startActivity(newActivity);
                    case 1: Intent newActivity2 = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                        newActivity2.putExtra("Equipo 2",(Parcelable)equipo2);
                        startActivity(newActivity2);
                    case 2: Intent newActivity3 = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                        newActivity3.putExtra("Equipo 3",(Parcelable)equipo3);
                        startActivity(newActivity3);
                    case 3: Intent newActivity4 = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                        newActivity4.putExtra("Equipo 4",(Parcelable)equipo4);
                        startActivity(newActivity4);
                    case 4: Intent newActivity5 = new Intent(ListarEquiposActivity.this, VerEquipoActivity.class);
                        newActivity5.putExtra("Equipo 5",(Parcelable)equipo5);
                        startActivity(newActivity5);


                }
            }
        });


    }
}
