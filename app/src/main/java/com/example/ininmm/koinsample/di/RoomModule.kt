package com.example.ininmm.koinsample.di

import androidx.room.Room
import com.example.ininmm.koinsample.data.KoinDataBase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

val roomModule = module {

    // Room Database
    single {
        Room.inMemoryDatabaseBuilder(androidApplication(), KoinDataBase::class.java).build()
    }

    // BookDao
    single { get<KoinDataBase>().bookDao() }
}