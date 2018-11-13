package com.example.ininmm.koinsample.di

import com.example.ininmm.koinsample.data.repository.BookRepository
import com.example.ininmm.koinsample.data.source.BookDataSource
import org.koin.dsl.module.module

val repositoryModule = module {
    single<BookDataSource>(name = "repository", createOnStart = true) {
        BookRepository(get("LocalData"), get("RemoteData"), get())
    }
}
