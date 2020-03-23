package com.jd.utils.retrofit;

import com.jd.myapplication.domain.JsonResult;
import com.jd.myapplication.domain.JsonResultPost;
import com.jd.myapplication.domain.JsonResultTitle;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;


public interface WebInterface {
    @GET("/actionapi/UserInfo/GetOrder?OrderId=1")
    Call<JsonResult> getJson();
    @GET("/actionapi/UserInfo/GetOrder")
   Call<JsonResult> getParmesJson(@QueryMap Map<String,String> parmes);
    @POST("/ActionApi/PurchaseOrderInfo/GetOrderCountByStatus")
   Call<JsonResultPost> getParmesJson1(@Body Map<String,String> parmes);
    @GET("/discovery/categories")
    Call<JsonResultTitle> getTitle();
}
