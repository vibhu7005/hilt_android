package com.example.android_dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_dependency_injection.data.JordieeRepository
import com.example.android_dependency_injection.data.UseCases
import com.example.android_dependency_injection.hilt.JordieeCallInterceptor

import com.example.android_dependency_injection.network.NetworkService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var jordieeUseCases: UseCases
    @Inject
    @JordieeCallInterceptor
    lateinit var networkService: NetworkService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jordieeUseCases.fetchDataFromDb()
        networkService.performNetworkCall()
    }

    @Inject
    fun fetchDataFromServer(jordieeRepository: JordieeRepository) {
        jordieeRepository.fetchDataFromServer()
    }
}