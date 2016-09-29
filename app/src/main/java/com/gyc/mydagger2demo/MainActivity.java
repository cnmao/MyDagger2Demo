package com.gyc.mydagger2demo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gyc.mydagger2demo.di.AndroidFragment;
import com.gyc.mydagger2demo.di.AppComponent;
import com.gyc.mydagger2demo.di.DaggerMainActivityComponent;
import com.gyc.mydagger2demo.di.MainActivityComponent;
import com.gyc.mydagger2demo.di.TextBean;
import com.gyc.mydagger2demo.di.module.ActivityModule;
import com.gyc.mydagger2demo.di.module.MainTestBean;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private AppComponent mAppComponent ;
    private MainActivityComponent mComponent ;
    private FragmentTransaction mTransaction;

    @Inject public MainTestBean mainTestBean ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInjector();
        initUi();
    }

    private void initInjector(){
        mAppComponent = ((MyApplication) getApplication()).getAppComponent();
        mComponent = DaggerMainActivityComponent.builder()
                .appComponent(mAppComponent)
                .activityModule(new ActivityModule(this))
                .build();
        mComponent.inject(this);
    }

    public MainActivityComponent getMainActivityComponent(){
        return mComponent;
    }

    private void initUi() {
        mTransaction =  getSupportFragmentManager()
                .beginTransaction();

        mTransaction.replace(R.id.activity_main_frame , AndroidFragment.getInstance()).commit();

//        mainTestBean.print("这个MainActivity中的数据！");
    }
}
