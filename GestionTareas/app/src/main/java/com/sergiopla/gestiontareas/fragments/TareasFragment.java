package com.sergiopla.gestiontareas.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sergiopla.gestiontareas.Adapters.AdapterListarTareas;
import com.sergiopla.gestiontareas.Modelos.Equipo;
import com.sergiopla.gestiontareas.Modelos.Tarea;
import com.sergiopla.gestiontareas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergioPla on 11/23/17.
 */

public class TareasFragment extends Fragment {
    ListView lVTareas;
    ArrayList<Tarea> listaTareas;
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TareasFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TareasFragment newInstance() {
        TareasFragment fragment = new TareasFragment();
//        Bundle args = new Bundle();
//        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inicializarLista();
        View view = inflater.inflate(R.layout.fragment_tareas, container, false);
        lVTareas = view.findViewById(R.id.lVTareas);
        AdapterListarTareas adapterListarTareas = new AdapterListarTareas(getActivity().getApplicationContext(), R.layout.item_tarea, listaTareas);
        Log.d("Longitud del adaptador", String.valueOf(adapterListarTareas.getCount()));
        lVTareas.setAdapter(adapterListarTareas);

        return view;
    }

    private void inicializarLista() {
        listaTareas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Equipo equipo = new Equipo("Equipo " + i, "Departamento " + i);
            Tarea tarea = new Tarea("Tarea " + i, equipo);
            listaTareas.add(tarea);
        }
    }
}

