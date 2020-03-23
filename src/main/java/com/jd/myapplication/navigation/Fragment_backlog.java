package com.jd.myapplication.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jd.myapplication.R;

public class Fragment_backlog extends Fragment {
    public static Fragment_backlog newInstance() {
        Bundle args = new Bundle();

        Fragment_backlog fragment = new Fragment_backlog();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_backlog,container,false);
    }
}
