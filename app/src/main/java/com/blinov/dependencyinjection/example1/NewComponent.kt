package com.blinov.dependencyinjection.example1

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}