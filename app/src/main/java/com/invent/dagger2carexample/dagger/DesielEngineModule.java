package com.invent.dagger2carexample.dagger;

import com.invent.dagger2carexample.car.Engine;
import com.invent.dagger2carexample.car.DesielEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DesielEngineModule {
    @Binds
    abstract Engine provideDesielEngine(DesielEngine desielEngin);
}
