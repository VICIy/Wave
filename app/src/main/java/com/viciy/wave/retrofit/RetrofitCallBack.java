package com.viciy.wave.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public abstract class RetrofitCallBack<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        boolean successful = response.isSuccessful();
        if (successful) {
            onSuccess(response.body());
        } else {
            onFailure(response.code(),response.errorBody().toString());
        }
        onFinish();
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onThrowable(t);
        onFinish();
    }

    abstract void onSuccess(T t);
    abstract void onFailure(int code,String msg);
    abstract void onFinish();
    abstract void onThrowable(Throwable t);

}
