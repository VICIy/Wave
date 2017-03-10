package com.viciy.wave.base;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.viciy.wave.mvp.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public abstract class BaseMvpFragment<P extends BasePresenter> extends Fragment {

    private P mPresenter;
    private List<Call> mCalls;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter = createPresenter();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cancleCall();
    }

    public void toast(String s) {
        if (getActivity() != null) Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
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
