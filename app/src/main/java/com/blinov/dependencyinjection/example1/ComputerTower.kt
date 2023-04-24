package com.blinov.dependencyinjection.example1

import javax.inject.Inject

class ComputerTower @Inject constructor(
    val memory: Memory,
    val processor: Processor,
    val storage: Storage
)