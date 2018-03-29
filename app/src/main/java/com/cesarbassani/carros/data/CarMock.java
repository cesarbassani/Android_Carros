package com.cesarbassani.carros.data;

import com.cesarbassani.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesarbassani on 29/03/18.
 */

public class CarMock {

    private List<Car> mListCars;

    public CarMock() {
        this.mListCars = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            this.mListCars.add(new Car(i, String.valueOf(i), i * 10, Double.valueOf(i * 100)));
        }
    }

    public List<Car> getList() {
        return this.mListCars;
    }

    public Car get(int id) {
        return this.mListCars.get(id);
    }
}