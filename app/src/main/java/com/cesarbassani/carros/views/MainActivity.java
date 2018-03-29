package com.cesarbassani.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cesarbassani.carros.R;
import com.cesarbassani.carros.adapter.CarListAdapter;
import com.cesarbassani.carros.data.CarMock;
import com.cesarbassani.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    CarListAdapter carListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        //1 - Obter a recyclerView
        this.mViewHolder.recyclerCars = findViewById(R.id.recycler_cars);

        //2 - Definir Adapter
        carListAdapter = new CarListAdapter(carList);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        //3 - Definir um layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}
