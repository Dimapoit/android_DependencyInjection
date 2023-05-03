package com.blinov.dependencyinjection.example2.data.repository

import com.blinov.dependencyinjection.example2.data.datasourse.ExampleLocalDataSource
import com.blinov.dependencyinjection.example2.data.datasourse.ExampleRemoteDataSource
import com.blinov.dependencyinjection.example2.data.mapper.ExampleMapper
import com.blinov.dependencyinjection.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor (
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
): ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}