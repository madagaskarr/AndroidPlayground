package com.example.androidplayground.Dagger.Modules;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.androidplayground.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    static RequestOptions provideRequestOptions() {
        return new RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.error_logo);
    }

    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable provideLogoDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.android_logo);
    }
}
