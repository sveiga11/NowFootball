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

import com.example.nowfootball.databinding.FragmentTopNewsBinding;
import com.google.android.material.imageview.ShapeableImageView;


public class TopNews extends Fragment {
    /*ShapeableImageView portadaNoticia1;
    ShapeableImageView portadaNoticia2;

    TextView tituloNoticia1;
    TextView tituloNoticia2;

    NavController navController;*/

    private FragmentTopNewsBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentTopNewsBinding.inflate(inflater, container, false)).getRoot();
    }

}