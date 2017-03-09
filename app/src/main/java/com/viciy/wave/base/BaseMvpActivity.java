package com.viciy.wave.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.viciy.wave.mvp.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public abstract class BaseMvpActivity<P extends BasePresenter>  extends AppCompatActivity{

    private List<Call> mCalls;
    private P mPresenter;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        cancleCall();

        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void addCall(Call call) {
        if (mCalls == null) {
            mCalls = new ArrayList<>();
        }
        mCalls.add(call);


    }

    public void cancleCall() {
        if (mCalls != null && mCalls.size() > 0) {
            for (Call call:mCalls) {
                if (!call.isCanceled()) {
                    call.cancel();
                }
            }
        }
        mCalls.clear();
    }

    public abstract P createPresenter();
}
