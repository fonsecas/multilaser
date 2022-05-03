package com.example.desafiomultilaser.data.entity

import com.example.desafiomultilaser.domain.entity.Movie
import com.google.gson.annotations.SerializedName

data class ApiMovie(
    @SerializedName("name") val name: String,
    @SerializedName("id") val id: Int,
) {

    fun toDomainObject() = Movie(
        id = id,
        name = name,
    )
}