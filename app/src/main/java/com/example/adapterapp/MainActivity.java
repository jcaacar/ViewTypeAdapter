package com.example.adapterapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapterapp.product.model.Food;
import com.example.adapterapp.product.model.Game;
import com.example.adapterapp.product.model.Smartphone;
import com.example.adapterapp.product.viewtype.FoodViewType;
import com.example.adapterapp.product.viewtype.GameViewType;
import com.example.adapterapp.product.viewtype.SmartphoneViewType;
import com.example.adapterapp.shared.adapter.ViewType;
import com.example.adapterapp.shared.adapter.ViewTypeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        ViewTypeAdapter adapter = new ViewTypeAdapter();
        adapter.setData(getData());

        RecyclerView recyclerView = findViewById(R.id.rcv_product);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<ViewType> getData() {
        List<ViewType> data = new ArrayList<>();

        data.add(new GameViewType(new Game("Fifa 2020", "Sports", "EA Sports", R.drawable.sports)));
        data.add(new FoodViewType(new Food("Hamburger", 500, true, R.drawable.hamburger)));
        data.add(new GameViewType(new Game("Puzzle", "Puzzle", "Supercell", R.drawable.puzzle)));
        data.add(new SmartphoneViewType(new Smartphone("Samsung Galaxy Note 10", "7.1 pol", "Black", R.drawable.galaxy_note)));
        data.add(new FoodViewType(new Food("Pizza", 800, false, R.drawable.pizza)));
        data.add(new SmartphoneViewType(new Smartphone("IPhone X", "6.4 pol", "White", R.drawable.iphone)));

        return data;
    }
}