package com.example.nowfootball;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.nowfootball.MisNoticias;
import com.example.nowfootball.TopNews;
import com.example.nowfootball.databinding.FragmentSiguiendoBinding;
import com.example.nowfootball.databinding.HomeBinding;
import com.example.nowfootball.databinding.PartidosBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import de.hdodenhof.circleimageview.CircleImageView;

public class Bottom3Fragment extends Fragment {
    CircleImageView ImagenEquipoLocalC1;
    CircleImageView ImagenEquipoVisitanteC1;
    CircleImageView ImagenEquipoLocalC2;
    CircleImageView ImagenEquipoVisitanteC2;

    CircleImageView ImagenEquipoLocalD1;
    CircleImageView ImagenEquipoVisitanteD1;
    CircleImageView ImagenEquipoLocalD2;
    CircleImageView ImagenEquipoVisitanteD2;

    CircleImageView ImagenEquipoLocalE1;
    CircleImageView ImagenEquipoVisitanteE1;
    CircleImageView ImagenEquipoLocalE2;
    CircleImageView ImagenEquipoVisitanteE2;

    View viewPartidoC1;
    View viewPartidoC2;
    View viewPartidoD1;
    View viewPartidoD2;
    View viewPartidoE1;
    View viewPartidoE2;


    NavController navController;

    private PartidosBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = PartidosBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ImagenEquipoLocalC1 = view.findViewById(R.id.ImagenEquipoLocalC1);
        ImagenEquipoVisitanteC1 = view.findViewById(R.id.ImagenEquipoVisitanteC1);
        ImagenEquipoLocalC2 = view.findViewById(R.id.ImagenEquipoLocalC2);
        ImagenEquipoVisitanteC2 = view.findViewById(R.id.ImagenEquipoVisitanteC2);

        ImagenEquipoLocalD1 = view.findViewById(R.id.ImagenEquipoLocalD1);
        ImagenEquipoVisitanteD1 = view.findViewById(R.id.ImagenEquipoVisitanteD1);
        ImagenEquipoLocalD2 = view.findViewById(R.id.ImagenEquipoLocalD2);
        ImagenEquipoVisitanteD2 = view.findViewById(R.id.ImagenEquipoVisitanteD2);

        ImagenEquipoLocalE1 = view.findViewById(R.id.ImagenEquipoLocalE1);
        ImagenEquipoVisitanteE1 = view.findViewById(R.id.ImagenEquipoVisitanteE1);
        ImagenEquipoLocalE2 = view.findViewById(R.id.ImagenEquipoLocalE2);
        ImagenEquipoVisitanteE2 = view.findViewById(R.id.ImagenEquipoVisitanteE2);

        viewPartidoC1 = view.findViewById(R.id.viewPartidoC1);
        viewPartidoC2 = view.findViewById(R.id.viewPartidoC2);
        viewPartidoD1 = view.findViewById(R.id.viewPartidoD1);
        viewPartidoD2 = view.findViewById(R.id.viewPartidoD2);
        viewPartidoE1 = view.findViewById(R.id.viewPartidoE1);
        viewPartidoE2 = view.findViewById(R.id.viewPartidoE2);

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

        ImagenEquipoLocalC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        ImagenEquipoVisitanteC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        ImagenEquipoLocalD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        ImagenEquipoVisitanteD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        ImagenEquipoLocalD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        ImagenEquipoVisitanteD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        ImagenEquipoLocalE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        ImagenEquipoVisitanteE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });

        ImagenEquipoLocalE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion1);
            }
        });
        ImagenEquipoVisitanteE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.seleccion2);
            }
        });
        viewPartidoC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido1);
            }
        });
        viewPartidoC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido3);
            }
        });
        viewPartidoD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido4);
            }
        });
        viewPartidoD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido5);
            }
        });
        viewPartidoE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido22);
            }
        });
        viewPartidoE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_partidos_to_partido22);
            }
        });
    }
}