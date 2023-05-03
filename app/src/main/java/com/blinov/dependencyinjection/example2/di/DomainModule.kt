package com.blinov.dependencyinjection.example2.di

import com.blinov.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.blinov.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}