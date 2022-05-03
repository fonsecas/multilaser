package com.example.desafiomultilaser.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.desafiomultilaser.domain.entity.Movie
import com.example.desafiomultilaser.domain.usecase.GetMoviesList
import com.example.desafiomultilaser.presentation.util.base.BaseViewModel

class MainViewModel constructor(
    private val interector: GetMoviesList,
) : BaseViewModel() {

    val movies: LiveData<List<Movie?>?> get() = _movies

    private val _movies by lazy { MutableLiveData<List<Movie?>?>() }

    init {
        getMovies()
    }

    fun getMovies() {
        launchDataLoad {
            _movies.value = interector.execute()
        }
    }


}