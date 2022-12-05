package com.example.nowfootball;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nowfootball.databinding.FragmentTemporadaSeleccion1Binding;


public class TemporadaSeleccion1 extends Fragment {
    View primerClasificadoE;
    View segundoClasificadoE;
    View tercerClasificadoE;
    View cuartoClasificadoE;

    View viewTodasLasClasificaciones;
    View viewTodosLosPartidos;

    View partido1;
    View partido2;
    View partido3;

    NavController navController;

    private FragmentTemporadaSeleccion1Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentTemporadaSeleccion1Binding.inflate(inflater, container, false)).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);


        primerClasificadoE = view.findViewById(R.id.primerClasificadoE);
        segundoClasificadoE = view.findViewById(R.id.segundoClasificadoE);
        tercerClasificadoE = view.findViewById(R.id.tercerClasificadoE);
        cuartoClasificadoE = view.findViewById(R.id.cuartoClasificadoE);

        viewTodasLasClasificaciones = view.findViewById(R.id.viewTodasLasClasificaciones);
        viewTodosLosPartidos = view.findViewById(R.id.viewTodosLosPartidos);

        partido1 = view.findViewById(R.id.partido1Button);
        partido2 = view.findViewById(R.id.partido1Button);
        partido3 = view.findViewById(R.id.partido1Button);

        primerClasificadoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        segundoClasificadoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        tercerClasificadoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        cuartoClasificadoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        viewTodasLasClasificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.clasificacion);
            }
        });
        viewTodosLosPartidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.todosLosPartidosSel1);
            }
        });

        partido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.partido2Button);
            }
        });
        partido2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.partido2Button);
            }
        });
        partido3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.partido2Button);
            }
        });
    }
}