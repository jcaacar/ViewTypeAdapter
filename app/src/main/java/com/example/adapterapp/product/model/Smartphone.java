package com.example.adapterapp.product.model;

import androidx.annotation.DrawableRes;

public class Smartphone {
    private String name;
    private String screen;
    private String color;
    private @DrawableRes int thumbRes;

    public Smartphone(String name, String screen, String color, @DrawableRes int thumbRes) {
        this.name = name;
        this.screen = screen;
        this.color = color;
        this.thumbRes = thumbRes;
    }

    public String getName() {
        return name;
    }

    public String getScreen() {
        return screen;
    }

    public String getColor() {
        return color;
    }

    public int getThumbRes() {
        return thumbRes;
    }
}