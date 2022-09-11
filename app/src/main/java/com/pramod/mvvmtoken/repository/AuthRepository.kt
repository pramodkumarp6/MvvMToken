package com.pramod.mvvmtoken.repository

import com.pramod.mvvmtoken.network.AuthApi

class AuthRepository(private val api:AuthApi):BaseRepository(){

    suspend  fun loin(email:String,

             password:String)=safeCall { api.login(email,password) }
}