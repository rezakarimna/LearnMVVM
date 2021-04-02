package com.learnmvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.learnmvvm.R;
import com.learnmvvm.databinding.ItemRecyclerviewBinding;
import com.learnmvvm.model.Users;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MyViewHolder> {
    Context context;
    List<Users> data ;

    public AdapterRecyclerView(Context context, List<Users> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecyclerviewBinding itemRecyclerviewBinding = DataBindingUtil.inflate(LayoutInflater.from(context) , R.layout.item_recyclerview , parent, false);
        return new MyViewHolder(itemRecyclerviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemRecyclerviewBinding.setUsers(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ItemRecyclerviewBinding itemRecyclerviewBinding;

        public MyViewHolder(@NonNull ItemRecyclerviewBinding itemRecyclerviewBinding) {
            super(itemRecyclerviewBinding.getRoot());
            this.itemRecyclerviewBinding = itemRecyclerviewBinding;
        }
    }
}
