package com.blinov.dependencyinjection.example1

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}