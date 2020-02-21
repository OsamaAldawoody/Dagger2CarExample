package com.invent.dagger2carexample.dagger;

import com.invent.dagger2carexample.car.Engine;
import com.invent.dagger2carexample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine providePetrolEngine(PetrolEngine petrolEngine);
}
