package com.voshodnerd.excellexporter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.voshodnerd.excellexporter.R;

public class SecondPageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_page_fragment, container, false);
        return view;
    }


    public static Fragment newInstance() {
        Bundle args = new Bundle();
        SecondPageFragment fragment = new SecondPageFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
