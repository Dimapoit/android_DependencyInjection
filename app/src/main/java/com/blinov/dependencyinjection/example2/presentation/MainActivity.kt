package com.blinov.dependencyinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blinov.dependencyinjection.R
import com.blinov.dependencyinjection.example1.Activity
import com.blinov.dependencyinjection.example2.ExampleApp
import com.blinov.dependencyinjection.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

//    private val component by lazy { DaggerAppComponent.builder()
//        .context(this)
//        .timeMills(System.currentTimeMillis())
//        .build() }

//    private val component by lazy { DaggerAppComponent.factory()
//        .create(this, System.currentTimeMillis()) }

    private val component by lazy { (application as ExampleApp).component  }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()


    }
}