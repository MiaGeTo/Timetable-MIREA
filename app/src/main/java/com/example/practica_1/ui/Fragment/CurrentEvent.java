package com.example.practica_1.ui.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practica_1.R;
import com.example.practica_1.ui.ViewModel.CurrentEventViewModel;

public class CurrentEvent extends Fragment {

    private CurrentEventViewModel mViewModel;

    private Button currentBtn;
    private ImageView currentImg;
    private TextView currentText;
    public static CurrentEvent newInstance() {
        return new CurrentEvent();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.current_event_fragment, container, false);

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        currentBtn = view.findViewById(R.id.current_btn);
        currentImg = view.findViewById(R.id.current_img);
        currentText = view.findViewById(R.id.current_text);

        mViewModel = new ViewModelProvider(this).get(CurrentEventViewModel.class);
        mViewModel.getCurrentEvent().observe(getViewLifecycleOwner(), currentEvent -> {
            currentImg.setImageResource(mViewModel.getI().getGroup());
            currentText.setText(mViewModel.getI().getInfo());
        });

        currentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.nextDay();
            }
        });
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CurrentEventViewModel.class);
        // TODO: Use the ViewModel
    }

}