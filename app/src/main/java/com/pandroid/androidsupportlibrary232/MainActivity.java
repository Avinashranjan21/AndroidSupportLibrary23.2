package com.pandroid.androidsupportlibrary232;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Vector_Drawable_Compat, AppCompat_DayNight_theme, Bottom_Sheets, MediaBrowserServiceCompat, Custom_Tabs,app_permission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vector_Drawable_Compat = (Button) findViewById(R.id.Vector_Drawable_Compat);
        AppCompat_DayNight_theme = (Button) findViewById(R.id.AppCompat_DayNight_theme);
        Bottom_Sheets = (Button) findViewById(R.id.Bottom_Sheets);
        MediaBrowserServiceCompat = (Button) findViewById(R.id.MediaBrowserServiceCompat);
        Custom_Tabs = (Button) findViewById(R.id.Custom_Tabs);
        app_permission = (Button) findViewById(R.id.app_permission);

        Vector_Drawable_Compat.setOnClickListener(this);
        AppCompat_DayNight_theme.setOnClickListener(this);
        Bottom_Sheets.setOnClickListener(this);
        MediaBrowserServiceCompat.setOnClickListener(this);
        Custom_Tabs.setOnClickListener(this);
        app_permission.setOnClickListener(this);

    }

    private void chromeCustomTab() {
        CustomTabsIntent mIntent = new CustomTabsIntent.Builder().build();
        String url = "http://www.Google.co.in";
        mIntent.launchUrl(this, Uri.parse(url));
    }

    private void checkPermissionRuntime(){
        if(ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){

            if(ActivityCompat.shouldShowRequestPermissionRationale(this,
                    android.Manifest.permission.ACCESS_FINE_LOCATION)){

                Toast.makeText(MainActivity.this, "I want to know where is my Girl Friend", Toast.LENGTH_SHORT).show();

            }
        }

        ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},1);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(MainActivity.this, "Permission granted", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Vector_Drawable_Compat:
                startActivity(new Intent(MainActivity.this, Vector_Drawable_Compat_Activity.class));
                break;
            case R.id.AppCompat_DayNight_theme:
                break;
            case R.id.Bottom_Sheets:
                startActivity(new Intent(MainActivity.this, Bottom_Sheets_Activity.class));
                break;
            case R.id.MediaBrowserServiceCompat:
                break;
            case R.id.Custom_Tabs:
                chromeCustomTab();
                break;
            case R.id.app_permission:
                checkPermissionRuntime();

                break;
        }

    }
}
