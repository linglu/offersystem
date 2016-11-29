package com.linky.offersystem.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module 用于提供在整个 应用生命周期都存活的对象
 */
@Module
public class ApplicationModule {

    private final Application context;

    public ApplicationModule(Application application) {
        this.context = application;
    }

    @Provides
    public Context provideApplicationContext() {
        return this.context;
    }

}
