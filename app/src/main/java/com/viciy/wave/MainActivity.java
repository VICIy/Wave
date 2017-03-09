package com.viciy.wave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.viciy.wave.base.BaseMvpActivity;
import com.viciy.wave.view.MainView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseMvpActivity<MainPrenster> implements MainView {

    private MainPrenster mMainPrenster;
    private List<String> mMeiNvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public MainPrenster createPresenter() {
        mMainPrenster = new MainPrenster(this);
        return mMainPrenster;
    }


    @Override
    public void getDataSuccess(MeiNvResponse meiNvResponse) {
        toast("请求成功");
        if (meiNvResponse != null) {
            if (meiNvResponse.getResults() != null
                    && meiNvResponse.getResults().size() > 0) {
                mMeiNvList = new ArrayList<>();
                for (int i = 0; i < meiNvResponse.getResults().size(); i++) {
                    if (!TextUtils.isEmpty(meiNvResponse.getResults().get(i).getUrl())) {
                        mMeiNvList.add(meiNvResponse.getResults().get(i).getUrl());
                    }
                }
            }
        }
    }

    @Override
    public void getDataFailed(String msg) {
        toast("请求失败---->"+msg);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
