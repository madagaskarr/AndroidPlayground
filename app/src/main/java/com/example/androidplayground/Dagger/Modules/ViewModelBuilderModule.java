package com.example.androidplayground.Dagger.Modules;

import androidx.lifecycle.ViewModelProvider;

import com.example.androidplayground.Dagger.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelBuilderModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelProviderFactory(ViewModelProviderFactory viewModelProviderFactory);

}
