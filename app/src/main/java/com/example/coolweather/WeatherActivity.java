package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class WeatherActivity extends AppCompatActivity {
    private ImageView weatherPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        weatherPicture=(ImageView)findViewById(R.id.weather_picture);
        String weatherPic=prefs
    }
}