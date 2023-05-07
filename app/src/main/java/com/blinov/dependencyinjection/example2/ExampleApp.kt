package com.blinov.dependencyinjection.example2

import android.app.Application
import com.blinov.dependencyinjection.example2.di.DaggerAppComponent

class ExampleApp: Application() {

    val component by lazy { DaggerAppComponent.factory()
        .create(this, System.currentTimeMillis()) }
}