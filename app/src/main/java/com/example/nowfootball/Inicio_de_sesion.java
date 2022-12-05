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
import android.widget.Button;
import android.widget.TextView;

import com.example.nowfootball.databinding.FragmentInicioDeSesionBinding;

public class Inicio_de_sesion extends Fragment {
    Button botonInicioSesion2;
    TextView botonRecuperarContraseña;
    NavController navController;

    private FragmentInicioDeSesionBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentInicioDeSesionBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonInicioSesion2 = view.findViewById(R.id.boton_inicio_sesion2);
        botonRecuperarContraseña = view.findViewById(R.id.recuperar_contraseña);

        botonInicioSesion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.home);
            }
        });

        botonRecuperarContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.recuperarContrasena1);
            }
        });
    }
}