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

import com.example.nowfootball.databinding.FragmentListaJugadoresTopBinding;


public class Lista_jugadores_top extends Fragment {


    View viewMessi;
    View viewCR7;
    View viewBenzema;
    View viewModric;

    NavController navController;

    private FragmentListaJugadoresTopBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentListaJugadoresTopBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        viewMessi = view.findViewById(R.id.viewMessi);
        viewCR7 = view.findViewById(R.id.viewCR7);
        viewBenzema = view.findViewById(R.id.viewBenzema);
        viewModric = view.findViewById(R.id.viewModric);


        viewMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador3);
            }
        });

        viewCR7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador1);
            }
        });
        viewBenzema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador2);
            }
        });
        viewModric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.jugador4);
            }
        });
    }
}