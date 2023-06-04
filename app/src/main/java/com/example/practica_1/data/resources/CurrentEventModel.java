package com.example.practica_1.data.resources;

public class CurrentEventModel {
    private final int group;
    private final String info;

    public CurrentEventModel(int group, String info) {
        this.group = group;
        this.info = info;
    }

    public int getGroup() {
        return group;
    }

    public String getInfo() {
        return info;
    }
}
