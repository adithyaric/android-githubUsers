package com.adithya.github.api

import com.adithya.github.data.model.DetailUserResponse
import com.adithya.github.data.model.User
import com.adithya.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization:b082949e2b8f06ec054563d89049516278fa321c")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization:b082949e2b8f06ec054563d89049516278fa321c")
    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization:b082949e2b8f06ec054563d89049516278fa321c")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization:b082949e2b8f06ec054563d89049516278fa321c")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>

}