package com.example.adapterapp.shared.adapter;

import android.view.View;

public interface ViewType<T> {
    int getLayoutId();
    void bind(View view);
}