package com.blinov.dependencyinjection.example2.di

import android.content.Context
import com.blinov.dependencyinjection.example2.presentation.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface  AppComponentBuilder {

        @BindsInstance
        fun context(context: Context): AppComponentBuilder

        @BindsInstance
        fun timeMills(timeMillis: Long): AppComponentBuilder

        fun build(): AppComponent
    }
}