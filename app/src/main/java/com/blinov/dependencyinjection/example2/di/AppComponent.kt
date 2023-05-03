package com.blinov.dependencyinjection.example2.di

import com.blinov.dependencyinjection.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}