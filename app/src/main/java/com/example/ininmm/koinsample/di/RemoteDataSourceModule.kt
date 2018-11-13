package com.example.ininmm.koinsample.di

import com.example.ininmm.koinsample.data.source.BookDataSource
import com.example.ininmm.koinsample.data.source.BookRemoteDataSource
import org.koin.dsl.module.module

val remoteDataSourceModule = module {
    single<BookDataSource>("RemoteData", createOnStart = true) { BookRemoteDataSource() }
}