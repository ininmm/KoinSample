package com.example.ininmm.koinsample.utils

import java.util.concurrent.Executor

interface IAppExecutors {

    fun diskIO(): Executor

    fun networkIO(): Executor

    fun mainThread(): Executor
}