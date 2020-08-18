package com.example.hilt101.retrofit

import retrofit2.http.GET

interface BlogRetrofit {
    @GET("blogs")
    suspend fun get(): List<BlogNetworkEntity>
}