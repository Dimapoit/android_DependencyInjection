package com.blinov.dependencyinjection.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun activityComponentFactory():ActivityComponent.Factory

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): AppComponent
    }
}