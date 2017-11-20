package com.example.alber.ejemplolog;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(Environment.DIRECTORY_PICTURES,"Environment.DIRECTORY_PICTURES");
        Log.d(String.valueOf(getExternalFilesDir(Environment.DIRECTORY_PICTURES)),"String.valueOf(getExternalFilesDir(Environment.DIRECTORY_PICTURES)");
        Log.d(String.valueOf(Environment.getExternalStorageDirectory()),"String.valueOf(Environment.getExternalStorageDirectory()");
        Log.d(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)),"Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)\n");
    }
}
