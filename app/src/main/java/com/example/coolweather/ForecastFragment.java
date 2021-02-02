package com.example.coolweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {
    View view;
    public ForecastFragment(){};
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup contanier, Bundle savedInstanceState){
        view=layoutInflater.inflate(R.layout.item,contanier,false);
        initData();
        return view;
    }
    public void initData(){}
}
