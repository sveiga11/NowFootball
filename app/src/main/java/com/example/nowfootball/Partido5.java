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

import com.example.nowfootball.databinding.FragmentPartido5Binding;

import de.hdodenhof.circleimageview.CircleImageView;

public class Partido5 extends Fragment {


    CircleImageView ImagenEquipoLocalC1;
    CircleImageView ImagenEquipoVisitanteC1;

    NavController navController;

    private FragmentPartido5Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentPartido5Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ImagenEquipoLocalC1 = view.findViewById(R.id.ImagenEquipoLocalC1);
        ImagenEquipoVisitanteC1 = view.findViewById(R.id.ImagenEquipoVisitanteC1);

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
    }
}