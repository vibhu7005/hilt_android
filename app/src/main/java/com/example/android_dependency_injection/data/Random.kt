package com.example.android_dependency_injection.data

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Random @Inject constructor(@ApplicationContext private val context : Context) {
}