package com.example.nowfootball;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nowfootball.databinding.FragmentEstadisticasSeleccion1Binding;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class EstadisticasSeleccion1 extends Fragment {

    private FragmentEstadisticasSeleccion1Binding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentEstadisticasSeleccion1Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PieChart mPieChart = (PieChart) view.findViewById(R.id.graficoPartidos);

        mPieChart.addPieSlice(new PieModel("Empatados", 2, Color.parseColor("#FED70E")));
        mPieChart.addPieSlice(new PieModel("Ganados", 1 , Color.parseColor("#00FF19")));
        mPieChart.addPieSlice(new PieModel("Perdidos", 1, Color.parseColor("#FF1605")));

        mPieChart.startAnimation();
    }
}