package com.linky.offersystem.data.repository;

import rx.Observable;

/**
 * Created by Linky on 16-11-30.
 */
public interface OfferDataStore {

    Observable<Boolean> initDbFromAsset();
}
