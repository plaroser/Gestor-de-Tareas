package com.sergiopla.gestiontareas.Modelos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sergiopla.gestiontareas.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ivan on 23/11/2017.
 */

public class AdapterListarEquipos extends ArrayAdapter  {
    List<Equipo> equipos = new ArrayList<Equipo>();

    public AdapterListarEquipos(Context context, int textViewResourceId, ArrayList<Equipo> objects) {
        super(context, textViewResourceId,objects);
        equipos=objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    //************************************
    //Lanza un NullPointer en Linea 49 , nombreEquipos.setText(equipos.get(position).getNombre());
    //************************************

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View v =convertView;
        if(v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.content_listar_equipos, null);
        }
        TextView nombreEquipos = v.findViewById(R.id.tv_Nombre);
        nombreEquipos.setText(equipos.get(position).getNombre());
        return v;


    }
}
