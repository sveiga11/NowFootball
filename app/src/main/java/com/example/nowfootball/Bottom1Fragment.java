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
import android.widget.CheckBox;
import android.widget.ImageButton;

import com.example.nowfootball.databinding.DescubrirBinding;
import com.example.nowfootball.databinding.FragmentCrearCuentaBinding;
import com.google.android.material.imageview.ShapeableImageView;

import de.hdodenhof.circleimageview.CircleImageView;


public class Bottom1Fragment extends Fragment {

    ImageButton botonCocacaf;
    ImageButton botonConmebol;
    ImageButton botonUefa;
    ImageButton botonCaf;
    ImageButton botonAfc;

    ImageButton botonAz;
    ImageButton botonRanking;
    ImageButton botonTopJugadores;
    ImageButton botonJovenes;

    ShapeableImageView botonAlemaniaAz;
    ShapeableImageView botonBrasilTop;
    CircleImageView botonMessi;
    CircleImageView botonRodrygo;

    NavController navController;

    private DescubrirBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = DescubrirBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonAfc = view.findViewById(R.id.listaAfc);
        botonCaf = view.findViewById(R.id.listaCaf);
        botonCocacaf = view.findViewById(R.id.listaConcacaf);
        botonConmebol = view.findViewById(R.id.listaConmebol);
        botonUefa = view.findViewById(R.id.listaUefa);

        botonAz = view.findViewById(R.id.botonAz);
        botonRanking = view.findViewById(R.id.botonRanking);
        botonTopJugadores = view.findViewById(R.id.botonTopJugadores);
        botonJovenes = view.findViewById(R.id.botonJovenes);

        botonAlemaniaAz = view.findViewById(R.id.botonAlemaniaAZ);
        botonBrasilTop = view.findViewById(R.id.botonBrasilTop);
        botonMessi = view.findViewById(R.id.botonMessi);
        botonRodrygo = view.findViewById(R.id.botonRodrygo);


        botonAfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaAfc);
            }
        });

        botonCaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaCaf);
            }
        });
        botonCocacaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaConcacaf);
            }
        });
        botonConmebol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaConmebol);
            }
        });
        botonUefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaUefa);
            }
        });
        botonAz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaA_Z);
            }
        });
        botonRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.lista_ranking_selecciones);
            }
        });
        botonTopJugadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.lista_jugadores_top);
            }
        });
        botonJovenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaJovenesPromesas);
            }
        });
        botonAlemaniaAz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        botonBrasilTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        botonMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador3);
            }
        });
        botonRodrygo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador1);
            }
        });
    }
}