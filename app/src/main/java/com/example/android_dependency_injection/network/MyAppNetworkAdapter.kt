package com.example.android_dependency_injection.network

import android.util.Log
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor(var s : Int) : NetworkAdapter{
    override fun log(message: String) {
        Log.d("jordiee", "MyAppNetworkAdapter :$message")
    }
}