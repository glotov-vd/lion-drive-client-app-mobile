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
        this.searchSettings.add(new SearchSetting("All cars", R.drawable.ic_menu_camera));
        this.searchSettings.add(new SearchSetting("Filter", R.drawable.ic_menu_camera));
        this.searchSettings.add(new SearchSetting("Sorting", R.drawable.ic_menu_camera));
        this.searchSettings.add(new SearchSetting("Dates", R.drawable.ic_menu_camera));
        this.searchSettings.add(new SearchSetting("Sales", R.drawable.ic_menu_camera));
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
