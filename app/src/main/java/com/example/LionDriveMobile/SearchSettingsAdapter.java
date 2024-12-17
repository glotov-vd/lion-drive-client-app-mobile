package com.example.LionDriveMobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchSettingsAdapter extends RecyclerView.Adapter<SearchSettingsAdapter.ViewHolder> {
    private List<SearchSetting> searchSettings = new ArrayList<SearchSetting>();

    public SearchSettingsAdapter() {
        this.searchSettings.add(new SearchSetting("Фильтр", R.drawable.filter_icon));
        this.searchSettings.add(new SearchSetting("Сортировка", R.drawable.sort_icon));
        this.searchSettings.add(new SearchSetting("Типы авто", R.drawable.car_icon));
        this.searchSettings.add(new SearchSetting("Даты", R.drawable.dates_icon));
        this.searchSettings.add(new SearchSetting("Скидки", R.drawable.sale_icon));
    }

    @NonNull
    @Override
    public SearchSettingsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_setting, parent, false);
        return new SearchSettingsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchSettingsAdapter.ViewHolder holder, int position) {
        SearchSetting searchSetting = searchSettings.get(position);
        holder.settingButton.setText(searchSetting.getName());
        holder.settingButton.setCompoundDrawablesWithIntrinsicBounds(searchSetting.getIconResource(), 0, 0, 0);
    }

    @Override
    public int getItemCount() {
        return searchSettings.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final Button settingButton;
        ViewHolder(View view){
            super(view);
            settingButton = view.findViewById(R.id.SettingButton);
        }
    }
}
