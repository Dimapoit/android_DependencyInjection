package com.blinov.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.blinov.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor (
    private val useCase: ExampleUseCase
    ): ViewModel() {

    fun method() {
        Log.d("ExampleViewModel", "$this")
        useCase()
    }
}