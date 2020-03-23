package com.jd.myapplication.orderListTitle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;

/**
 * Created by Administrator on 2020/3/23/023.
 */
public class TitleFragment extends Fragment {
    private static final String KEY = "title";
    private TextView mTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_layout,container,false);
        mTextView =  view.findViewById(R.id.textView);
        String str = getArguments().getString(KEY);
        mTextView.setText(str);
        return view;
    }

    public static TitleFragment newInstance(String str){
        TitleFragment fragment = new TitleFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY,str);
        fragment.setArguments(bundle);
        return fragment;
    }
}
