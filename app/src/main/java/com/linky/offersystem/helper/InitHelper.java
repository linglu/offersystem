package com.linky.offersystem.helper;

import com.linky.offersystem.data.DefaultSubscriber;
import com.linky.offersystem.data.usecase.OfferUsecase;
import com.linky.offersystem.view.IntroView;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by Linky on 16-11-30.
 */
public class InitHelper extends BaseHelper<IntroView> {

    @Inject
    InitHelper() {}

    @Inject
    OfferUsecase mOfferUsecase;

    private Subscription mSubscription;

    public void initDbFromAsset() {
        DebugLog.i("InitHelper:initDbFromAsset " + "");
        mSubscription = mOfferUsecase.initDbFromAsset().subscribe(new DefaultSubscriber<Boolean>(){
            @Override
            public void onNext(Boolean aBoolean) {
                super.onNext(aBoolean);
                if (mViewCallback != null) {
                    mViewCallback.onInitDbComplete();
                }
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                if (mViewCallback != null) {
                    mViewCallback.onInitDbFail(e.getMessage());
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        unsubscription(mSubscription);
    }
}
