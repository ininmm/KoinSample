package com.example.ininmm.koinsample.di

import com.example.ininmm.koinsample.data.repository.BookRepository
import com.example.ininmm.koinsample.data.source.BookDataSource
import com.example.ininmm.koinsample.data.source.BookLocalDataSource
import com.example.ininmm.koinsample.data.source.BookRemoteDataSource
import com.example.ininmm.koinsample.main.MainContract
import com.example.ininmm.koinsample.main.MainPresenter
import com.example.ininmm.koinsample.utils.AppExecutors
import com.example.ininmm.koinsample.utils.IAppExecutors
import org.koin.dsl.module.module

val koinSampleModule = module {

    single<IAppExecutors>(createOnStart = true) { AppExecutors() }
}

val koinApp = listOf(koinSampleModule,
    presenterModule,
    repositoryModule,
    localDataSourceModule,
    remoteDataSourceModule,
    roomModule)