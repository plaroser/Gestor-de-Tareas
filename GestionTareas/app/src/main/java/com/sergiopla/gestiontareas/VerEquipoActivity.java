package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.sergiopla.gestiontareas.Adapters.AdapterVerEquipo;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

import java.util.ArrayList;

public class VerEquipoActivity extends AppCompatActivity {
    private ArrayList<Tarea> tareas;
    private Equipo equipo;
    private ListView listViewTareas;
    private TextView tv_titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_ver_equipo);
        listViewTareas = (ListView) findViewById(R.id.verEquipos);
        equipo = (Equipo) getIntent().getSerializableExtra("Equipo");
        tv_titulo = findViewById(R.id.tv_Titulo);

        if (equipo != null) {
            tareas = equipo.getTareas();
            tv_titulo.setText(equipo.getNombre());

            if (tareas != null) {
                AdapterVerEquipo myAdapter = new AdapterVerEquipo(this, tareas);
                listViewTareas.setAdapter(myAdapter);


                listViewTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(view.getContext(), CrearTarea.class);
                        intent.putExtra("Tarea",tareas.get(position));

                        startActivity(intent);
                    }
                    
                });
            }
        }


    }
}