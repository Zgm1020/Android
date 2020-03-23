package com.jd.utils;

import android.util.Log;

import java.io.IOException;

public abstract class HttpCallbackListener {

    public abstract void onFinish(String response);//正常访问之后进行的操作

    public void onError(Exception e) {//出错后进行的操作
        if (e instanceof IOException) {
            // io 异常
            Log.e("网络错误", e.getMessage());
            return;
        }
    }

}
