package com.cesarbassani.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.cesarbassani.carros.R;
import com.cesarbassani.carros.entities.Car;

/**
 * Created by cesarbassani on 29/03/18.
 */

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = itemView.findViewById(R.id.text_model);
    }

    public void bindData(Car car) {
        this.mTextModel.setText(car.model);
    }
}
