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
    @Headers("Authorization: token fafa1799944d94097a43a24c408620107fd5e383")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token fafa1799944d94097a43a24c408620107fd5e383")
    fun getUserDetail(
            @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token fafa1799944d94097a43a24c408620107fd5e383")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token fafa1799944d94097a43a24c408620107fd5e383")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>

}