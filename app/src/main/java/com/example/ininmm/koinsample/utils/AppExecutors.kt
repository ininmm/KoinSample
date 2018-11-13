package com.example.ininmm.koinsample.utils

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

open class AppExecutors(private val diskIO: Executor = Executors.newFixedThreadPool(3),
                   private val networkIO: Executor = MainThreadExecutor(),
                   private val mainThread: Executor = MainThreadExecutor()) : IAppExecutors {
    override fun diskIO(): Executor {
        return diskIO
    }

    override fun networkIO(): Executor {
        return networkIO
    }

    override fun mainThread(): Executor {
        return mainThread
    }

    private class MainThreadExecutor : Executor {
        private val mainThreadHandler = Handler(Looper.getMainLooper())
        override fun execute(command: Runnable?) {
            mainThreadHandler.post(command)
        }
    }
}