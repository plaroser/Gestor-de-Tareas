package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        crear=(Button) findViewById(R.id.btnCrearCuenta);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crear= new Intent(Registro.this, LoginActivity.class);
                startActivity(crear);

                Toast.makeText(Registro.this, "Cuenta creada con exito", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
