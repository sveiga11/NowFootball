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

import com.example.nowfootball.databinding.FragmentClasificacionBinding;

public class Clasificacion extends Fragment {

    View primerClasificadoA;
    View segundoClasificadoA;
    View tercerClasificadoA;
    View cuartoClasificadoA;

    View primerClasificadoB;
    View segundoClasificadoB;
    View tercerClasificadoB;
    View cuartoClasificadoB;


    NavController navController;

    private FragmentClasificacionBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentClasificacionBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        primerClasificadoA = view.findViewById(R.id.primerClasificadoA);
        segundoClasificadoA = view.findViewById(R.id.segundoClasificadoA);
        tercerClasificadoA = view.findViewById(R.id.tercerClasificadoA);
        cuartoClasificadoA = view.findViewById(R.id.cuartoClasificadoA);

        primerClasificadoB = view.findViewById(R.id.primerClasificadoB);
        segundoClasificadoB = view.findViewById(R.id.segundoClasificadoB);
        tercerClasificadoB = view.findViewById(R.id.tercerClasificadoB);
        cuartoClasificadoB = view.findViewById(R.id.cuartoClasificadoB);

        primerClasificadoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        segundoClasificadoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        tercerClasificadoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        cuartoClasificadoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        primerClasificadoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        segundoClasificadoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        tercerClasificadoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        cuartoClasificadoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });

    }
}