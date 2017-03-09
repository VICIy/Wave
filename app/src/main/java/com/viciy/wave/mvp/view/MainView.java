package com.viciy.wave.mvp.view;

import com.viciy.wave.mvp.model.MeiNvResponse;
import com.viciy.wave.mvp.base.BaseView;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public interface MainView extends BaseView {
    abstract void getDataSuccess(MeiNvResponse meiNvResponse);
    abstract void getDataFailed(String msg);
}
