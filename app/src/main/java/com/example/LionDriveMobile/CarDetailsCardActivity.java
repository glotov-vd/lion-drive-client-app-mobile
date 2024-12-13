package com.example.LionDriveMobile;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

public class CarDetailsCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details_card);

        Toolbar toolbar = findViewById(R.id.toolbar_car_card);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(this::onBackClick);

        CarItem carItem = getIntent().getParcelableExtra("car_item");
        toolbar.setTitle(carItem.getModel());

        ViewPager2 carPhotosView = findViewById(R.id.car_photos);
        PhotoAdapter adapter = new PhotoAdapter(this, carItem.ImageResources);
        carPhotosView.setAdapter(adapter);
    }

    public void onBackClick(View view) {
        this.finish();
    }
}