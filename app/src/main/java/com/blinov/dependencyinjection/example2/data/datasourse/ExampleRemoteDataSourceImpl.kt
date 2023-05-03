package com.blinov.dependencyinjection.example2.data.datasourse

import com.blinov.dependencyinjection.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor (
    private val apiService: ExampleApiService
    ): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}