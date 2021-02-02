package com.example.coolweather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<String> titleArrayList;
    private ArrayList<Fragment> fragmentArrayList;
    public MyPagerAdapter(FragmentManager fm,ArrayList<String> titleArrayList,ArrayList<Fragment> fragmentArrayList){
        super(fm);
        this.titleArrayList=titleArrayList;
        this.fragmentArrayList=fragmentArrayList;
    }

    public Fragment getItem(int a) {
        return fragmentArrayList.get(a);
    }

    //获取fragment控件列表的大小（有几个fragment“碎片”）
    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    //获取标题位置
    @Override
    public CharSequence getPageTitle(int a) {
        return titleArrayList.get(a);
    }
}
