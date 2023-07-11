package com.blinov.dependencyinjection.example2.di

import androidx.lifecycle.ViewModel
import com.blinov.dependencyinjection.example2.presentation.ExampleViewModel
import com.blinov.dependencyinjection.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @Binds
    //@StringKey("ExampleViewModel")
    @ViewModelKey(ExampleViewModel::class)
    fun bindExampleViewModel(impl: ExampleViewModel):ViewModel

    @IntoMap
    @Binds
    //@StringKey("ExampleViewModel2")
    @ViewModelKey(ExampleViewModel2::class)
    fun bindExampleViewModel2(impl: ExampleViewModel2):ViewModel
}