package com.example.desafiomultilaser.domain.usecase

import com.example.desafiomultilaser.domain.boundary.MovieRepository
import com.example.desafiomultilaser.domain.entity.Movie

interface IGetMoviesList {
    suspend fun getUsersList(): List<Movie?>?
}

class GetMoviesList(private val repository: MovieRepository) : IGetMoviesList {
    override suspend fun getUsersList(): List<Movie?>? {
        return repository.getMoviesList()
    }
}