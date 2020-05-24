package com.example.adapterapp.product.viewtype;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapterapp.R;
import com.example.adapterapp.product.model.Game;
import com.example.adapterapp.shared.adapter.ViewType;

public class GameViewType implements ViewType<Game> {

    private Game game;

    public GameViewType(Game game) {
        this.game = game;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_game_layout;
    }

    @Override
    public void bind(View itemView) {
        ImageView thumb = itemView.findViewById(R.id.imv_thumb);
        TextView name = itemView.findViewById(R.id.txv_name);
        TextView category = itemView.findViewById(R.id.txv_category);
        TextView company = itemView.findViewById(R.id.txv_company);

        thumb.setImageResource(game.getThumbRes());
        name.setText(game.getTitle());
        category.setText(game.getCategory());
        company.setText(game.getCompany());
    }
}