package com.example.desafiomultilaser.presentation.di

import com.example.desafiomultilaser.domain.usecase.GetMoviesList
import org.koin.dsl.module

fun useCaseModule() = module {

    single {
        GetMoviesList(get())
    }

}