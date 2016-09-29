package com.gyc.mydagger2demo;

import android.app.Application;

import com.gyc.mydagger2demo.di.AppComponent;
import com.gyc.mydagger2demo.di.DaggerAppComponent;
import com.gyc.mydagger2demo.di.module.AppModule;

/**
 * Created by maoczsd on 2016/9/27.
 */

public class MyApplication extends Application {

    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initInjector();
    }

    private void initInjector() {
        mAppComponent  = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
