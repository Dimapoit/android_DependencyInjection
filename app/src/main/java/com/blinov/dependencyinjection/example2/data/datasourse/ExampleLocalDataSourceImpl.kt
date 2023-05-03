package com.blinov.dependencyinjection.example2.data.datasourse

import com.blinov.dependencyinjection.example2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor (
    private val database: ExampleDatabase
    ): ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}