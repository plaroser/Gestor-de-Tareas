package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;

public class CrearTarea extends AppCompatActivity {

    private Tarea t;
    private Button editar;
    private Button crear;
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

        editar = (Button) findViewById(R.id.btnEditar);
        crear = (Button) findViewById(R.id.btnCrear);
        nombre = (EditText) findViewById(R.id.edtNombreTarea);
        descripcion = (EditText) findViewById(R.id.edtDescripcion);
        equipo = (EditText) findViewById(R.id.edtEquipo);
        fechal = (EditText) findViewById(R.id.edtFechaLimite);
        fechac = (EditText) findViewById(R.id.edtFechaCreacion);
        switch1 = (Switch) findViewById(R.id.switch1);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        t = (Tarea) getIntent().getSerializableExtra("Tarea");

        if (t != null) {
            modoLectura();
            imprimirTarea(t);
        }

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crear = new Intent(CrearTarea.this, HomeActivity.class);
                Toast.makeText(CrearTarea.this, "Tarea creada con exito", Toast.LENGTH_SHORT).show();
                startActivity(crear);
            }
        });

    }

    public void modoLectura() {
        editar.setEnabled(false);
        nombre.setEnabled(false);
        descripcion.setEnabled(false);
        equipo.setEnabled(false);
        fechac.setEnabled(false);
        fechal.setEnabled(false);
        switch1.setEnabled(false);
        spinner1.setEnabled(false);

    }

    public void imprimirTarea(Tarea tarea) {
        nombre.setText(tarea.getCabecera());
        descripcion.setText("Para poder utilizar Administrador de autorización de forma efectiva para controlar el acceso a los recursos, primero debe definir roles, tareas y operaciones.");
        editar.setEnabled(true);
        equipo.setText("Cenec");
        if (tarea.getFechaInicio() != null)
            fechal.setText(tarea.getFechaInicio().toString());
        else
            fechal.setText("12/05/2017");
        fechac.setText("23/08/2017");
    }

    public void escritura() {
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
