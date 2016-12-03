package com.linky.offersystem.data.usecase;

import com.linky.offersystem.data.repository.OfferDataStore;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Linky on 16-11-30.
 */
public class OfferUsecaseImpl implements OfferUsecase {

    @Inject
    OfferDataStore mDataStore;

    @Inject
    OfferUsecaseImpl() {}

    @Override
    public Observable<Boolean> initDbFromAsset() {
        return mDataStore.initDbFromAsset()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                ;
    }
}
