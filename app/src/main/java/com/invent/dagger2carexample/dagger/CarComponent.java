package com.invent.dagger2carexample.dagger;

import com.invent.dagger2carexample.dagger.DesielEngineModule;
import com.invent.dagger2carexample.MainActivity;

import dagger.Component;

@Component (modules = {DesielEngineModule.class})
public interface CarComponent {
    //Car getCar();

    void inject(MainActivity mainActivity);
}
