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

public class AdapterVerEquipo extends ArrayAdapter<Tarea> {
    List<Tarea> tareas = new ArrayList<Tarea>();

    public AdapterVerEquipo(Context context, ArrayList<Tarea> objects) {
        super(context, 0, objects);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ///v = inflater.inflate(Mylayout, null);

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_ver_equipo, parent, false);
        }

        TextView tv_CabeceraTarea = convertView.findViewById(R.id.tv_Tarea);
        tv_CabeceraTarea.setText(tareas.get(position).getCabecera());



        return convertView;


    }
}