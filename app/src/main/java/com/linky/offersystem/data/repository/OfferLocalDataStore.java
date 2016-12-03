package com.linky.offersystem.data.repository;

import com.linky.offersystem.helper.GreenDaoHelper;

import java.io.IOException;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Linky on 16-11-30.
 */
public class OfferLocalDataStore implements OfferDataStore {

    @Inject
    GreenDaoHelper mDbHelper;

    @Inject
    OfferLocalDataStore() {}

    @Override
    public Observable<Boolean> initDbFromAsset() {
        return Observable.create(subscriber -> {
            try {
                mDbHelper.initDbFromAsset();
                subscriber.onNext(true);
                subscriber.onCompleted();
            } catch (IOException e) {
                e.printStackTrace();
                subscriber.onError(new Exception("初始化数据库错误"));
            }
        });
    }
}
