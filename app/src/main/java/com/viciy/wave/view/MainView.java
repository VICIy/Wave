package com.viciy.wave.view;

import com.viciy.wave.MeiNvResponse;
import com.viciy.wave.base.BaseView;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */

public interface MainView extends BaseView{
    abstract void getDataSuccess(MeiNvResponse meiNvResponse);
    abstract void getDataFailed(String msg);
}
