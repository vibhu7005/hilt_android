package com.example.android_dependency_injection.hilt

import javax.inject.Qualifier



@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class JordieeResponseIntereptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class JordieeCallInterceptor


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Jordiee