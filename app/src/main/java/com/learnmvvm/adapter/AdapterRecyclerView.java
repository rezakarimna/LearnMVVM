package com.learnmvvm.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learnmvvm.databinding.ItemRecyclerviewBinding;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MyViewHolder> {
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ItemRecyclerviewBinding itemRecyclerviewBinding;

        public MyViewHolder(@NonNull ItemRecyclerviewBinding itemRecyclerviewBinding) {
            super(itemRecyclerviewBinding.getRoot());
            this.itemRecyclerviewBinding = itemRecyclerviewBinding;
        }
    }
}
