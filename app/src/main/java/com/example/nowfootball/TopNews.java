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
import android.widget.TextView;

import com.example.nowfootball.databinding.FragmentMisNoticiasBinding;
import com.example.nowfootball.databinding.FragmentNoticiasMarcadasBinding;
import com.example.nowfootball.databinding.FragmentTopNewsBinding;
import com.google.android.material.imageview.ShapeableImageView;


public class TopNews extends Fragment {
    ShapeableImageView portadaNoticia1;
    ShapeableImageView portadaNoticia2;

    TextView tituloNoticia1;
    TextView tituloNoticia2;

    NavController navController;

    private FragmentTopNewsBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentTopNewsBinding.inflate(inflater, container, false)).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);


        portadaNoticia1 = view.findViewById(R.id.portada_noticia1);
        portadaNoticia2 = view.findViewById(R.id.portada_noticia2);

        tituloNoticia1 = view.findViewById(R.id.titulo_noticia1);
        tituloNoticia2 = view.findViewById(R.id.titulo_noticia2);

        portadaNoticia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_home_to_noticia1);
            }
        });
        tituloNoticia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_home_to_noticia1);
            }
        });

        portadaNoticia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_home_to_noticia2);
            }
        });
        tituloNoticia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_home_to_noticia2);
            }
        });
    }
}