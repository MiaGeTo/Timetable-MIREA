package com.example.practica_1.ui.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.example.practica_1.data.repositories.TimetableRepository;

public class TimetableViewModel extends AndroidViewModel {
    private TimetableRepository mRepository;
    public TimetableViewModel (Application application) {
        super(application);
        mRepository = new TimetableRepository(application);
    }
    public void addNameAppSpecific(String day){
        mRepository.addNameAppSpecific(day);
    }
    public void addNameExternalStorage(String day){
        mRepository.addNameExternalStorage(day);
    }
    public void addNameSharedPreferences(String day){
        mRepository.addNameSharedPreferences(day);
    }
}