package com.invent.dagger2carexample.car;

import android.util.Log;

import javax.inject.Inject;

public class DesielEngine implements Engine {
    private static final String TAG = "car";

    @Inject
    public DesielEngine() {
    }


    @Override
    public void start() {
        Log.d(TAG,"DesielEngine .................");
    }
}
