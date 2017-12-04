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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_ver_equipo);
        listViewTareas =(ListView)findViewById(R.id.verEquipos);


        Bundle i = getIntent().getExtras();
        if (i.containsKey("Equipo")) {
            String nombreEquipo = i.getString("Equipo");
            tareas = i.getParcelableArrayList(nombreEquipo);
        }


        if (tareas != null) {
            AdapterVerEquipo myAdapter = new AdapterVerEquipo(this, tareas);
            listViewTareas.setAdapter(myAdapter);


            listViewTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent newActivity = new Intent(view.getContext(), VerEquipoActivity.class);
                    newActivity.putExtra("Equipo " + position, parent.getItemIdAtPosition(position));
                    startActivity(newActivity);
                }


            });
        }
    }
}