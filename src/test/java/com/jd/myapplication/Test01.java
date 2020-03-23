package com.jd.myapplication;

import android.util.Log;

import com.google.gson.JsonObject;
import com.jd.myapplication.domain.JsonResult;
import com.jd.myapplication.domain.JsonResultPost;
import com.jd.utils.GetPostUtil;
import com.jd.utils.HttpUtil;
import com.jd.utils.retrofit.RetrofitCreator;
import com.jd.utils.retrofit.WebInterface;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Test01 {

    static class ThreadSleep{
        static void sleep(){

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void testHttp() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName","test01");
        jsonObject.addProperty("pwd","123");
        String s1 = jsonObject.toString();
        HttpUtil.doPostAsyn("http://localhost:52450/ActionApi/LoginInfo/CheckUserNameAndPwd", s1, new HttpUtil.CallBack() {
            @Override
            public void onRequestComplete(String requst) {
                System.out.println("成功");
                System.out.println(requst);
            }
        });
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testHttp2() {

        //String s = GetPostUtil.sendGet("http://localhost:52450/actionapi/UserInfo/GetOrder", "OrderId=2");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName","test01");
        jsonObject.addProperty("pwd","123");
        String s1 = jsonObject.toString();
        System.out.println(s1);
        String s = GetPostUtil.sendPost("http://localhost:52450/ActionApi/LoginInfo/CheckUserNameAndPwd", s1);
        System.out.println(s);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
@Test
    public  void testPost(){
    //获取商城的分类信息
    String url = "http://172.16.150.136:52450/ActionApi/PurchaseOrderInfo/GetOrderCountByStatus";
    RequestBody requestBody = new FormBody.Builder().add("supply_id","111").build();

    System.out.println(requestBody);
    //1、创建client，理解为创建浏览器
    OkHttpClient okHttpClient = new OkHttpClient();
    //2、创建请求内容
    Request request = new Request.Builder()
            .url(url)
            .post(requestBody)
            .build();
    //3、用浏览器创建调用任务
    Call call = okHttpClient.newCall(request);
    //4、执行任务
    call.enqueue(new Callback() {
        @Override
        public void onFailure(@NotNull Call call, @NotNull IOException e) {
            //Log.d(TAG,"onFailure -- > " + e.toString());
            System.out.println(e.toString());
        }

        @Override
        public void onResponse(@NotNull Call call,@NotNull Response response) throws IOException {
            //Log.d(TAG,"response -- > " + response.body().string());
            System.out.println(response.body().string());
        }
    });
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    @Test
    public void doSearch(){
        String url = "https://www.sunofbeach.net/shop/api/search/1";
        RequestBody requestBody = new FormBody.Builder()
                .add("keyword","电脑")
                .build();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call,@NotNull IOException e) {
                Log.d(TAG,"onFailure -- > " + e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call,@NotNull Response response) throws IOException {
                Log.d(TAG,"response json --> " + response.body().string());
            }
        });
    }
    @Test
    public void asyncGet() {
        System.out.println("开始");
        //获取商城的分类信息
        String url = "https://www.sunofbeach.net/shop/api/discovery/categories";
        //1、创建client，理解为创建浏览器
        OkHttpClient okHttpClient = new OkHttpClient();
        //2、创建请求内容
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        //3、用浏览器创建调用任务
        Call call = okHttpClient.newCall(request);
        //4、执行任务
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call,@NotNull IOException e) {
                //Log.d(TAG,"onFailure -- > " + e.toString());
                System.out.println(e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call,@NotNull Response response) throws IOException {
                //Log.d(TAG,"response -- > " + response.body().string());
                System.out.println(response.body().string());
            }
        });

        ThreadSleep.sleep();
        System.out.println("结束");
    }
    //使用retrofit发起请求
    @Test
    public void getJson() {
        WebInterface instance = RetrofitCreator.getInstance().getRetrofit().create(WebInterface.class);
        retrofit2.Call<JsonResult> task = instance.getJson();
        task.enqueue(new retrofit2.Callback<JsonResult>() {
            @Override
            public void onResponse(retrofit2.Call<JsonResult> call, retrofit2.Response<JsonResult> response) {
                JsonResult body = response.body();
                List<JsonResult.MessageBean> message = body.getMessage();
                for (JsonResult.MessageBean bean : message) {

                }

            }

            @Override
            public void onFailure(retrofit2.Call<JsonResult> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getParmesJson(){
        WebInterface webInterface = RetrofitCreator.getInstance().getRetrofit().create(WebInterface.class);
        Map<String,String> map=new HashMap<>();
        map.put("OrderId","1");
        retrofit2.Call<JsonResult> task = webInterface.getParmesJson(map);
        task.enqueue(new retrofit2.Callback<JsonResult>() {
            @Override
            public void onResponse(retrofit2.Call<JsonResult> call, retrofit2.Response<JsonResult> response) {
                List<JsonResult.MessageBean> result = response.body().getMessage();
                for (JsonResult.MessageBean messageBean : result) {

                    System.out.println(messageBean.toString());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<JsonResult> call, Throwable t) {

            }
        });
        ThreadSleep.sleep();
    }
    @Test
    public void  testPostJson(){
        WebInterface webInterface = RetrofitCreator.getInstance().getRetrofit().create(WebInterface.class);
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("supply_id", "111");
        retrofit2.Call<JsonResultPost> task = webInterface.getParmesJson1(hashMap);
        task.enqueue(new retrofit2.Callback<JsonResultPost>() {
            @Override
            public void onResponse(retrofit2.Call<JsonResultPost> call, retrofit2.Response<JsonResultPost> response) {
                List<JsonResultPost.MessageBean> message = response.body().getMessage();
                for (JsonResultPost.MessageBean messageBean : message) {
                    System.out.println(messageBean.toString());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<JsonResultPost> call, Throwable t) {

            }
        });
        ThreadSleep.sleep();
    }

}
