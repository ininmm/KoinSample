package com.example.ininmm.koinsample

import android.app.Application
import com.example.ininmm.koinsample.di.koinApp
import org.koin.android.ext.android.startKoin
import org.koin.android.logger.AndroidLogger

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin context
        startKoin(this, koinApp, logger = AndroidLogger(showDebug = true))
        
    }
}