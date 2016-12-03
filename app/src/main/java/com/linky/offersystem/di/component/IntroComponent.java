package com.linky.offersystem.di.component;

import com.linky.offersystem.di.module.IntroModule;
import com.linky.offersystem.view.activity.IntroActivity;

import dagger.Component;

/**
 * Created by Linky on 16-11-30.
 */
@Component(dependencies = ApplicationComponent.class, modules = IntroModule.class)
public interface IntroComponent {
    void inject(IntroActivity activity);
}
