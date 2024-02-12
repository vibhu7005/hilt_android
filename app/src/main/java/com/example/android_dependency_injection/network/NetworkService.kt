package com.example.android_dependency_injection.network

import java.nio.file.attribute.AclEntry.Builder

class NetworkService private constructor(builder : Builder) {
    var protocol : String? = null
    var host : String? = null
    var path : String? = null
    var interceptor : Interceptor? = null

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.interceptor = builder.interceptor
    }

    class Builder {
        var protocol : String? = null
            private set
        var host : String? = null
            private set
        var path : String? = null
            private set
        var interceptor : Interceptor? = null
            private set

        fun protocol(protocol : String) = apply { this.protocol = protocol }
        fun host(host: String) = apply { this.host = host}
        fun path(path: String) = apply { this.path = path}
        fun interceptor(interceptor: Interceptor) = apply { this.interceptor = interceptor}
        fun build() = NetworkService(this)

    }



}