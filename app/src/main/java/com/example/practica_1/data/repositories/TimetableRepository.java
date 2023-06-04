package com.example.practica_1.data.repositories;

import android.content.Context;

import com.example.practica_1.data.sources.AppSpecificStorageTimetableDataSource;
import com.example.practica_1.data.sources.ExternalStorageTimetableDataSource;
import com.example.practica_1.data.sources.SharedPreferencesTimetableDataSource;

public class TimetableRepository {
    private AppSpecificStorageTimetableDataSource appSpecificStorageDayDataSource;
    private ExternalStorageTimetableDataSource externalStorageTimetableDataSource;
    private SharedPreferencesTimetableDataSource sharedPreferencesTimetableDataSource;

    public TimetableRepository(Context context) {
        appSpecificStorageDayDataSource = new AppSpecificStorageTimetableDataSource(context);
        externalStorageTimetableDataSource = new ExternalStorageTimetableDataSource(context);
        sharedPreferencesTimetableDataSource = new SharedPreferencesTimetableDataSource(context);
    }

    public void addNameAppSpecific(String day) {
        appSpecificStorageDayDataSource.addDayAppSpecific(day);
    }

    public void addNameExternalStorage(String day) {
        externalStorageTimetableDataSource.addNameExternalStorage(day);
    }

    public void addNameSharedPreferences(String region) {
        sharedPreferencesTimetableDataSource.addNameSharedPreferences(region);
    }

    public String getRegion(String day) {
        return sharedPreferencesTimetableDataSource.getDay(day);
    }
}