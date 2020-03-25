package com.jd.myapplication.orderListTitle;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.jd.myapplication.R;
import com.jd.myapplication.domain.JsonResultTitle;
import com.jd.utils.retrofit.RetrofitCreator;
import com.jd.utils.retrofit.WebInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrderNavigation extends AppCompatActivity {
    //声明控件
    private XTabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mTitleList = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_navigation);
        mTabLayout=findViewById(R.id.xtab_layout);
        mViewPager=findViewById(R.id.view_pager);

        initData();
    }

    private void initData() {
        WebInterface webInterface = RetrofitCreator.getInstance().getRetrofit().create(WebInterface.class);
        Call<JsonResultTitle> title = webInterface.getTitle();
        title.enqueue(new Callback<JsonResultTitle>() {
            @Override
            public void onResponse(Call<JsonResultTitle> call, Response<JsonResultTitle> response) {
                List<JsonResultTitle.DataBean> data = response.body().getData();
                for (JsonResultTitle.DataBean dataBean : data) {
                    mTitleList.add(dataBean.getTitle());
                }
            }


            @Override
            public void onFailure(Call<JsonResultTitle> call, Throwable t) {

            }
        });
        mTabLayout.setTabMode(XTabLayout.MODE_SCROLLABLE);
        for (int i = 0; i < mTitleList.size(); i++) {
            TitleFragment titleFragment = TitleFragment.newInstance(mTitleList.get(i));
            mFragments.add(titleFragment);
        }
        for (int i = 0; i < mFragments.size(); i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(i)));
        }
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return mFragments.size();
            }

            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitleList.get(position);
            }
        };
        mViewPager.setAdapter(fragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
