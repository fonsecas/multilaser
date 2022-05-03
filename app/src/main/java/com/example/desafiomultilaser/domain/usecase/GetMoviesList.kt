package com.example.desafiomultilaser.domain.usecase

import com.example.desafiomultilaser.domain.boundary.MovieRepository
import com.example.desafiomultilaser.domain.entity.Movie
//
//interface IGetMoviesList {
//    suspend fun getMoviesList(): List<Movie?>?
//}
//
//class GetMoviesList(private val repository: MovieRepository) : IGetMoviesList {
//    override suspend fun getMoviesList(): List<Movie?>? {
//        return repository.getMoviesList()
//    }


class GetMoviesList constructor(
    private val movieRepository: MovieRepository
) {

    suspend fun execute() = movieRepository.getMoviesList()
}