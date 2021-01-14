package com.adithya.github.api

import com.adithya.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token c7dcab3f592218e9d02498407e4b98135bb27eda")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>
}