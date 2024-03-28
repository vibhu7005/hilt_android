package com.example.android_dependency_injection.hilt

import android.content.Context
import com.example.android_dependency_injection.network.CallInterceptor
import com.example.android_dependency_injection.network.MyAppNetworkAdapter
import com.example.android_dependency_injection.network.NetworkAdapter
import com.example.android_dependency_injection.network.NetworkService
import com.example.android_dependency_injection.network.ResponseInterceptor
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent ::class, ViewComponent::class)
class NetworkModule {
//    @Binds
//    abstract fun bindNetworkAdapter(adapter : MyAppNetworkAdapter) : NetworkAdapter

    @Provides
    fun provideNetworkAdapter(@ApplicationContext context : Context) : NetworkAdapter {
        return MyAppNetworkAdapter(4, context)
    }


    @Provides
    @JordieeCallInterceptor
    fun provideCallNetworkService() : NetworkService {
        return NetworkService.Builder().host("jordiee")
            .path("/jordiee/world")
            .interceptor(CallInterceptor())
            .build()
    }

    @Provides
    @JordieeResponseIntereptor
    fun provideResponseNetworkService() : NetworkService {
        return NetworkService.Builder().host("jordiee")
            .path("/jordiee/world")
            .interceptor(ResponseInterceptor())
            .build()
    }
}