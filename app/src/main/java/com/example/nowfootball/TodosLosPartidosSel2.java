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

import com.example.nowfootball.databinding.FragmentTodosLosPartidosSel1Binding;
import com.example.nowfootball.databinding.FragmentTodosLosPartidosSel2Binding;

import de.hdodenhof.circleimageview.CircleImageView;

public class TodosLosPartidosSel2 extends Fragment {

    View viewPartido1;
    CircleImageView imagenEquipoLocal;
    CircleImageView imagenEquipoVisitante;

    NavController navController;

    private FragmentTodosLosPartidosSel2Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentTodosLosPartidosSel2Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        viewPartido1 = view.findViewById(R.id.viewPartido1);
        imagenEquipoLocal = view.findViewById(R.id.ImagenEquipoLocal1);
        imagenEquipoVisitante = view.findViewById(R.id.ImagenEquipoVisitante1);

        viewPartido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.partido1Button);
            }
        });
        imagenEquipoLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        imagenEquipoVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });

    }
}