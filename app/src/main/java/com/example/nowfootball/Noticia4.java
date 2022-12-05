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

import com.example.nowfootball.databinding.FragmentNoticia1Binding;
import com.example.nowfootball.databinding.FragmentNoticia4Binding;

public class Noticia4 extends Fragment {
    View viewMencionSeleccion;
    View viewMencionjugador;

    NavController navController;

    private FragmentNoticia4Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentNoticia4Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        viewMencionSeleccion = view.findViewById(R.id.viewMencionSeleccion);
        viewMencionjugador = view.findViewById(R.id.viewMencionjugador);

        viewMencionSeleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        viewMencionjugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador1);
            }
        });
    }
}