package com.gyc.mydagger2demo.di;

import com.gyc.mydagger2demo.MainActivity;
import com.gyc.mydagger2demo.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by maoczsd on 2016/9/29.
 */

@PerActivity
@Component(dependencies = {AppComponent.class} , modules = {ActivityModule.class})
public interface MainActivityComponent extends ActivityComponent{
    AndroidFragmentComponent androidFragmentComponent();
    void inject(MainActivity mainActivity);
}
