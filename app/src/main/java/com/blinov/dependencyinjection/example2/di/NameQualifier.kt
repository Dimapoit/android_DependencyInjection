package com.blinov.dependencyinjection.example2.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class NameQualifier()
