package com.jd.myapplication.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;
import com.jd.myapplication.domain.MysqlUserJsonResult;
import com.jd.utils.retrofit.MysqlInterface;
import com.jd.utils.retrofit.RetrofitCreator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_mine extends Fragment {
    private TextView mTv1,mTv2,mTv3,mTv4,mTv5,mTv6;

    public static Fragment_mine newInstance() {
        Bundle args = new Bundle();

        Fragment_mine fragment = new Fragment_mine();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_mine,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTv1=view.findViewById(R.id.textView1);
        mTv2=view.findViewById(R.id.textView2);
        mTv3=view.findViewById(R.id.textView3);
        mTv4=view.findViewById(R.id.textView4);
        mTv5=view.findViewById(R.id.textView5);
        mTv6=view.findViewById(R.id.textView6);

        initData();


    }

    private void initData() {
        MysqlInterface mysqlInterface = RetrofitCreator.getInstance().getRetrofit().create(MysqlInterface.class);
        Call<MysqlUserJsonResult> user = mysqlInterface.getUser();
        user.enqueue(new Callback<MysqlUserJsonResult>() {
            @Override
            public void onResponse(Call<MysqlUserJsonResult> call, Response<MysqlUserJsonResult> response) {
                MysqlUserJsonResult body = response.body();
                List<MysqlUserJsonResult.DataBean> data = body.getData();
                MysqlUserJsonResult.DataBean dataBean = data.get(0);
                String username = dataBean.getUsername();
                String phone = dataBean.getPhone();
                String email = dataBean.getEmail();
                String created = dataBean.getCreated();
                mTv1.setText(username);
                mTv3.setText(email);
                mTv4.setText(phone);
                mTv5.setText(created);
                System.out.println(username);
            }

            @Override
            public void onFailure(Call<MysqlUserJsonResult> call, Throwable t) {
                Toast.makeText(getActivity(),"请求网络出错,正在紧急修复",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
