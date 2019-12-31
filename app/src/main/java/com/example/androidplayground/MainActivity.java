package com.example.androidplayground;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private ImageView myImageView;

    @Inject
    RequestManager glideInstance;

    @Inject
    Drawable logoDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.my_image_view);
        glideInstance.load(logoDrawable).into(myImageView);

    }
}
