package com.blinov.dependencyinjection.example1

class Component {

    private fun getComputer(): Computer {

        val computerTower = ComputerTower(Memory(), Processor(), Storage())

        val keyboard = Keyboard()
        val mouse = Mouse()
        val monitor = Monitor()

        return Computer(computerTower, keyboard, monitor, mouse)
    }

    fun inject(activity: Activity) {
        //activity.computer = getComputer()
        //activity.keyboard = Keyboard()
    }
}