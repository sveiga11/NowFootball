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
import com.example.nowfootball.databinding.FragmentVerificarCuentaBinding;

public class VerificarCuenta extends Fragment {


    ImageButton botonAtras;
    ImageButton botonSiguiente;
    NavController navController;

    private FragmentVerificarCuentaBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentVerificarCuentaBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonAtras = view.findViewById(R.id.boton_atras);
        botonSiguiente = view.findViewById(R.id.boton_siguiente);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_verificarCuenta_to_crearCuenta);
            }
        });

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.home);
            }
        });
    }
}