package com.example.android_dependency_injection

import android.app.Application
import com.example.android_dependency_injection.hilt.JordieeCallInterceptor
import com.example.android_dependency_injection.network.NetworkService
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//mandatory for hilt
@HiltAndroidApp
class JordieeApplication : Application() {

    @Inject
    @JordieeCallInterceptor
    lateinit var networkService: NetworkService
}