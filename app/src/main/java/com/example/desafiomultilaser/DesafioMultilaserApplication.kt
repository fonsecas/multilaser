package com.example.desafiomultilaser

import android.app.Application
import com.example.desafiomultilaser.presentation.di.networkingModule
import com.example.desafiomultilaser.presentation.di.repositoryModule
import com.example.desafiomultilaser.presentation.di.useCaseModule
import com.example.desafiomultilaser.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DesafioMultilaserApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DesafioMultilaserApplication)
            modules(
                listOf(
                    repositoryModule(),
                    useCaseModule(),
                    viewModelModule(),
                    networkingModule()
                )
            )
        }
    }
}