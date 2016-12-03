package com.linky.offersystem.data.usecase;

import rx.Observable;

/**
 * Created by Linky on 16-11-30.
 */
public interface OfferUsecase {

    Observable<Boolean> initDbFromAsset();
}
