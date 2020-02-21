package com.invent.dagger2carexample.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "car";

    @Inject
    public Remote() {
    }


    void remoteListener(){
        Log.v(TAG,"sarina ..........................");
    }
}
