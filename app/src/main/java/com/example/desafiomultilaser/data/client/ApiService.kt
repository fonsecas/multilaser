package com.example.desafiomultilaser.data.client

import com.example.desafiomultilaser.data.entity.ApiMovie
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("movie/550/")
    suspend fun getMoviesList(): Response<List<ApiMovie>>
}