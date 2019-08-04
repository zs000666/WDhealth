package com.bwie;

import android.os.Bundle;

import com.bwie.contract.HomeContract;
import com.bwie.lib_core.base.BaseActivity;
import com.bwie.lib_core.mvp.BasePresenter;
import com.wd.health.R;

public class MainActivity extends BaseActivity<HomeContract.IHomeModel,HomeContract.IHomeView>implements HomeContract.IHomeView {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void failure(String msg) {

    }
}
