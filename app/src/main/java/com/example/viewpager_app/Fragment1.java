package com.example.viewpager_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {

    public Fragment1() {
        //Required empty public Constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_1,container,false);
    }
}