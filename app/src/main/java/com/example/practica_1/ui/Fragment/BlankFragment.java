package com.example.practica_1.ui.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.databinding.FragmentBlankBinding;
import com.example.practica_1.ui.Adapter.CustomRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlankFragment extends Fragment {
    String TAG = "Fragment Blank";

    FragmentBlankBinding binding;
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Random random = new Random();
        List<String> Groups = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int num = random.nextInt(700);
            Groups.add("Группа ИКБО-" + i + "-23");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        binding.rview.setLayoutManager(linearLayoutManager);

        CustomRecyclerViewAdapter customRecyclerViewAdapter = new CustomRecyclerViewAdapter(getLayoutInflater(),Groups, getContext());
        binding.rview.setAdapter(customRecyclerViewAdapter);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

}