package com.linky.offersystem.helper;

import com.linky.offersystem.view.BaseView;

import rx.Subscription;

/**
 * Created by Linky on 16-11-23.
 */
abstract class BaseHelper<V extends BaseView> {

    protected V mViewCallback;

    public void setBaseView(V viewCallback) {
        this.mViewCallback = viewCallback;
    }

    protected void unsubscription(Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    public abstract void onDestroy();

}

