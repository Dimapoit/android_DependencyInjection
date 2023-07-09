package com.blinov.dependencyinjection.example2.di

import com.blinov.dependencyinjection.example2.data.datasourse.ExampleLocalDataSource
import com.blinov.dependencyinjection.example2.data.datasourse.ExampleLocalDataSourceImpl
import com.blinov.dependencyinjection.example2.data.datasourse.ExampleRemoteDataSource
import com.blinov.dependencyinjection.example2.data.datasourse.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(mpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}