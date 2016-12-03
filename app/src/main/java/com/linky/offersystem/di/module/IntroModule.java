package com.linky.offersystem.di.module;

import android.content.Context;

import com.linky.offersystem.data.repository.OfferDataStore;
import com.linky.offersystem.data.repository.OfferLocalDataStore;
import com.linky.offersystem.data.usecase.OfferUsecase;
import com.linky.offersystem.data.usecase.OfferUsecaseImpl;
import com.linky.offersystem.helper.GreenDaoHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Linky on 16-11-30.
 */
@Module
public class IntroModule {

    @Provides
    OfferUsecase provideOfferUsecase(OfferUsecaseImpl impl) {
        return impl;
    }

    @Provides
    OfferDataStore provideOfferDataStore(OfferLocalDataStore localDataStore) {
        return localDataStore;
    }

    @Provides
    public GreenDaoHelper provideGreenDaoHelper(Context context) {
        return new GreenDaoHelper(context);
    }

}
