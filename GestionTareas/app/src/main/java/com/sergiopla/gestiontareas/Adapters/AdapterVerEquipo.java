package com.sergiopla.gestiontareas.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;
import com.sergiopla.gestiontareas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 28/11/2017.
 */

public class AdapterVerEquipo extends ArrayAdapter {

    List<Tarea> ListaTareas = new ArrayList<Tarea>();

    public AdapterVerEquipo(Context context, int textViewResourceId, ArrayList<Tarea> objects) {
        super(context, textViewResourceId, objects);
        ListaTareas = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_ver_equipo, null);
        Tarea tarea = ListaTareas.get(position);
        TextView tv_CabeceraTarea = item.findViewById(R.id.tv_Tarea);
        TextView tv_FechaInicio = item.findViewById(R.id.tv_FechaInicio);

        tv_CabeceraTarea.setText(tarea.getCabecera());
        tv_FechaInicio.setText(tarea.getFechaInicio());

        return item;


    }
}