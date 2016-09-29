package com.gyc.mydagger2demo.di.module;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by maoczsd on 2016/9/29.
 */

public class MainTestBean {

    @Inject
    public MainTestBean(){

    }

    public void print(String string){

        Log.e("aaa" , "MainTest有效， 参数为：" +string);
    }
}
