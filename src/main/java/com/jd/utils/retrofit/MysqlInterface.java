package com.jd.utils.retrofit;

import com.jd.myapplication.domain.MysqlUserJsonResult;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2020/3/25/025.
 */
public interface MysqlInterface {
    @GET("/user")
    Call<MysqlUserJsonResult> getUser();

}
