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
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.util.ArrayList;
import java.util.Date;


public class ListarEquiposActivity extends AppCompatActivity {
    private ListView listViewEquipos;
    private ArrayList<Equipo> equipos;
    private ArrayList<Tarea> tareas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        listViewEquipos = (ListView) findViewById(R.id.list_item);
        setSupportActionBar(toolbar);
        AñadirYpasar();

        AdapterListarEquipos myAdapter = new AdapterListarEquipos(this, R.layout.items_listar_equipos, equipos);
        listViewEquipos.setAdapter(myAdapter);

        listViewEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), VerEquipoActivity.class);
                intent.putExtra("Equipo", equipos.get(position));

                startActivity(intent);
            }
        });

    }

    private void AñadirYpasar() {

        equipos = new ArrayList<Equipo>();
        for (int i = 0; i < 5; i++) {
            Equipo nuevoEquipo = new Equipo("Equipo " + i);
            equipos.add(nuevoEquipo);
            ArrayList<Tarea> listaTareas = new ArrayList<>();
            for (int j = 0; j < 10; j++)
                listaTareas.add(new Tarea("Tarea "+j, new Date()));

            equipos.get(i).setTareas(listaTareas);
        }

    }


}
