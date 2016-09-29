package com.gyc.mydagger2demo.di;

import android.app.Activity;

import com.gyc.mydagger2demo.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by maoczsd on 2016/9/29.
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {
        Activity getActivity();
}
