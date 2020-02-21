package com.invent.dagger2carexample.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "car";

    @Inject
    public PetrolEngine() {
    }


    @Override
    public void start() {
        Log.d(TAG,"PetrolEngine .................");
    }
}
