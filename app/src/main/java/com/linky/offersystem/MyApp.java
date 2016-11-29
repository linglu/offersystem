package com.linky.offersystem;

import android.app.Application;
import android.content.Context;

import com.linky.offersystem.di.component.ApplicationComponent;
import com.linky.offersystem.di.component.DaggerApplicationComponent;
import com.linky.offersystem.di.module.ApplicationModule;
import com.linky.offersystem.helper.DebugLog;

/**
 * Created by Linky on 16-11-28.
 */
public class MyApp extends Application {

    private static Context mApp;
    private ApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = getApplicationContext();
        initializeInjector();
        DebugLog.init();
    }

    private void initializeInjector() {
        mAppComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getAppComponent() {
        return mAppComponent;
    }

    public static Context getContext() {
        return mApp;
    }

}
