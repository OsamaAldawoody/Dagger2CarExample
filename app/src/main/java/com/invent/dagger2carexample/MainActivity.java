package com.invent.dagger2carexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.invent.dagger2carexample.car.Car;
import com.invent.dagger2carexample.dagger.CarComponent;
import com.invent.dagger2carexample.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        //car.drive();
    }
}
