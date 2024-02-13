package com.example.android_dependency_injection.hilt

import com.example.android_dependency_injection.network.CallInterceptor
import com.example.android_dependency_injection.network.MyAppNetworkAdapter
import com.example.android_dependency_injection.network.NetworkAdapter
import com.example.android_dependency_injection.network.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent ::class)
class NetworkModule {
//    @Binds
//    abstract fun bindNetworkAdapter(adapter : MyAppNetworkAdapter) : NetworkAdapter

    @Provides
    fun provideNetworkService() : NetworkService {
        return NetworkService.Builder().host("jordiee")
            .path("/jordiee/world")
            .interceptor(CallInterceptor())
            .build()
    }
}