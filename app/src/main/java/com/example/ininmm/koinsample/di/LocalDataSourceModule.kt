package com.example.ininmm.koinsample.di

import com.example.ininmm.koinsample.data.source.BookDataSource
import com.example.ininmm.koinsample.data.source.BookLocalDataSource
import org.koin.dsl.module.module

val localDataSourceModule = module {
    single<BookDataSource>("LocalData") { BookLocalDataSource(get(), get()) }
}