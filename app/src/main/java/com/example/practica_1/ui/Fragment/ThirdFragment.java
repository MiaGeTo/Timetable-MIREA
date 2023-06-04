package com.example.practica_1.ui.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.practica_1.R;
import com.example.practica_1.databinding.FragmentThirdBinding;
import com.example.practica_1.ui.Adapter.CustomViewListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThirdFragment extends Fragment {
    String TAG = "Fragment 3";

    FragmentThirdBinding binding;
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Random random = new Random();
        List<String> Groups = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int num = random.nextInt(700);
            Groups.add("Группа ИКБО-" + i + "-23");
        }
        Log.i("GroupsCreated",Groups.size()+"A");
        CustomViewListAdapter viewListAdapter = new CustomViewListAdapter(binding.getRoot().getContext(), R.layout.vlist_orig,Groups);
        binding.vlist.setAdapter(viewListAdapter);
        binding.vlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(),Groups.get(i),Toast.LENGTH_SHORT).show();
                Log.i(TAG,Groups.get(i)+" pressed");
            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

}