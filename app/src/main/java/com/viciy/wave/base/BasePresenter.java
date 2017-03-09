package com.viciy.wave.base;

import com.viciy.wave.retrofit.HttpApi;
import com.viciy.wave.retrofit.RetrofitManager;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public class BasePresenter<V> {
    public V v;
    private CompositeSubscription mCompositeSubscription;
    public HttpApi mHttpApi;

    public void attachView(V v) {
        this.v = v;
        mHttpApi = RetrofitManager.getInstance().getRetrofit().create(HttpApi.class);
    }

    public void detachView() {
        this.v = null;
        unSubscribe();
    }

    public void addSubscription(Observable observable,Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable.subscribeOn(Schedulers.io())
                                            .observeOn(AndroidSchedulers.mainThread())
                                            .subscribe(subscriber));
    }

    public void unSubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }
}
