package com.bwie.lib_core.net;

/**
 * date:2019/8/2
 * name:windy
 * function:
 */
public interface CallBack {
    void failure(String msg);//服务器请求失败：断网，服务器宕机等等因素
    void success(String result);//数据合法
}
