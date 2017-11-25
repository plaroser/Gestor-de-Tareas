package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Adapters.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Modelos.Equipo;

import java.util.ArrayList;


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
        equipos.add(new Equipo("Equipo 1"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));
        equipos.add(new Equipo("Equipo2"));


        AdapterListarEquipos myAdapter = new AdapterListarEquipos(this, R.layout.content_listar_equipos, equipos);
        listViewEquipos.setAdapter(myAdapter);


        listViewEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent((view.getContext()), CrearTarea.class);
                    startActivityForResult(intent, 0);
                }
            }
        });


    }
}
