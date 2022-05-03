package com.example.desafiomultilaser.data.client

import com.example.desafiomultilaser.data.entity.ApiMovie
import com.example.desafiomultilaser.data.util.request.RequestHandler

class ApiClient constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getMoviesList(): List<ApiMovie>?{
        return makeRequest(apiService.getMoviesList())
    }
}