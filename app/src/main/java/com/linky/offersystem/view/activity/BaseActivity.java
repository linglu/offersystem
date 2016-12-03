package com.linky.offersystem.view.activity;

import android.support.v7.app.AppCompatActivity;

import com.linky.offersystem.MyApp;
import com.linky.offersystem.di.component.ApplicationComponent;
import com.linky.offersystem.di.module.ActivityModule;

/**
 * Created by Linky on 16-8-29.
 * Activity 基类
 */
public class BaseActivity extends AppCompatActivity {

    protected ApplicationComponent getApplicationComponent() {
        return ((MyApp) getApplication()).getAppComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }
}
