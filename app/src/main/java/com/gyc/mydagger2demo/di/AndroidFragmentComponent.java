package com.gyc.mydagger2demo.di;

import com.gyc.mydagger2demo.di.module.PerFragment;

import dagger.Subcomponent;

/**
 * Created by maoczsd on 2016/9/29.
 */
@PerFragment
@Subcomponent
public interface AndroidFragmentComponent {
        void inject(AndroidFragment androidFragment);
}
