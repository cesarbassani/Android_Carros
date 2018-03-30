package com.cesarbassani.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cesarbassani.carros.R;
import com.cesarbassani.carros.constants.CarrosConsants;
import com.cesarbassani.carros.data.CarMock;
import com.cesarbassani.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mCarMock = new CarMock();

        this.mViewHolder.textModel = findViewById(R.id.text_model);
        this.mViewHolder.textHorsePower = findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = findViewById(R.id.text_price);

        this.getDataFromActivity();

        this.setData();
    }

    private void setData() {
        this.mViewHolder.textModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText(String.valueOf(this.mCar.price));
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosConsants.CARRO_ID));

        }
    }

    private static class ViewHolder {

        TextView textModel;
        TextView textHorsePower;
        TextView textPrice;
    }
}
