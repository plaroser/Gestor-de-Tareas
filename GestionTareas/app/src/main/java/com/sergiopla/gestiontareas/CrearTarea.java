package com.sergiopla.gestiontareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class CrearTarea extends AppCompatActivity {

    Button editar;
    Button crear;
    EditText nombre;
    EditText descripcion;
    EditText equipo;
    EditText fechal;
    EditText fechac;
    Switch switch1;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_tarea);

        editar=(Button) findViewById(R.id.btnEditar);
        crear=(Button) findViewById(R.id.btnCrear);
        nombre=(EditText) findViewById(R.id.edtNombreTarea);
        descripcion=(EditText) findViewById(R.id.edtDescripcion);
        equipo=(EditText) findViewById(R.id.edtEquipo);
        fechal=(EditText) findViewById(R.id.edtFechaLimite);
        fechac=(EditText) findViewById(R.id.edtFechaCreacion);
        switch1=(Switch) findViewById(R.id.switch1);
        spinner1=(Spinner) findViewById(R.id.spinner);

    }

    public void lectura(){
        editar.setEnabled(false);
        nombre.setEnabled(false);
        descripcion.setEnabled(false);
        equipo.setEnabled(false);
        fechac.setEnabled(false);
        fechal.setEnabled(false);
        switch1.setEnabled(false);
        spinner1.setEnabled(false);

    }

    public void escritura(){
        editar.setEnabled(true);
        nombre.setEnabled(true);
        descripcion.setEnabled(true);
        equipo.setEnabled(true);
        fechac.setEnabled(true);
        fechal.setEnabled(true);
        switch1.setEnabled(true);
        spinner1.setEnabled(true);

    }
}
