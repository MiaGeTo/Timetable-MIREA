package com.example.practica_1.data.sources;

import android.content.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppSpecificStorageTimetableDataSource {
    private File app_specific_storage_file;

    public AppSpecificStorageTimetableDataSource(Context context) {
        File app_specific_directory = context.getFilesDir();
        app_specific_storage_file = new File(app_specific_directory, "Days.txt");
    }

    public void addDayAppSpecific(String day){
        try {
            FileWriter writer = new FileWriter(app_specific_storage_file);
            writer.write(day);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}