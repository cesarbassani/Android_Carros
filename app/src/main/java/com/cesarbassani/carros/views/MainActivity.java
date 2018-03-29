package com.cesarbassani.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cesarbassani.carros.R;
import com.cesarbassani.carros.adapter.CarListAdapter;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    CarListAdapter carListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1 - Obter a recyclerView
        this.mViewHolder.recyclerCars = findViewById(R.id.recycler_cars);

        //2 - Definir Adapter
        carListAdapter = new CarListAdapter();
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        //3 - Definir um layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}
