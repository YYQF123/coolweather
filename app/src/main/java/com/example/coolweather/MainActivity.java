package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TabLayout weatherTabLayout;
    private ViewPager weatherPager;
    private ArrayList<String> titleList=new ArrayList<>();
    private ArrayList<Fragment> fragmentList=new ArrayList<>();
    private MyPagerAdapter weatherPagerAdapter;
    private ForecastFragment fragment1,fragment2,fragment3,fragment4,fragment5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherTabLayout=(TabLayout)findViewById(R.id.weather_tablayout);
        weatherPager=(ViewPager)findViewById(R.id.weather_viewpager);
        initTitle();
        initFragment();
        addFragment();
        weatherPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),titleList,fragmentList);
        weatherPager.setAdapter(weatherPagerAdapter);
        weatherTabLayout.setupWithViewPager(weatherPager);

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("Weather",null)!=null){
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void initTitle(){

    }

    public void initFragment(){

    }
    public void addFragment(){
        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);
        fragmentList.add(fragment4);
        fragmentList.add(fragment5);

    }
}