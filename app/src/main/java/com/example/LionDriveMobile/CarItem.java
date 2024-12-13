package com.example.LionDriveMobile;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CarItem implements Parcelable {
    public List<Integer> ImageResources = new ArrayList<>();
    private String model;
    private Integer price;
    private Integer mainImageResource;
    public CarItem(String model, Integer price, Integer image) {
        this.model = model;
        this.price = price;
        this.mainImageResource = image;
    }

    protected CarItem(Parcel in) {
        model = in.readString();
        price = in.readInt();
        mainImageResource = in.readInt();
        in.readList(ImageResources, Integer.class.getClassLoader());
    }

    public static final Creator<CarItem> CREATOR = new Creator<>() {
        @Override
        public CarItem createFromParcel(Parcel in) {
            return new CarItem(in);
        }

        @Override
        public CarItem[] newArray(int size) {
            return new CarItem[size];
        }
    };

    public String getModel() {
        return this.model;
    }
    public Integer getPrice() {
        return this.price;
    }
    public Integer getMainImageResource() {
        return this.mainImageResource;
    }

    public void setModel(String model) { this.model = model; }
    public void setPrice(Integer price) { this.price = price; }
    public void setMainImageResource(Integer mainImageResource) {
        this.mainImageResource = mainImageResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(model);
        dest.writeInt(price);
        dest.writeInt(mainImageResource);
        dest.writeList(ImageResources);
    }
}
