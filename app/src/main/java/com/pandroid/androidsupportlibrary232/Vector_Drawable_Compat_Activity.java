package com.pandroid.androidsupportlibrary232;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vector_Drawable_Compat_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector__drawable__compat_);

        final ImageView mImageView = (ImageView) findViewById(R.id.iv_vectorDrawable);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.ic_radio);
            }
        });
    }
}
