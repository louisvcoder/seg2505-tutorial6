package com.example.simpleapplication;

// RecyclerView exercise developed with AI tutoring and scaffold assistance.
// Reference: https://developer.android.com/develop/ui/views/layout/recyclerview

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsAdapter
        extends RecyclerView.Adapter<ItemsAdapter.RowHolder> {

    private final String[] items;

    public ItemsAdapter(String[] items) {
        this.items = items;
    }


    static class RowHolder extends RecyclerView.ViewHolder {
        final TextView text;

        RowHolder(View row) {
            super(row);
            text = row.findViewById(android.R.id.text1);
        }
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new RowHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.text.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;

    }
}