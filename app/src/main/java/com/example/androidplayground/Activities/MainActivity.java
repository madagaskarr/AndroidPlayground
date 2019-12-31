package com.example.androidplayground.Activities;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.RequestManager;
import com.example.androidplayground.Dagger.ViewModelProviderFactory;
import com.example.androidplayground.R;
import com.example.androidplayground.ViewModels.MainActivityViewModel;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private ImageView myImageView;

    @Inject
    RequestManager glideInstance;

    @Inject
    Drawable logoDrawable;

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.my_image_view);
        glideInstance.load(logoDrawable).into(myImageView);
        mainActivityViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(MainActivityViewModel.class);

    }
}
