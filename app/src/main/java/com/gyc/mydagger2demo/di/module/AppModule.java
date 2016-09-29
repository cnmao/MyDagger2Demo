package com.gyc.mydagger2demo.di.module;

import android.content.Context;

import com.gyc.mydagger2demo.MyApplication;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maoczsd on 2016/9/27.
 */

@Module
public class AppModule {

    private final MyApplication myApplication;
    public AppModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    Context provideAppContext(){
        return myApplication;
    }
}
