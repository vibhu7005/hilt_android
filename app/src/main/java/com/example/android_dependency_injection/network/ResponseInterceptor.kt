package com.example.android_dependency_injection.network

import android.util.Log
import javax.inject.Inject

class ResponseInterceptor @Inject constructor() : Interceptor {
    override fun log(msg: String) {
        Log.d("jordiee", "this is response interceptor")
    }
}