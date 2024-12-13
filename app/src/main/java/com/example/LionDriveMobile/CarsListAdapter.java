package com.example.LionDriveMobile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarsListAdapter extends RecyclerView.Adapter<CarsListAdapter.ViewHolder> {

    public List<CarItem> carsListItems = new ArrayList<CarItem>();

    private Context context;

    public CarsListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car_card, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(CarsListAdapter.ViewHolder holder, int position) {
        CarItem carCardItem = carsListItems.get(position);
        holder.carImageView.setImageResource(carCardItem.getMainImageResource());
        holder.modelDataView.setText(carCardItem.getModel());
        holder.priceDataView.setText(String.format("%d ₽/сутки", carCardItem.getPrice()));
        holder.carImageView.setOnClickListener(v -> {
            Intent intent = new Intent(this.context, CarDetailsCardActivity.class);
            intent.putExtra("car_item", carCardItem);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return carsListItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageButton carImageView;
        final TextView modelDataView, priceDataView;
        ViewHolder(View view){
            super(view);
            carImageView = view.findViewById(R.id.Car);
            modelDataView = view.findViewById(R.id.Model);
            priceDataView = view.findViewById(R.id.Price);
        }
    }
}