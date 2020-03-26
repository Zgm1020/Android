package com.jd.utils.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitCreator {
    //sqlserver连接地址
    //public static final String BASE_URL = "http://localhost:52450";
   //public static final String BASE_URL = "http://172.16.100.110:8083";
    //mysql连接地址
    //public static final String BASE_URL = "http://172.16.150.136:8080";
    //手机连接地址
    public static final String BASE_URL = "http://172.20.10.10:8080";
    // public static final String BASE_URL = "https://api.sunofbeach.net/shop/api";
    public static final int CONNECT_TIME_OUT = 10000;//毫秒
    private Retrofit mRetrofit;


    private RetrofitCreator() {
        createRetrofit();
    }

    private void createRetrofit() {
        //设置一下okHttp的参数
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.MILLISECONDS)
                .build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)//设置BaseUrl
                .client(okHttpClient)//设置请求的client
                .addConverterFactory(GsonConverterFactory.create())//设置转换器
                .build();
    }

    private static RetrofitCreator sRetrofitCreator = null;

    public static RetrofitCreator getInstance() {
        if(sRetrofitCreator == null) {
            synchronized(RetrofitCreator.class) {
                if(sRetrofitCreator == null) {
                    sRetrofitCreator = new RetrofitCreator();
                }
            }
        }
        return sRetrofitCreator;
    }


    public Retrofit getRetrofit() {
        return mRetrofit;
    }


}
