package com.cesarbassani.carros.entities;

import android.graphics.drawable.Drawable;

/**
 * Created by cesarbassani on 29/03/18.
 */

public class Car {

    public int id;
    public String model;
    public String manufacturer;
    public int horsePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manufactor, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufactor;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }
}
