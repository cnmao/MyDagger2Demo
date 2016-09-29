package com.gyc.mydagger2demo.di;

import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by maoczsd on 2016/9/29.
 */

public class TextBean {

    @Inject
    public TextBean() {

    }

    public void print(String string){
        Log.e("aaa" , "有参注入成功 "+ string);
    }
}
