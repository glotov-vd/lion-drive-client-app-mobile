package com.example.LionDriveMobile.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.LionDriveMobile.CarItem;
import com.example.LionDriveMobile.CarsListAdapter;
import com.example.LionDriveMobile.R;
import com.example.LionDriveMobile.SearchSettingsAdapter;

public class HomeFragment extends Fragment {
    private View rootView;
    private RecyclerView carsListView;
    private CarsListAdapter carsListAdapter;
    private RecyclerView searchSettingsListView;
    private SearchSettingsAdapter searchSettingsListAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.rootView = inflater.inflate(R.layout.fragment_home, container, false);
        carsListView = rootView.findViewById(R.id.CarsList);
        carsListAdapter = new CarsListAdapter(this.rootView.getContext());

        // Говно-код
        CarItem car = new CarItem("BMW M440", 19000, R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        carsListAdapter.carsListItems.add(car);

        car = new CarItem("BMW M440", 122000, R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        carsListAdapter.carsListItems.add(car);

        car = new CarItem("BMW M440", 19000, R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        car.ImageResources.add(R.drawable.bmw_m440);
        carsListAdapter.carsListItems.add(car);

        car = new CarItem("Mercedes G63", 13000, R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        carsListAdapter.carsListItems.add(car);

        car = new CarItem("Mercedes G63", 167000, R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        carsListAdapter.carsListItems.add(car);

        car = new CarItem("Mercedes G63", 112000, R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        car.ImageResources.add(R.drawable.mercedes_g63);
        carsListAdapter.carsListItems.add(car);

        //__________________________________

        carsListView.setAdapter(carsListAdapter);

        searchSettingsListView = rootView.findViewById(R.id.SearchSettingsList);
        searchSettingsListAdapter = new SearchSettingsAdapter();
        searchSettingsListView.setAdapter(searchSettingsListAdapter);

        return this.rootView;
    }

}