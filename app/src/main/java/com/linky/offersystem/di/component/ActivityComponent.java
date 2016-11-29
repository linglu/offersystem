package com.linky.offersystem.di.component;

import android.app.Activity;

import com.linky.offersystem.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by Linky on 16-9-7.
 *
 */
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    // Exposed to sub-graphs
    Activity activity();
}
