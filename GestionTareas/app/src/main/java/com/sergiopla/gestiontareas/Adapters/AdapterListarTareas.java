package com.sergiopla.gestiontareas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sergiopla.gestiontareas.Modelos.Tarea;
import com.sergiopla.gestiontareas.R;

import java.util.List;

/**
 * Created by Sergio Pla on 11/25/17.
 */

public class AdapterListarTareas extends ArrayAdapter<Tarea> {
    private List<Tarea> listaTareas;

    public AdapterListarTareas(@NonNull Context context, int resource, List listaTareas) {
        super(context, resource);
        this.listaTareas = listaTareas;
    }

    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_tarea, null);
        Tarea tarea = listaTareas.get(position);
        TextView tVNombreTarea = item.findViewById(R.id.tVNombreTareaItemTarea);
        TextView tVNombreEquipo = item.findViewById(R.id.tVNombreEquipoItemTarea);

        tVNombreTarea.setText(tarea.getCabecera());
        tVNombreEquipo.setText(tarea.getEquipo().getNombre());

        return item;
    }
}
