package com.example.midtermtwo

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {
    @GET("api/")
    suspend fun getUsers(@Query("results") count: Int): Response<RandomUserResponse>
}

data class RandomUserResponse(
    val results: List<User>
)