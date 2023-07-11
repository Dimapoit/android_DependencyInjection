package com.blinov.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.blinov.dependencyinjection.example2.domain.ExampleRepository
import com.blinov.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor (
    private val repository: ExampleRepository
    ): ViewModel() {

    fun method() {
        Log.d("ExampleViewModel", "$this")
        repository.method()
    }
}