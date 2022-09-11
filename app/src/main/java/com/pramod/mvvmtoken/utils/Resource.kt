package com.pramod.mvvmtoken.utils

import okhttp3.ResponseBody

sealed class Resource<out T>{
    data class Success<out T>(val value: T):Resource<T>()
    data class Failure( val isNetworkError:Boolean,
                         val ErrorCode:Int?,
                         val erroBody: ResponseBody?
                         ):Resource<Nothing>()

}
