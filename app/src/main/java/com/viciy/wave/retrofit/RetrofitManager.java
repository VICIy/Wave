package com.viciy.wave.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public class RetrofitManager {
    private  Retrofit mRetrofit;
    //搞成单例
    private  RetrofitManager() {}
    private static RetrofitManager mRetrofitManager = new RetrofitManager();
    public static RetrofitManager getInstance() {
        return mRetrofitManager;
    }

    public Retrofit getRetrofit() {
        if (mRetrofit == null) {

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttpClient client = builder.build();
            mRetrofit = new Retrofit.Builder()
                                    .baseUrl(HttpApi.BaseUrl)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                                    .client(client)
                                    .build();
        }
        return mRetrofit;
    }
}
