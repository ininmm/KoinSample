package com.example.ininmm.koinsample.di

import com.example.ininmm.koinsample.main.MainContract
import com.example.ininmm.koinsample.main.MainPresenter
import org.koin.dsl.module.module

val presenterModule = module {
    // Presenter
    factory<MainContract.Presenter> {
            (view: MainContract.View) -> MainPresenter(get("repository"), view = view)
    }
}