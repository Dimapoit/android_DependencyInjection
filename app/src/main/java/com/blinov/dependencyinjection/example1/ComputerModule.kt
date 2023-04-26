package com.blinov.dependencyinjection.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideComputerTower(
        memory: Memory,
        processor: Processor,
        storage: Storage
    ): ComputerTower{
        return ComputerTower(memory, processor, storage)
    }

    @Provides
    fun provideComputer(
        computerTower: ComputerTower,
        keyboard: Keyboard,
        monitor: Monitor,
        mouse: Mouse
    ): Computer {
        return Computer(
            computerTower,
            keyboard,
            monitor,
            mouse
        )
    }
}