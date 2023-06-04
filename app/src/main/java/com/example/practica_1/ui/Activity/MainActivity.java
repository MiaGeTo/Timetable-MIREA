package com.example.practica_1.ui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.FrameLayout;
import android.widget.Button;

import com.example.practica_1.ui.Fragment.FirstFragment;
import com.example.practica_1.R;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";//Тег - метка для сообщения
    int duration = Toast.LENGTH_SHORT;
    Button button_map, button_news, button_timetable;
    FrameLayout frameLayout;
    private void addFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setReorderingAllowed(true);
        fragmentTransaction.commit();
    }
    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().setReorderingAllowed(true);
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment firstFragment = new FirstFragment();
        addFragment(firstFragment);

    }

}