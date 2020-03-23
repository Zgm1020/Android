package com.jd.myapplication.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;

public class Fragment_mine extends Fragment {
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
}
