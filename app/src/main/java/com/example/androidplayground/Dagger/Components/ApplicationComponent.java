package com.example.androidplayground.Dagger.Components;

import android.app.Application;

import com.example.androidplayground.BaseApplication;
import com.example.androidplayground.Dagger.Modules.ActivityBuildersModule;
import com.example.androidplayground.Dagger.Modules.ApplicationModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, ActivityBuildersModule.class, ApplicationModule.class})
public interface ApplicationComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder getInstance(Application application);

        ApplicationComponent build();
    }
}
