package com.jd.myapplication.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;
import com.jd.myapplication.SupplyActivity;

public class Fragment_home extends Fragment {

    private Button mSupply,mDevice,mPurchase;
    public static Fragment_home newInstance() {
        Bundle args = new Bundle();

        Fragment_home fragment = new Fragment_home();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //初始化数据
        mSupply=view.findViewById(R.id.btn_supply);
        mDevice=view.findViewById(R.id.btn_device);
        mPurchase=view.findViewById(R.id.btn_purchase);
        setListener();
    }
    public void setListener(){
        Onclick onclick = new Onclick();
        mSupply.setOnClickListener(onclick);
        mDevice.setOnClickListener(onclick);
        mPurchase.setOnClickListener(onclick);
    }

    public class Onclick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_supply:
                    intent = new Intent(getActivity(), SupplyActivity.class);
                    break;
                case R.id.btn_device:
                    intent = new Intent(getActivity(), MainActivity.class);
                    break;
                case R.id.btn_purchase:
                    intent = new Intent(getActivity(), MainActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
