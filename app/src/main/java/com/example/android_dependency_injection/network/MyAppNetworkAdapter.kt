package com.example.android_dependency_injection.network

import android.content.Context
import android.util.Log
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor(var s : Int, context : Context) : NetworkAdapter{
    override fun log(message: String) {
        Log.d("jordiee", "MyAppNetworkAdapter :$message")
    }
}