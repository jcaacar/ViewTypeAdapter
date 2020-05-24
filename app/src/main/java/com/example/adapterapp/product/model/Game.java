package com.example.adapterapp.product.model;

import androidx.annotation.DrawableRes;

public class Game {
    private String title;
    private String category;
    private String company;
    private @DrawableRes int thumbRes;

    public Game(String title, String category, String company, @DrawableRes int thumbRes) {
        this.title = title;
        this.category = category;
        this.company = company;
        this.thumbRes = thumbRes;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getCompany() {
        return company;
    }

    public int getThumbRes() {
        return thumbRes;
    }
}