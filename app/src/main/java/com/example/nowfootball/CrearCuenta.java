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
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.nowfootball.databinding.FragmentCrearCuentaBinding;
import com.example.nowfootball.databinding.FragmentInicioDeSesionBinding;

public class CrearCuenta extends Fragment {

    CheckBox checkBox1, checkBox2;

    ImageButton botonAtras;
    ImageButton botonSiguiente;
    NavController navController;

    private FragmentCrearCuentaBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentCrearCuentaBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        checkBox1 = (CheckBox) view.findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) view.findViewById(R.id.checkbox2);

        botonAtras = view.findViewById(R.id.boton_atras);
        botonSiguiente = view.findViewById(R.id.boton_siguiente);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_crearCuenta_to_opcion_de_inicio);
            }
        });

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_crearCuenta_to_verificarCuenta);
            }
        });
    }
}