package com.invent.dagger2carexample.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    Engine engine;
    @Inject
    Wheels wheels;

    @Inject
    public Car( ) {
    }

    @Inject
    void remoteListener(Remote remote){
        remote.remoteListener();
    }

    @Inject
    void drive(){
        engine.start();
        Log.v(TAG, "drive......");
    }


}
