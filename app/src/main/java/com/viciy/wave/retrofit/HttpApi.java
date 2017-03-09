package com.viciy.wave.retrofit;

import com.viciy.wave.mvp.model.MeiNvResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public interface HttpApi {
    String BaseUrl ="http://gank.io/api/";
    @GET("data/福利/10/{page}")
    abstract Observable<MeiNvResponse> getMeiNv(@Path("page") int page);
}
