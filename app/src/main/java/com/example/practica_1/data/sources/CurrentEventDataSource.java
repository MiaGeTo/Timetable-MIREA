package com.example.practica_1.data.sources;

import com.example.practica_1.R;
import com.example.practica_1.data.resources.CurrentEventModel;

public class CurrentEventDataSource {
    private static final String[] info = {"Суббота"};
    private static final Integer[] images = {R.drawable.saturday};

    public static final CurrentEventModel[] consts = {
            new CurrentEventModel(R.drawable.monday,"Понедельник"),
            new CurrentEventModel(R.drawable.tuesday,"Вторник"),
            new CurrentEventModel(R.drawable.wednesday,"Среда"),
            new CurrentEventModel(R.drawable.thursday,"Четверг"),
            new CurrentEventModel(R.drawable.friday,"Пятница"),
            new CurrentEventModel(R.drawable.saturday,"Суббота"),
    };

    public static String getName(int index){
        return info[index];
    }

    public static Integer getImage(int index){
        return images[index];
    }
}