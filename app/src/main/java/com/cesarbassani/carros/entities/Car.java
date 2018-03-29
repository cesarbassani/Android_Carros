package com.cesarbassani.carros.entities;

/**
 * Created by cesarbassani on 29/03/18.
 */

public class Car {

    public int id;
    public String model;
    public int horsePower;
    public Double price;

    public Car(int id, String model, int horsePower, Double price) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }
}
