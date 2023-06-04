package com.example.practica_1.ui.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.R;
import com.example.practica_1.databinding.FragmentSecondBinding;
import com.example.practica_1.ui.ViewModel.CurrentEventViewModel;
import com.example.practica_1.ui.ViewModel.TimetableViewModel;


public class SecondFragment extends Fragment {
    FragmentSecondBinding binding;
    TimetableViewModel timetableViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //timetableViewModel = new ViewModelProvider(this).get(TimetableViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }
}