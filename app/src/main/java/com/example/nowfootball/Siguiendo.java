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

import com.example.nowfootball.databinding.FragmentCrearCuentaBinding;
import com.example.nowfootball.databinding.FragmentSiguiendoBinding;

import de.hdodenhof.circleimageview.CircleImageView;


public class Siguiendo extends Fragment {

    CircleImageView botonSeleccion;
    CircleImageView botonJugador;

    ImageButton botonGrupo;
    ImageButton botonAñadirSelecciones;
    ImageButton botonAñadirJugador;

    NavController navController;

    private FragmentSiguiendoBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentSiguiendoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonSeleccion = view.findViewById(R.id.botonSeleccion);
        botonJugador = view.findViewById(R.id.botonJugador);
        botonGrupo = view.findViewById(R.id.botonGrupo);

        botonAñadirSelecciones = view.findViewById(R.id.botonAñadirSelecciones);
        botonAñadirJugador = view.findViewById(R.id.botonAñadirJugadores);

        botonSeleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });

        botonJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador1);
            }
        });
        botonGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.clasificacion);
            }
        });

        botonAñadirSelecciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.listaA_Z);
            }
        });
        botonAñadirJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.lista_jugadores_top);
            }
        });
    }
}