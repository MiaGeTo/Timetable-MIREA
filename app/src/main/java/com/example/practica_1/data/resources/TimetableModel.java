package com.example.practica_1.data.resources;

public class TimetableModel {
    private String name;

    public TimetableModel() {
        name = "Basic";
    }

    public TimetableModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}