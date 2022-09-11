package com.pramod.mvvmtoken.network

import com.pramod.mvvmtoken.response.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApi {

    @FormUrlEncoded
    @POST("")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse



}
