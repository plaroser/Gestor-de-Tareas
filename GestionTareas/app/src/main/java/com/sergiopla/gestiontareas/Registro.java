package com.sergiopla.gestiontareas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Registro extends AppCompatActivity {

    Button crear;
    EditText edtCorreo;
    EditText edtContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        final SharedPreferences.Editor editor = pref.edit();


        edtCorreo = (EditText) findViewById(R.id.edtCorreo);
        edtContraseña = (EditText) findViewById(R.id.edtContraseña);
        crear = (Button) findViewById(R.id.btnCrearCuenta);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crear = new Intent(Registro.this, LoginActivity.class);

                if (edtCorreo.getText().toString().contains("@")&& edtContraseña.getText().length()>=4) {
                    Toast.makeText(Registro.this, "Cuenta creada con exito", Toast.LENGTH_SHORT).show();
                    editor.putString("Correo", edtCorreo.getText().toString());
                    editor.putString("Contrasenia",edtContraseña.getText().toString());
                    editor.commit();
                    startActivity(crear);


                }else if(!Patterns.EMAIL_ADDRESS.matcher(edtCorreo.getText()).matches()){
                    Toast.makeText(Registro.this, "Email incorrecto", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Registro.this, "Contraseña debe tener al menos 4 caracteres", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}
