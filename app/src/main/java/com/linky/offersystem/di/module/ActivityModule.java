package com.linky.offersystem.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Linky on 16-8-30.
 * Activity 模块
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity activity() {
        return this.activity;
    }
}
