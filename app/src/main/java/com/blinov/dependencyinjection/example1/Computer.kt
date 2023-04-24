package com.blinov.dependencyinjection.example1

import javax.inject.Inject

class Computer @Inject constructor(
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val monitor: Monitor,
    val mouse: Mouse
)