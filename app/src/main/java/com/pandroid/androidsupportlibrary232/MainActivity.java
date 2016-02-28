package com.pandroid.androidsupportlibrary232;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Vector_Drawable_Compat, AppCompat_DayNight_theme, Bottom_Sheets, MediaBrowserServiceCompat, Custom_Tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vector_Drawable_Compat = (Button) findViewById(R.id.Vector_Drawable_Compat);
        AppCompat_DayNight_theme = (Button) findViewById(R.id.AppCompat_DayNight_theme);
        Bottom_Sheets = (Button) findViewById(R.id.Bottom_Sheets);
        MediaBrowserServiceCompat = (Button) findViewById(R.id.MediaBrowserServiceCompat);
        Custom_Tabs = (Button) findViewById(R.id.Custom_Tabs);

        Vector_Drawable_Compat.setOnClickListener(this);
        AppCompat_DayNight_theme.setOnClickListener(this);
        Bottom_Sheets.setOnClickListener(this);
        MediaBrowserServiceCompat.setOnClickListener(this);
        Custom_Tabs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Vector_Drawable_Compat:
                startActivity(new Intent(MainActivity.this,Vector_Drawable_Compat_Activity.class));
                break;
            case R.id.AppCompat_DayNight_theme:
                break;
            case R.id.Bottom_Sheets:
                break;
            case R.id.MediaBrowserServiceCompat:
                break;
            case R.id.Custom_Tabs:
                break;
        }

    }
}
