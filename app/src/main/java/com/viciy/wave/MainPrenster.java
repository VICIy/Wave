package com.viciy.wave;

import com.viciy.wave.base.BasePresenter;
import com.viciy.wave.retrofit.ApiCallback;
import com.viciy.wave.view.MainView;

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
