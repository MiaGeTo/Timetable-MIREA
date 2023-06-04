package com.example.practica_1.data.sources;

import android.content.Context;
import android.content.SharedPreferences;
public class SharedPreferencesTimetableDataSource {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesTimetableDataSource(Context context) {
        sharedPreferences = context.getSharedPreferences("day", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void addNameSharedPreferences(String day) {
        editor.putString("day", day);
        editor.apply();
    }

    public String getDay(String day) {
        return sharedPreferences.getString(day, "Base_day");
    }
}
