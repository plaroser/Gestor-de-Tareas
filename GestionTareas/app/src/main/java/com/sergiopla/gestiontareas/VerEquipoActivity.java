package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Adapters.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Adapters.AdapterVerEquipo;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.io.Serializable;
import java.util.ArrayList;

public class VerEquipoActivity extends AppCompatActivity {
    private ListView listViewTareas;
    private ArrayList<Tarea> tareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_equipo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent i = getIntent();
        final Equipo equipo1 =(Equipo)i.getSerializableExtra("Equipo 1");
        final Equipo equipo2 =(Equipo)i.getSerializableExtra("Equipo 2");
        final Equipo equipo3 =(Equipo)i.getSerializableExtra("Equipo 3");
        final Equipo equipo4 =(Equipo)i.getSerializableExtra("Equipo 4");
        final Equipo equipo5 =(Equipo)i.getSerializableExtra("Equipo 5");



        AdapterVerEquipo myAdapter = new AdapterVerEquipo(this, R.layout.item_ver_equipo, tareas);
        listViewTareas.setAdapter(myAdapter);

        listViewTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent newActivity = new Intent(VerEquipoActivity.this, VerEquipoActivity.class);
                newActivity.putExtra("Equipo "+ position, (Serializable) listViewTareas.getItemAtPosition(position));
                startActivity(newActivity);
                }


            });
    }
}