package com.blinov.dependencyinjection.example2.data.datasourse

import android.util.Log
import com.blinov.dependencyinjection.example2.data.network.ExampleApiService
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor (
    private val apiService: ExampleApiService
    ): ExampleRemoteDataSource {

    override fun method() {
        Log.d("TestRemoteDataSource", "test")
    }
}