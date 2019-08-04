package com.bwie.lib_core.mvp;

import com.bwie.lib_core.base.BaseActivity;

/**
 * date:2019/8/2
 * name:windy
 * function:
 */
public abstract class BaseMvpActivity <M extends IBaseModel,P extends BasePresenter>extends BaseActivity<IBaseModel, IBaseView> implements IBaseView{
   public M model;
   public P presenter;

    @Override
    protected void initData() {
        presenter=(P)initPresenter();
        if (presenter!=null){
            model=(M)presenter.getModel();
            if (model!=null){
           //绑定
             presenter.attach(model,this);
            }
        }
        init();
    }

    protected abstract void init();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            //解绑
            presenter.dettach();
        }
    }
}
