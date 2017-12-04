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

import static com.sergiopla.gestiontareas.R.layout.activity_listar_equipos;
import static com.sergiopla.gestiontareas.R.layout.items_listar_equipos;

/**
 * Created by ivan on 23/11/2017.
 */

public class AdapterListarEquipos extends ArrayAdapter  {
    List<Equipo> equipos = new ArrayList<Equipo>();
    int Mylayout;

    public AdapterListarEquipos(Context context, int textViewResourceId, ArrayList<Equipo> objects) {
        super(context, textViewResourceId,objects);
        equipos=objects;
        Mylayout=textViewResourceId;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        //View v =convertView;
        if(convertView == null) {
            // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ///v = inflater.inflate(Mylayout, null);

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items_listar_equipos, parent, false);
        }
        TextView nombreEquipos = convertView.findViewById(R.id.tv_Nombre);
        nombreEquipos.setText(equipos.get(position).getNombre());
        return convertView;


    }


}
