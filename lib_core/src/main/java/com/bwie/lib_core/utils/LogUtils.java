package com.bwie.lib_core.utils;

import android.provider.SyncStateContract;
import android.util.Log;

import com.bwie.lib_core.common.Constants;

/**
 * date:2019/8/2
 * name:windy
 * function:封装日之类
 */
public class LogUtils {
    private static String TAG=LogUtils.class.getSimpleName();

    public static void d(String msg){//如果不是正式版环境
       if (!Constants.IS_RELEASE){
           Log.d(TAG,msg);
       }
    }
    public static void e(String msg){
        if (!Constants.IS_RELEASE){//如果不是正式版环境
            Log.e(TAG,msg);
        }
    }
}
