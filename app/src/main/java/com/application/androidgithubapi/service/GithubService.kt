package com.application.androidgithubapi.service

import com.application.androidgithubapi.model.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by PwS on 6/25/2020
 */
interface GithubService {
    @GET("users?")
    fun getUsers(
        @Query("per_page") perPage: Int,
        @Query("page") page: Int
    ): Call<List<GithubUser?>?>?

    @GET("/users/{username}")
    fun getUser(@Path("username") username: String?): Call<GithubUser?>?
}