package com.blinov.dependencyinjection.example1

@dagger.Component
interface NewComponent {

    fun inject(activity: Activity)
}