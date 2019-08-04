package com.bwie.lib_core.net;

import android.os.Handler;

import com.bwie.lib_core.interceptor.HeaderInterceptor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * date:2019/8/2
 * name:windy
 * function:
 * okhttp二次封装，封装网络框架
 */
public class OkhttpUtils {
    private Handler handler  = new Handler() ;

    private OkHttpClient okHttpClient;

    private static OkhttpUtils mInstance;//私有属性


    private OkhttpUtils() {//私有构造方法
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)//添加日志拦截器
                .addInterceptor(new HeaderInterceptor())//头部入参
                .writeTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build();//链式调用，构建者模式
    }
    /**
     * 创建实例,双重检验锁，单例模式进行实例化
     *
     * @return
     */
    public static OkhttpUtils getInstance() {

        if (mInstance == null) {
            synchronized (OkhttpUtils.class) {
                if (mInstance == null) {
                    mInstance = new OkhttpUtils();
                }
            }
        }

        return mInstance;

    }
    /**
     * get请求方式
     */
    public void doGet(String url, HashMap<String, String> parmas, final CallBack requestCallback) {

        StringBuilder p = new StringBuilder();
        if (parmas!=null&&parmas.size()>0){
            for (Map.Entry<String, String> map : parmas.entrySet()) {

                p.append(map.getKey()).append("=").append(map.getValue()).append("&");
            }

            System.out.println("ppppppp===="+p.toString());
        }
        Request request = new Request.Builder().url(url+"?"+p.toString())
                .get().build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (requestCallback != null) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            requestCallback.failure("网络异常");
                        }
                    });
                }
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String result = response.body().string();
                if (requestCallback != null) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            requestCallback.success(result);

                        }
                    });
                }
            }
        });


    }

    /**
     * Post请求方式
     */
    public void doPost(String url, HashMap<String, String> parmas, final CallBack callback) {

        FormBody.Builder builder = new FormBody.Builder();

        for (Map.Entry<String, String> map : parmas.entrySet()) {
            builder.add(map.getKey(), map.getValue());

        }

        RequestBody requestBody = builder.build();

        Request request = new Request.Builder().url(url)
                .post(requestBody).build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                if (callback != null) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            callback.failure("网络异常");
                        }
                    });

                }

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                if (callback != null) {
                    if (200 == response.code()) {
                        final String result = response.body().string();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callback.success(result);
                            }
                        });

                    }
                }
            }
        });
    }
    /**
     * 取消所有请求，好处：节省开销：内存开销，cpu的开销（线程开销）
     */
    public void cancelAllTask() {
        if (okHttpClient != null) {
            okHttpClient.dispatcher().cancelAll();
        }
    }
}
