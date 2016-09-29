package com.gyc.mydagger2demo.di.module;

import android.app.Activity;

import com.gyc.mydagger2demo.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maoczsd on 2016/9/29.
 */

@Module
public class ActivityModule {

    private final Activity mActivity ;

    public ActivityModule(Activity activity){
            mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity(){
        return mActivity;
    }
}
