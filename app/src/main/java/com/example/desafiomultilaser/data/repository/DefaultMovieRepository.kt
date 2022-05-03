package com.example.desafiomultilaser.data.repository

import com.example.desafiomultilaser.data.client.ApiClient
import com.example.desafiomultilaser.domain.boundary.MovieRepository
import com.example.desafiomultilaser.domain.entity.Movie

class DefaultMovieRepository constructor(
    private val apiClient: ApiClient
) : MovieRepository {

    override suspend fun getMoviesList(): List<Movie>? {
        return apiClient.getMoviesList()?.map { it.toDomainObject() }
    }
}