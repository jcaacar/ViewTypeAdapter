package com.example.adapterapp.product.viewtype;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapterapp.R;
import com.example.adapterapp.product.model.Smartphone;
import com.example.adapterapp.shared.adapter.ViewType;

public class SmartphoneViewType implements ViewType<Smartphone> {

    private Smartphone smartphone;

    public SmartphoneViewType(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_smartphone_layout;
    }

    @Override
    public void bind(final View itemView) {
        ImageView thumb = itemView.findViewById(R.id.imv_thumb);
        TextView name = itemView.findViewById(R.id.txv_name);
        TextView screen = itemView.findViewById(R.id.txv_screen);
        TextView color = itemView.findViewById(R.id.txv_color);

        thumb.setImageResource(smartphone.getThumbRes());
        name.setText(smartphone.getName());
        screen.setText(smartphone.getScreen());
        color.setText(smartphone.getColor());
    }
}