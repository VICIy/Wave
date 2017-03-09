package com.viciy.wave.retrofit;


import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public abstract class ApiCallback<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {
        onFinish();
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            String msg = httpException.getMessage();
            int code = httpException.code();
            switch (code) {
                case 404:
                case 502:
                    msg = "服务器异常";
                    break;
                case 504:
                    msg = "网络不给力";
                    break;
            }
            onFailure(msg);
        } else {
            onFailure(e.getMessage());
        }
        onFinish();
    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    public abstract void onFailure(String msg);
    public abstract void onFinish();
    public abstract void onSuccess(T t);

}
