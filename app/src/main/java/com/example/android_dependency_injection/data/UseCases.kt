package com.example.android_dependency_injection.data

import android.util.Log
import javax.inject.Inject

class UseCases @Inject constructor(val repository: JordieeRepository, random : Random) {
    fun fetchDataFromDb() {
        Log.d("jordiee", "fetchData use case invoked")
        repository.fetchData()
    }
}