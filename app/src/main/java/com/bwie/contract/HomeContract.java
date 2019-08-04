package com.bwie.contract;

import com.bwie.lib_core.mvp.BasePresenter;
import com.bwie.lib_core.mvp.IBaseModel;
import com.bwie.lib_core.mvp.IBaseView;
import com.bwie.model.HomeModel;

/**
 * date:2019/8/4
 * name:windy
 * function:
 */
public interface HomeContract {
    interface IHomeModel extends IBaseModel{

    }
    interface IHomeView extends IBaseView{

    }
    abstract class HomePresenter extends BasePresenter<IHomeModel,IHomeView>{

        @Override
        public IHomeModel getModel() {
            return new HomeModel();
        }
    }
}
