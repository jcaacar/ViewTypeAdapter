package com.example.adapterapp.product.viewtype;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.graphics.drawable.DrawableCompat;

import com.example.adapterapp.R;
import com.example.adapterapp.product.model.Food;
import com.example.adapterapp.shared.adapter.ViewType;

public class FoodViewType implements ViewType<Food>, View.OnClickListener {

    private Food food;

    public FoodViewType(Food food) {
        this.food = food;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_food_layout;
    }

    @Override
    public void bind(View itemView) {
        ImageView thumb = itemView.findViewById(R.id.imv_thumb);
        TextView name = itemView.findViewById(R.id.txv_name);
        ImageView veganCheck = itemView.findViewById(R.id.img_vegan);
        TextView weight = itemView.findViewById(R.id.txv_weight);

        thumb.setImageResource(food.getThumbRes());
        name.setText(food.getName());

        int veganColor = food.isVegan() ? Color.GREEN : Color.RED;
        Drawable drawable = veganCheck.getDrawable().mutate();
        Drawable wrapped = DrawableCompat.wrap(drawable);
        wrapped.setTint(veganColor);

        weight.setText(String.valueOf(food.getWeight()));
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Clicked on " + food.getName(), Toast.LENGTH_SHORT).show();
    }
}
