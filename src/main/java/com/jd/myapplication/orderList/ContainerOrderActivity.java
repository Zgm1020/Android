package com.jd.myapplication.orderList;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ContainerOrderActivity extends AppCompatActivity {
    private Fragment_order fragment_order;
    private TextView mAdd,mHandle,mFinish,mAnalyze;
    List<String> mTitles=new ArrayList();
    List<Fragment> mFragments=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化数据
        setContentView(R.layout.activity_container_order);
        fragment_order=new Fragment_order();
        mAdd=findViewById(R.id.tv_add);

        mHandle=findViewById(R.id.tv_handle);
        mFinish=findViewById(R.id.tv_finish);
        mAnalyze=findViewById(R.id.tv_analyze);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,fragment_order,"order").commitAllowingStateLoss();


    }
}
