package com.bwie.lib_core.mvp;

import java.lang.ref.WeakReference;

/**
 * date:2019/8/2
 * name:windy
 * function:
 */
public abstract class BasePresenter <M,V>{
public M model;
public V view;
private WeakReference<V> weakReference;
public abstract M getModel();
    //绑定
    public void attach(M model,V view){
       this.model=model;
       weakReference=new WeakReference<>(view);
       this.view=weakReference.get();
    }
    //解绑
    public void dettach(){
       if (weakReference!=null){
           weakReference.clear();//清空对象
           weakReference=null;
           this.view=null;
       }
    }
}
