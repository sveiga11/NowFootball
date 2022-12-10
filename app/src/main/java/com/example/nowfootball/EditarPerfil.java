package com.example.nowfootball;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.nowfootball.databinding.FragmentCrearCuentaBinding;
import com.example.nowfootball.databinding.FragmentEditarPerfilBinding;
import com.skyfishjy.library.RippleBackground;

public class EditarPerfil extends Fragment {

    Button actualizarPerfil;
    NavController navController;

    private FragmentEditarPerfilBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentEditarPerfilBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);


        actualizarPerfil = view.findViewById(R.id.botonActualizarPerfil);

        /*actualizarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_editarPerfil_to_home);
            }
        });*/

        final RippleBackground rippleBackground=(RippleBackground) view.findViewById(R.id.content);
        ImageView imageView=(ImageView) view.findViewById(R.id.imagenVerificado);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rippleBackground.startRippleAnimation();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rippleBackground.stopRippleAnimation();
                    }
                },50000);
            }
        });

    }
}