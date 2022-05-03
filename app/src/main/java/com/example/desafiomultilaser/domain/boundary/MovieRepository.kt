package com.example.desafiomultilaser.domain.boundary

import com.example.desafiomultilaser.domain.entity.Movie

interface MovieRepository {
    suspend fun getMoviesList(): List<Movie>?
}