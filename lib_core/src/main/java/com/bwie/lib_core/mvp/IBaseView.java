package com.bwie.lib_core.mvp;

import com.bwie.lib_core.mvp.BasePresenter;

/**
 * date:2019/8/2
 * name:windy
 * function:
 */
public interface IBaseView {
    BasePresenter initPresenter();//初始化presennter方法

    void showLoading();//显示加载框

    void hideLoading();//隐藏加载框

    void failure(String msg);//请求失败
}
