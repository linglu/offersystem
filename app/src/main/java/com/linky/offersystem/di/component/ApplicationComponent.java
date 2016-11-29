package com.linky.offersystem.di.component;

import android.content.Context;

import com.linky.offersystem.di.module.ApplicationModule;

import dagger.Component;

/**
 * Created by Linky on 16-9-7.
 * Module 初始化后的具体类，component 则负责将接口
 * 暴露给子试图以提供依赖
 */
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    // Exposed to sub-graphs
    Context context();
}
