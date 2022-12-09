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

import com.example.nowfootball.databinding.FragmentPartido1Binding;

import de.hdodenhof.circleimageview.CircleImageView;

public class Partido1 extends Fragment {


    CircleImageView ImagenEquipoLocalC1;
    CircleImageView ImagenEquipoVisitanteC1;
    View dc;
    View mco;
    View por;

    View partido1Button;
    View partido2Button;
    View partido3Button;

    View viewTodosLosPartidos;


    NavController navController;

    private FragmentPartido1Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentPartido1Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ImagenEquipoLocalC1 = view.findViewById(R.id.ImagenEquipoLocalC1);
        ImagenEquipoVisitanteC1 = view.findViewById(R.id.ImagenEquipoVisitanteC1);

        dc = view.findViewById(R.id.dc);
        mco = view.findViewById(R.id.mco);
        por = view.findViewById(R.id.por);

        partido1Button = view.findViewById(R.id.partido1Button);
        partido2Button = view.findViewById(R.id.partido2Button);
        partido3Button = view.findViewById(R.id.partido3Button);

        viewTodosLosPartidos = view.findViewById(R.id.viewTodosLosPartidos);


        ImagenEquipoLocalC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        ImagenEquipoVisitanteC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador1);
            }
        });
        mco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador3);
            }
        });
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador4);
            }
        });

        partido1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        partido2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        partido3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        viewTodosLosPartidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.todosLosPartidosSel2);
            }
        });
    }
}