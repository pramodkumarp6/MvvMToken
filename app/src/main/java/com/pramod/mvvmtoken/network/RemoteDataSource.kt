package com.pramod.mvvmtoken.network


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RemoteDataSource @Inject constructor() {

    companion object {
        private const val BASE_URL = "https://apix.simplifiedcoding.in/api/"
    }


    fun<Api> buidApi(api:Class<Api>):Api{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)


    }
}