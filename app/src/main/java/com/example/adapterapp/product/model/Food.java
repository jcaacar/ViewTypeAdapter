package com.example.adapterapp.product.model;

import androidx.annotation.DrawableRes;

public class Food {
    private String name;
    private int weight;
    private boolean vegan;
    private @DrawableRes int thumbRes;

    public Food(String name, int weight, boolean vegan, @DrawableRes int thumbRes) {
        this.name = name;
        this.weight = weight;
        this.vegan = vegan;
        this.thumbRes = thumbRes;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isVegan() {
        return vegan;
    }

    public int getThumbRes() {
        return thumbRes;
    }
}