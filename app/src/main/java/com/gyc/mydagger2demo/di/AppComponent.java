package com.gyc.mydagger2demo.di;

import android.content.Context;

import com.gyc.mydagger2demo.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maoczsd on 2016/9/27.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context getAppContext();

}
