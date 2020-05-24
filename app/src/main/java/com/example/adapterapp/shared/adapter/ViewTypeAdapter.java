package com.example.adapterapp.shared.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewTypeAdapter extends RecyclerView.Adapter<ViewTypeAdapter.ViewTypeHolder> {

    private List<ViewType> data = new ArrayList<>();

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getLayoutId();
    }

    @NonNull
    @Override
    public ViewTypeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewTypeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewTypeHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<ViewType> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public static class ViewTypeHolder extends RecyclerView.ViewHolder {

        public ViewTypeHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(ViewType item) {
            item.bind(itemView);
            if(item instanceof View.OnClickListener) {
                itemView.setOnClickListener((View.OnClickListener)item);
            }
        }
    }
}