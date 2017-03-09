package com.viciy.wave.mvp.presenter;

import com.viciy.wave.mvp.view.MainView;
import com.viciy.wave.mvp.model.MeiNvResponse;
import com.viciy.wave.mvp.base.BasePresenter;
import com.viciy.wave.retrofit.ApiCallback;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public class MainPrenster extends BasePresenter<MainView> {
    public MainPrenster(MainView v) {
        attachView(v);

        getNetData(10);
    }

    public void getNetData(int page) {
        addSubscription(mHttpApi.getMeiNv(page), new ApiCallback<MeiNvResponse>() {
            @Override
            public void onFailure(String msg) {
                v.getDataFailed(msg);
            }

            @Override
            public void onFinish() {
                v.hideLoading();
            }

            @Override
            public void onSuccess(MeiNvResponse meiNvResponse) {
                v.getDataSuccess(meiNvResponse);
            }
        });


    }


}
