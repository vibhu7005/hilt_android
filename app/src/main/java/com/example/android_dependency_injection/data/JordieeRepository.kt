package com.example.android_dependency_injection.data

import android.util.Log
import javax.inject.Inject


class JordieeRepository @Inject constructor() {
    fun fetchData() {
        Log.d("jordiee", "fetch data from repo")
    }

    fun fetchDataFromServer() {
        Log.d("jordiee", "fetch data from Server")
    }


}