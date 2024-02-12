package com.example.android_dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android_dependency_injection.data.JordieeRepository
import com.example.android_dependency_injection.data.UseCases
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var jordieeUseCases: UseCases
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jordieeUseCases.fetchDataFromDb()
    }

    @Inject
    fun fetchDataFromServer(jordieeRepository: JordieeRepository) {
        jordieeRepository.fetchDataFromServer()
    }
}