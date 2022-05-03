package com.example.desafiomultilaser.presentation.di

import com.example.desafiomultilaser.data.repository.DefaultMovieRepository
import com.example.desafiomultilaser.domain.boundary.MovieRepository
import org.koin.dsl.module

fun repositoryModule() = module {

    single {
        DefaultMovieRepository(get())
    }
}