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
import android.widget.Toast;

import com.sergiopla.gestiontareas.Adapters.AdapterListarEquipos;
import com.sergiopla.gestiontareas.Adapters.AdapterVerEquipo;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.io.Serializable;
import java.util.ArrayList;

public class VerEquipoActivity extends AppCompatActivity {
    private ListView listViewTareas;
    private ArrayList<Tarea> tareas;
    private Equipo equipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_ver_equipo);
        listViewTareas =(ListView)findViewById(R.id.verEquipos);


        Equipo equipo = getIntent().getExtras().getParcelable("Equipo");
        if (equipo !=null){
            tareas=equipo.getTareas();
            Toast.makeText(this, "Funciona",Toast.LENGTH_LONG).show();
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