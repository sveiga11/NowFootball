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

import com.example.nowfootball.databinding.FragmentListaConcacafBinding;
import com.example.nowfootball.databinding.FragmentListaConmebolBinding;


public class ListaConmebol extends Fragment {

    View viewArgentina;
    View viewSeleccionador;
    View viewEcuador;
    View viewUruguay;

    NavController navController;

    private FragmentListaConmebolBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentListaConmebolBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        viewArgentina = view.findViewById(R.id.viewArgentina);
        viewSeleccionador = view.findViewById(R.id.viewSeleccionador);
        viewEcuador = view.findViewById(R.id.viewEcuador);
        viewUruguay = view.findViewById(R.id.viewUruguay);


        viewArgentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        viewSeleccionador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        viewEcuador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        viewUruguay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
    }
}