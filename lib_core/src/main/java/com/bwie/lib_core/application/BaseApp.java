package com.bwie.lib_core.application;

import android.app.Application;
import android.content.Context;

/**
 * date:2019/8/2
 * name:windy
 * function:
 */
public class BaseApp  extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
