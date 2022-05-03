package com.example.desafiomultilaser.presentation.di

import com.example.desafiomultilaser.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun viewModelModule() = module {

    viewModel {
        MainViewModel(get())
    }

}