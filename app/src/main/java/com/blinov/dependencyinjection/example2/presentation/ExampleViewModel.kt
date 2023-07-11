package com.blinov.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.blinov.dependencyinjection.example2.di.IdQualifier
import com.blinov.dependencyinjection.example2.di.NameQualifier
import com.blinov.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor (
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
    ): ViewModel() {

    fun method() {
        Log.d("ExampleViewModel", "$this $id $name")
        useCase()
    }
}