package com.sergiopla.gestiontareas.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sergiopla.gestiontareas.Modelos.Tarea;
import com.sergiopla.gestiontareas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 28/11/2017.
 */

public class AdapterVerEquipo extends ArrayAdapter<Tarea> {
    List<Tarea> tareas;

    public AdapterVerEquipo(Context context, ArrayList<Tarea> tareas) {
        super(context, 0, tareas);
        this.tareas = tareas;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null)
            v = LayoutInflater.from(getContext()).inflate(R.layout.item_ver_equipo, parent, false);

        TextView tv_CabeceraTarea = v.findViewById(R.id.tv_Tarea);
        TextView tv_FechaInicio = v.findViewById(R.id.tv_FechaInicio);
        tv_FechaInicio.setText(tareas.get(position).getFechaInicio().toString());
        tv_CabeceraTarea.setText(tareas.get(position).getCabecera());

        return v;
    }
}