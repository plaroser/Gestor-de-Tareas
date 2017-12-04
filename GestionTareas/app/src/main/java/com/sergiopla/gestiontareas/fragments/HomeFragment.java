package com.sergiopla.gestiontareas.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sergiopla.gestiontareas.CrearTarea;
import com.sergiopla.gestiontareas.HomeActivity;
import com.sergiopla.gestiontareas.R;
import com.sergiopla.gestiontareas.VerEquipoActivity;

/**
 * Created by SergioPla on 11/23/17.
 */

public class HomeFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    Button crearTarea;
    Button verEquipos;

    public HomeFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
//        Bundle args = new Bundle();
//        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        crearTarea=(Button) rootView.findViewById(R.id.btnCrearTarea);
        crearTarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearTarea= new Intent (getActivity(), CrearTarea.class);
                startActivity(crearTarea);
            }
        });

        verEquipos=(Button) rootView.findViewById(R.id.btnVerEquipos);
        verEquipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verEquipos = new Intent (getActivity(),VerEquipoActivity.class);
                startActivity(verEquipos);
            }
        });
        return rootView;
    }
}

